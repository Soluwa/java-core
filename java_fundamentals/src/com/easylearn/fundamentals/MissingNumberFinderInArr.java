package com.easylearn.fundamentals;

public class MissingNumberFinderInArr {
	public int findMissingNumber(int[] x) {
		int additionResultForAllArrvalues = 0;
		int additionResultWithoutMissingArrvalue = 0;
		
		for(int i:x) additionResultForAllArrvalues += i;
		int len = x.length;
		for(int j = 1; j <= len +1; j++) additionResultWithoutMissingArrvalue += j;
		
		return additionResultWithoutMissingArrvalue - additionResultForAllArrvalues;
	}
}
