package com.easylearn.fundamentals;

import java.text.MessageFormat;

public class VowelCounter {
	public String countVowelInString(String stringUnderTest) {
		
		var counter = 0;
		for(var x = 0; x < stringUnderTest.length(); x++) {
			if(isVowel(stringUnderTest.charAt(x))) counter++;
		}
		return MessageFormat.format("The number of vowels in string -> {0}, is: {1}",stringUnderTest, counter);
	}
	
	public boolean isVowel(char charValue) {
		var vowels = new char[] {'a','e','i','o','u','A','E','I','O','U'};
		var isV = false;
		for(var v:vowels) {
			if(charValue == v) {
				isV = true;  
			}
		}
		return isV;
	}
}
