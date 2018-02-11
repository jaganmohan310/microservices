
-- Script Name: Create table and constraints script for loan system
-- Purpose: To create one table and  constraint.
-- Author: e230734
-- Date: 04-Feb-2018

----------------------------------------------------------------------------------------
-- DDL for Creating Tables
----------------------------------------------------------------------------------------

CREATE TABLE PRODUCT_CREATE 
(
    PRODUCT_ID 	       NUMBER(35) NOT NULL,
    PRODUCT_TYPE       VARCHAR2(35) NOT NULL,
    PRODUCT_NAME       VARCHAR2(35) NOT NULL,
    INTEREST_RATE      NUMBER(10) NOT NULL,
    PRODUCT_STATUS     VARCHAR2(35) NOT NULL,
    MIN_LOAN_TENURE    NUMBER(10) NOT NULL,
    MAX_LOAN_TENURE    NUMBER(10) NOT NULL,
    MIN_LOAN_AMOUNT    NUMBER(10) NOT NULL,
    MAX_LOAN_AMOUNT    VARCHAR2(10) NOT NULL
)

/

--------------------------------------------------------
--  Constraints for Table CUSTOMER_SEARCH
--------------------------------------------------------

ALTER TABLE PRODUCT_CREATE ADD CONSTRAINT PK_PRODUCT_ID
	PRIMARY KEY (PRODUCT_ID)
/
CREATE SEQUENCE PRODUCT_CREATE_SEQ
	START WITH	1
	INCREMENT BY	1
	NOCACHE
	NOCYCLE
/