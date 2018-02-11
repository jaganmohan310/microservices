
-- Script Name: Create table and constraints script for loan system
-- Purpose: To create one table and  constraint.
-- Author: e230734
-- Date: 04-Feb-2018

----------------------------------------------------------------------------------------
-- DDL for Creating Tables
----------------------------------------------------------------------------------------

CREATE TABLE CUSTOMER_CREATE 
(
    CUSTOMER_ID  	NUMBER(35) NOT NULL,
    FIRST_NAME      VARCHAR2(35) NOT NULL,
    LAST_NAME       VARCHAR2(35) NOT NULL,
    DATE_OF_BIRTH   DATE NOT NULL,
    GENDER          char(1) NOT NULL,
    CONTACT_NUMBER  VARCHAR2(35) NOT NULL,
    EMAILID         VARCHAR2(35) NOT NULL,
    SOCIAL_SECURITY_ID VARCHAR2(35) NOT NULL,
    RESIDENTIAL_ADDRESS VARCHAR2(250) NOT NULL,
    COMMUNICATION_ADDRESS VARCHAR2(250) NOT NULL,
    KYC_STATUS   VARCHAR2(10) NOT NULL,
    CREDIT_SCORE   NUMBER(35) NOT NULL)


/

--------------------------------------------------------
--  Constraints for Table CUSTOMER_CREATE
--------------------------------------------------------

ALTER TABLE CUSTOMER_CREATE ADD CONSTRAINT PK_CREATE_CUSTOMER_ID 
	PRIMARY KEY (CUSTOMER_ID)
/
CREATE SEQUENCE CUSTOMER_CREATE_SEQ
	START WITH	1
	INCREMENT BY	1
	NOCACHE
	NOCYCLE
/