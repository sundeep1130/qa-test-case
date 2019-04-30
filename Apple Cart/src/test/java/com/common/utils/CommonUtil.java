package com.common.utils;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.DataTable;
import gherkin.formatter.model.DataTableRow;

public class CommonUtil {

	
	public static Map<String, String> converDtToMap(DataTable dt){
		
		Map<String, String> mapTable = new HashMap<String, String>();
		for (DataTableRow row : dt.getGherkinRows()) {
			mapTable.put(row.getCells().get(0).trim(), (row.getCells().get(1).trim()));
        }
		return mapTable;
	}
}
