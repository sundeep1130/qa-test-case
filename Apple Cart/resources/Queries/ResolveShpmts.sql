DELETE FROM INT_SCHEMA.INTL_APPLIED_RESN WHERE INTL_SHPMT_NBR IN (100333021,100333022,100333023,100333024);
DELETE FROM INT_SCHEMA.INTL_SHPMT WHERE INTL_SHPMT_NBR IN (100333021,100333022,100333023,100333024);

Insert into INT_SCHEMA.INTL_SHPMT (INTL_SHPMT_NBR,CREATED_BY_NM,CREATED_DT,UPDATED_BY_NM,UPDATED_DT,SHPR_ID,ORIG_CNTRY_CD,DEST_CNTRY_CD,MSTR_TRKNG_ID,CONS_SHPMT_NBR,BRKR_ID,RECP_ID,IMPR_ID,BUYR_ID,STAT_CD,EST_DEL_DT,ENTRP_DOC_MGR_FLD_ID,ORIG_GTWY_IORG,DEST_GTWY_IORG,SETLM_CURR_CD,SHPMT_VALUE_CAN_AMT,SHPMT_VALUE_US_AMT,SHPMT_WGT,SHIP_DT,SHPMT_PURP_CD,CONS_EXCLN_RESN_CD,DUTY_TAX_PAYOR_CD,BRKR_REQRD_FLG,BRKR_INCLV_FLG,DATA_ENTR_DT,SHPMT_WGT_MEAS_UNIT_CD,TENDR_DT,LOCK_TMSTP,DATA_ENTRD_USER,ORIG_IORG) values 
(100333021,'Test',current_timestamp,'Test',current_timestamp,1000000044,840,124,'100333021',null,null,1000000254,null,null,null,null,null,null,null,'CAD',19.99,17.99,null,null,null,null,null,null,null,null,null,current_timestamp,current_timestamp,null,'152');
Insert into INT_SCHEMA.INTL_APPLIED_RESN (APPLIED_RESN_ID, CREATED_BY_NM, CREATED_DT, UPDATED_BY_NM, UPDATED_DT, RESN_ID, ACT_RESN_FLG, APPLIED_RESN_USER, INTL_SHPMT_NBR, CONS_SHPMT_NBR)
  values(1111, 'Test', current_timestamp, 'Test', current_timestamp, '45', 'Y', 'Test',  100333021, NULL); 

Insert into INT_SCHEMA.INTL_SHPMT (INTL_SHPMT_NBR,CREATED_BY_NM,CREATED_DT,UPDATED_BY_NM,UPDATED_DT,SHPR_ID,ORIG_CNTRY_CD,DEST_CNTRY_CD,MSTR_TRKNG_ID,CONS_SHPMT_NBR,BRKR_ID,RECP_ID,IMPR_ID,BUYR_ID,STAT_CD,EST_DEL_DT,ENTRP_DOC_MGR_FLD_ID,ORIG_GTWY_IORG,DEST_GTWY_IORG,SETLM_CURR_CD,SHPMT_VALUE_CAN_AMT,SHPMT_VALUE_US_AMT,SHPMT_WGT,SHIP_DT,SHPMT_PURP_CD,CONS_EXCLN_RESN_CD,DUTY_TAX_PAYOR_CD,BRKR_REQRD_FLG,BRKR_INCLV_FLG,DATA_ENTR_DT,SHPMT_WGT_MEAS_UNIT_CD,TENDR_DT,LOCK_TMSTP,DATA_ENTRD_USER,ORIG_IORG) values 
(100333022,'Test',current_timestamp,'Test',current_timestamp,1000000044,840,124,'100333022',null,null,1000000254,null,null,null,null,null,null,null,'CAD',19.99,17.99,null,null,null,null,null,null,null,null,null,current_timestamp,current_timestamp,null,'152');
insert into INT_SCHEMA.INTL_APPLIED_RESN (APPLIED_RESN_ID, CREATED_BY_NM, CREATED_DT, UPDATED_BY_NM, UPDATED_DT, RESN_ID, ACT_RESN_FLG, APPLIED_RESN_USER, INTL_SHPMT_NBR, CONS_SHPMT_NBR)
  values(1112, 'Test', current_timestamp, 'Test', current_timestamp, '50', 'Y', 'Test',  100333022, NULL); 

Insert into INT_SCHEMA.INTL_SHPMT (INTL_SHPMT_NBR,CREATED_BY_NM,CREATED_DT,UPDATED_BY_NM,UPDATED_DT,SHPR_ID,ORIG_CNTRY_CD,DEST_CNTRY_CD,MSTR_TRKNG_ID,CONS_SHPMT_NBR,BRKR_ID,RECP_ID,IMPR_ID,BUYR_ID,STAT_CD,EST_DEL_DT,ENTRP_DOC_MGR_FLD_ID,ORIG_GTWY_IORG,DEST_GTWY_IORG,SETLM_CURR_CD,SHPMT_VALUE_CAN_AMT,SHPMT_VALUE_US_AMT,SHPMT_WGT,SHIP_DT,SHPMT_PURP_CD,CONS_EXCLN_RESN_CD,DUTY_TAX_PAYOR_CD,BRKR_REQRD_FLG,BRKR_INCLV_FLG,DATA_ENTR_DT,SHPMT_WGT_MEAS_UNIT_CD,TENDR_DT,LOCK_TMSTP,DATA_ENTRD_USER,ORIG_IORG) values 
(100333023,'Test',current_timestamp,'Test',current_timestamp,1000000044,840,124,'100333023',null,null,1000000254,null,null,null,null,null,null,null,'CAD',19.99,17.99,null,null,null,null,null,null,null,null,null,current_timestamp,current_timestamp,null,'152');
Insert into INT_SCHEMA.INTL_APPLIED_RESN (APPLIED_RESN_ID, CREATED_BY_NM, CREATED_DT, UPDATED_BY_NM, UPDATED_DT, RESN_ID, ACT_RESN_FLG, APPLIED_RESN_USER, INTL_SHPMT_NBR, CONS_SHPMT_NBR)
  values(1113, 'Test', current_timestamp, 'Test', current_timestamp, '45', 'Y', 'Test',  100333023, NULL);  
  
Insert into INT_SCHEMA.INTL_SHPMT (INTL_SHPMT_NBR,CREATED_BY_NM,CREATED_DT,UPDATED_BY_NM,UPDATED_DT,SHPR_ID,ORIG_CNTRY_CD,DEST_CNTRY_CD,MSTR_TRKNG_ID,CONS_SHPMT_NBR,BRKR_ID,RECP_ID,IMPR_ID,BUYR_ID,STAT_CD,EST_DEL_DT,ENTRP_DOC_MGR_FLD_ID,ORIG_GTWY_IORG,DEST_GTWY_IORG,SETLM_CURR_CD,SHPMT_VALUE_CAN_AMT,SHPMT_VALUE_US_AMT,SHPMT_WGT,SHIP_DT,SHPMT_PURP_CD,CONS_EXCLN_RESN_CD,DUTY_TAX_PAYOR_CD,BRKR_REQRD_FLG,BRKR_INCLV_FLG,DATA_ENTR_DT,SHPMT_WGT_MEAS_UNIT_CD,TENDR_DT,LOCK_TMSTP,DATA_ENTRD_USER,ORIG_IORG) values 
(100333024,'Test',current_timestamp,'Test',current_timestamp,1000000044,840,124,'100333024',null,null,1000000254,null,null,null,null,null,null,null,'CAD',19.99,17.99,null,null,null,null,null,null,null,null,null,current_timestamp,current_timestamp,null,'152');
insert into INT_SCHEMA.INTL_APPLIED_RESN (APPLIED_RESN_ID, CREATED_BY_NM, CREATED_DT, UPDATED_BY_NM, UPDATED_DT, RESN_ID, ACT_RESN_FLG, APPLIED_RESN_USER, INTL_SHPMT_NBR, CONS_SHPMT_NBR)
  values(1114, 'Test', current_timestamp, 'Test', current_timestamp, '60', 'Y', 'Test',  100333024, NULL);
  
 Commit;