-- Script Name: Incrementing sequence value for LOAN_SYS sequences
-- Purpose: To increase the sequence value by one for Microservices environment of LOAN_SYS sequences
-- Author: e230734
-- Date: 04-Feb-2018

DECLARE
  SEQ_NUM NUMBER := 0;
BEGIN

    SELECT CUSTOMER_SEARCH.NEXTVAL INTO SEQ_NUM FROM DUAL;
	
END;
/