
-- Script Name: Create table and constraints script for loan system
-- Purpose: To create one table and  constraint.
-- Author: e230734
-- Date: 04-Feb-2018

----------------------------------------------------------------------------------------
-- DDL for Creating Tables
----------------------------------------------------------------------------------------

CREATE TABLE ACCOUNT_CREATE 
(
    ACCOUNT_NUMBER	           NUMBER(35) NOT NULL,
    ACCOUNT_NAME               VARCHAR2(35) NOT NULL,
	CUSTOMER_ID               VARCHAR2(35) NOT NULL,
	PRODUCT_TYPE               VARCHAR2(35) NOT NULL,
    APPROVED_LOAN_AMOUNT       NUMBER(35) NOT NULL,
    INTEREST_RATE              NUMBER(10) NOT NULL,
    LOAN_TENURE                NUMBER(35) NOT NULL,
    DISBURSED_LOAN_AMOUNT      NUMBER(10) NOT NULL,
    FIRST_NEXT_INSTALLMENT_AMOUNT    NUMBER(10) NOT NULL,
    FIRST_NEXT_INSTALLMENT_DATE    VARCHAR2(100) NOT NULL,
    ARREARS                    VARCHAR2(10) NOT NULL,
    CHARGES                    NUMBER(10) NOT NULL
)
/

--------------------------------------------------------
--  Constraints for Table CUSTOMER_SEARCH
--------------------------------------------------------

ALTER TABLE ACCOUNT_CREATE ADD CONSTRAINT PK_ACCOUNT_NUMBER 
	PRIMARY KEY (ACCOUNT_NUMBER)
/
