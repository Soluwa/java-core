package com.easylearn.fundamentals;

import java.text.MessageFormat;

public class MaxMinNumFinderInArray {
	public String findMaxMinNumInArray(int[] x) {
		int largestNum = x[0];
		int smallestNum = x[0];
		
		for(int i = 1; i < x.length; i++) {
			if(x[i] > largestNum) largestNum = x[i];
		}
		for(int i = 1; i < x.length; i++) {
			if(x[i] < smallestNum) smallestNum = x[i];
		}
		
		return MessageFormat.format("The largest value in the supplied array is:"
								  + "{0}\nThe smallest number in the supplied array is: {1}", largestNum,smallestNum);
	}
}
