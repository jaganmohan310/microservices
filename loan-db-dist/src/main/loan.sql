define loan_ddl =ddl
define loan_dml =dml

@&loan_ddl\Customer_Drop.sql

@&loan_ddl\Customer_Create.sql

@&loan_ddl\Customer_Sequence_Increment.sql

@&loan_dml\Customer_data.sql

commit;
quit