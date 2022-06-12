package com.easylearn.fundamentals;

import java.text.MessageFormat;

public class AmstrongChecker {
	public String isAmstrong(int num) {
		
		int cube = 0;
		int remainder;
		int originalNumber = num;
		
		while(num>0) {
			remainder = num%10;
			num = num/10;
			cube += (int)(Math.pow(remainder, 3));
		}
		
		if(originalNumber == cube)
			return  MessageFormat.format("{0} is an amstrong number", originalNumber);
		else 
		    return  MessageFormat.format("{0} is not an amstrong number", originalNumber);
	}
}
