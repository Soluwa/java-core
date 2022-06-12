package com.easylearn.fundamentals;

public class StringReversal {
	public String reverseString(String stringToReverse) {
		String result = "";
		for(int i = stringToReverse.length()-1; i>=0; i--) {
			result += stringToReverse.charAt(i);
		}
		return result;
	}

}
