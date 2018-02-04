 
declare
    l_exist number;
begin
    select count(*) into l_exist from USER_OBJECTS where UPPER(OBJECT_TYPE) = 'PACKAGE BODY' and UPPER(OBJECT_NAME)='USER_GRANT';
   
    if (l_exist>0) then
        execute immediate ('begin USER_GRANT.grantToRoles; end;');
    end if;
end;
