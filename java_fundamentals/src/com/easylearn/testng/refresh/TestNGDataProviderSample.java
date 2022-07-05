package com.easylearn.testng.refresh;

import java.text.MessageFormat;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.easylearn.utility.DynamicDataReader;

public class TestNGDataProviderSample {

	
	  @DataProvider 
	  public Iterator<Object[]> getTestData() 
	  {
		  return new DynamicDataReader().readDataInExcelToList().iterator(); 
	  }
	  
	  @Test(dataProvider = "getTestData") 
	  public void registerUser(String firstname, String surname,String gendal,String age,String nationality) {
	        System.out.println("First Name\t   Surname\tGendal\tAge\tNationality");
	        System.out.println(MessageFormat.format("{0}\t           {1}\t{2}\t{3}\t{4}",firstname,surname,gendal,age,nationality));
	 }
}
