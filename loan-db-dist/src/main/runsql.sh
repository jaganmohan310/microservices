#!/bin/bash

## SQL Scripts File Path ##
ddlscriptsDirectory='ddl'
dmlscriptsDirectory='dml'

## Database details ##
USERNAME='loan_sys'
PASSWORD='loan_sys'
SID='eoscrd01'

## Date format ##
NOW=$(date +"%F")
NOWT=$(date +"%T")

## Log File ##
LOGFILE=AAN-$NOW-$NOWT.log

## Connecting to database ##
sqlplus -s ${USERNAME}/${PASSWORD}@${SID}<<! >> $LOGFILE

ALTER SESSION SET NLS_DATE_LANGUAGE='ENGLISH';

@${ddlscriptsDirectory}/Customer_Drop.sql


@${ddlscriptsDirectory}/Customer_Create.sql

exit;
!
