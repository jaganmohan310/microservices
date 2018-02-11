
-- Script Name: Create table and constraints script for loan system
-- Purpose: To create one table and  constraint.
-- Author: e230734
-- Date: 04-Feb-2018

----------------------------------------------------------------------------------------
-- DDL for Creating Tables
----------------------------------------------------------------------------------------

CREATE TABLE CUSTOMER_DOCUMENTS 
(
    DOCUMENT_ID	       NUMBER(35) NOT NULL,
    DOCUMENT_NAME      VARCHAR2(35) NOT NULL,
    DOCUMENT_TYPE       VARCHAR2(100) NOT NULL,
    DOCUMENT_VALID_FROM              VARCHAR2(100) NOT NULL,
    DOCUMENT_VALID_TO               VARCHAR2(100) NOT NULL,
    DOCUMENT_STATUS     VARCHAR2(100) NOT NULL
   
)
/

--------------------------------------------------------
--  Constraints for Table CUSTOMER_DOCUMENTS
--------------------------------------------------------

ALTER TABLE CUSTOMER_DOCUMENTS ADD CONSTRAINT PK_DOCUMENT_ID 
	PRIMARY KEY (DOCUMENT_ID)
/
