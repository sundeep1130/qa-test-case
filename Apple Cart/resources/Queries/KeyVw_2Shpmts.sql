DELETE FROM INT_SCHEMA.INTL_APPLIED_RESN WHERE INTL_SHPMT_NBR IN (1005559901,1005559902);
DELETE FROM INT_SCHEMA.INTL_SHPMT WHERE INTL_SHPMT_NBR IN (1005559901,1005559902);
DELETE FROM INT_SCHEMA.INTL_CONS_SHPMT WHERE CONS_SHPMT_NBR IN (1005559901,1005559902);

Insert into INT_SCHEMA.INTL_SHPMT (INTL_SHPMT_NBR, SHPR_ID, ORIG_CNTRY_CD, DEST_CNTRY_CD, MSTR_TRKNG_ID, CONS_SHPMT_NBR, SHPMT_VALUE_CAN_AMT, SHPMT_VALUE_US_AMT, SETLM_CURR_CD, CREATED_BY_NM, CREATED_DT, UPDATED_BY_NM, UPDATED_DT, RECP_ID, DATA_ENTR_DT, TENDR_DT,  ENTRP_DOC_MGR_FLD_ID, LOCK_TMSTP)
  values(1005559901, 1000000281, 840, 124, '1005559901', NULL, 9.99, 8.99, 'CAD', 'ATT', current_timestamp, 'ATT', current_timestamp, 1000000254, NULL, current_timestamp, 'TESTFID1', NULL );  
Insert into INT_SCHEMA.INTL_SHPMT (INTL_SHPMT_NBR, SHPR_ID, ORIG_CNTRY_CD, DEST_CNTRY_CD, MSTR_TRKNG_ID, CONS_SHPMT_NBR, SHPMT_VALUE_CAN_AMT, SHPMT_VALUE_US_AMT, SETLM_CURR_CD, CREATED_BY_NM, CREATED_DT, UPDATED_BY_NM, UPDATED_DT, RECP_ID, DATA_ENTR_DT, TENDR_DT,  ENTRP_DOC_MGR_FLD_ID, LOCK_TMSTP)
  values(1005559902, 1000000281, 840, 124, '1005559902', NULL, 9.99, 8.99, 'CAD', 'ATT', current_timestamp, 'ATT', current_timestamp, 1000000254, NULL, current_timestamp, 'TESTFID1', NULL );  
  
 COMMIT;