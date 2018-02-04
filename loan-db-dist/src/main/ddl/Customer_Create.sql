
-- Script Name: Create table and constraints script for loan system
-- Purpose: To create one table and  constraint.
-- Author: e230734
-- Date: 04-Feb-2018

----------------------------------------------------------------------------------------
-- DDL for Creating Tables
----------------------------------------------------------------------------------------

CREATE TABLE CUSTOMER_SEARCH 
(
    CUSTOMER_ID  	NUMBER(35) NOT NULL,
    CUSTOMER_NAME   VARCHAR2(35) NOT NULL,
    PANCARD_NUMBER  VARCHAR2(35) NOT NULL
)
/

--------------------------------------------------------
--  Constraints for Table CUSTOMER_SEARCH
--------------------------------------------------------

ALTER TABLE CUSTOMER_SEARCH ADD CONSTRAINT CUSTOMER_ID
/	