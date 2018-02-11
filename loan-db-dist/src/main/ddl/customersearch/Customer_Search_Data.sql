-- Script Name: Drop Scripts for CUSTOMER_SEARCH table and constraint
-- Purpose: To drop table and constraint
-- Author: e230734
-- Date: 04-Feb-2018

DECLARE
	CNT NUMBER := 0;
BEGIN

---------------------------------------------------------------------------------------
-- Table DROP script
---------------------------------------------------------------------------------------

	SELECT COUNT(*) INTO CNT FROM USER_TABLES WHERE TABLE_NAME='CUSTOMER_SEARCH';
	IF (CNT = 1) THEN
		EXECUTE IMMEDIATE 'DROP TABLE CUSTOMER_SEARCH CASCADE CONSTRAINT';
		CNT := 0;
	END IF;

	
END;
/