Run loan-db in Locally:

mvn integration-test -Plocal -Ddrop-ddl=true -Dcreate-ddl=true -Dinsert-sql=true

Db admin:sql-plus:

sys/sys as sysdba
alter session set "_oracle_script"=true;

customer_search :

create user customer_search identified by customer_search;
grant connect,resource to customer_search;
alter user customer_search quota unlimited on users;


loan_account_create :

create user loan_account_create identified by loan_account_create;
grant connect,resource to loan_account_create;
alter user loan_account_create quota unlimited on users;


loan_customer_documents: 

create user loan_customer_documents identified by loan_customer_documents;
grant connect,resource to loan_customer_documents;
alter user loan_customer_documents quota unlimited on users;

customer_create: 

create user customer_create identified by customer_create;
grant connect,resource to customer_create;
alter user customer_create quota unlimited on users;

product_create: 

create user product_create identified by product_create;
grant connect,resource to product_create;
alter user product_create quota unlimited on users;
