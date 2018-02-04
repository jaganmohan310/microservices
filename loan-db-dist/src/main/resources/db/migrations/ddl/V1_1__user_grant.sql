  CREATE OR REPLACE PACKAGE "USER_GRANT" AS 
    APP_NAME       CONSTANT  varchar2(3) := 'IFW';
    SUPP_USR       CONSTANT  varchar2(7) := 'IFWSUPP';
    DATA_USR       CONSTANT  varchar2(7) := 'IFWDATA';
    ROLE_NAME_RW   CONSTANT  varchar2(6) := 'IFW_RW';
    ROLE_NAME_RO   CONSTANT  varchar2(6) := 'IFW_RO';

    procedure grantToRoles;
END;
/
--------------------------------------------------------
--  DDL for Package Body USER_GRANT
--------------------------------------------------------
CREATE OR REPLACE PACKAGE BODY "USER_GRANT" AS 
    PROCEDURE log(txt_i IN varchar2) AS
    BEGIN
       dbms_output.put_line(txt_i);
    END;

    PROCEDURE grant_to_roles(obj_name_i IN varchar2, obj_type_i IN varchar2) AS 
       l_sql varchar2(200);
    BEGIN
       -- Grant to RW role
       l_sql := 'GRANT ' || case obj_type_i when 'TABLE'     then 'SELECT, INSERT, UPDATE, DELETE'
                                            when 'VIEW'      then 'SELECT'
                                            when 'SEQUENCE'  then 'SELECT'
                                                             else 'EXECUTE' end || 
                        ' ON ' || obj_name_i || ' TO ' || ROLE_NAME_RW; 
       begin
          execute immediate l_sql;
          log('Grant towards ' || obj_name_i || ' to ' || ROLE_NAME_RW || ' completed successfully.');
       exception when others then
          log('ERROR: Grant towards' || obj_name_i || ' to ' || ROLE_NAME_RW || ' failed: ' || SQLERRM);
       end;

       -- Grant to RO role if table or view
       if obj_type_i in ('TABLE','VIEW') then 
          l_sql := 'GRANT SELECT ON ' || obj_name_i || ' TO ' || ROLE_NAME_RO; 
          begin
             execute immediate l_sql;
             log('Grant towards ' || obj_name_i || ' to ' || ROLE_NAME_RO || ' completed successfully.');
          exception when others then
             log('ERROR: Grant towards' || obj_name_i || ' to ' || ROLE_NAME_RO || ' failed: ' || SQLERRM);
          end;
       end if;
    END;

    PROCEDURE grantToRoles is
    BEGIN 
       dbms_output.enable(1000000);
       FOR rec IN ( SELECT object_name,  object_type  FROM user_objects
                    WHERE object_type IN ('TABLE','PACKAGE','PROCEDURE','FUNCTION','SEQUENCE','VIEW','TYPE')
                      AND NOT (object_type like '%PACKAGE%' and object_name='USER_GRANT'))
       LOOP
          BEGIN
             grant_to_roles(rec.object_name, rec.object_type);
          EXCEPTION WHEN others THEN
             dbms_output.   put_line('Bad object_name='  || rec.object_name);
          END;
       END LOOP;
    END;
END;
/
--------------------------------------------------------
--  DDL for Synonymn GRANTTOROLES
--------------------------------------------------------
CREATE OR REPLACE SYNONYM "GRANTTOROLES" FOR "USER_GRANT";
