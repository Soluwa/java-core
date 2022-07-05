package com.easylearn.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestRetryRunner implements IRetryAnalyzer {

	boolean shouldRerun = false;
	int counter = 0;
	
	  String stringDataValue = PropertyFileReader.ReadData("FailedTestRetryFor");
	   int retryLimit  = Integer.parseInt(stringDataValue);
	 
	//int retryLimit = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}
}
