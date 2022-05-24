package com.easylearn.fundamentals;

import java.util.Arrays;

public class SampleArray {

	public void populateAndPrintAr() {
		int Nums[] = {1,2,3,4,5,6,7,8,9,10};
		int oddNums[] = new int[10];
				
		
		for(int i = 0; i <= Nums.length; i++)
		{
			if(i%2 != 0)
				oddNums[i] = i;
		}
		System.out.println(Arrays.toString(oddNums));
	}
	
}
