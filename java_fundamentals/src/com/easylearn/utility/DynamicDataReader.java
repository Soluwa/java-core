package com.easylearn.utility;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class DynamicDataReader {
	XlsHandler reader;
	public ArrayList<Object[]> readDataInExcelToList(){
		
		var dataPath = MessageFormat.format("{0}\\Resource\\userData.xlsx", System.getProperty("user.dir")); 
		      reader = new XlsHandler(dataPath);
		 var rowNums = reader.getRowCount("dataFile");
		 //var colCount = reader.getColumnCount("dataFile");
		  ArrayList<Object[]> excelData = new ArrayList<>();
		      
		      for(var i = 2;i <= rowNums; i++) {
		    	    var firstname = reader.getCellData("dataFile", "firstname", i);
		    	    var surname = reader.getCellData("dataFile", "surname", i);
		    	    var gendal = reader.getCellData("dataFile", "gendal", i);
		    	    var age = reader.getCellData("dataFile", "age", i);
		    	    var nationality = reader.getCellData("dataFile", "nationality", i);
		    	    
		    	    Object[] obj = {firstname,surname,gendal,age,nationality};
		    	    excelData.add(obj);
		    	  }
		      return excelData;
	}
}
