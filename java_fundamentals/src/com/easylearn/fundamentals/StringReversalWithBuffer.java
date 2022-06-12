package com.easylearn.fundamentals;

public class StringReversalWithBuffer {
	public String reverseString(String stringtoReverse) {
		StringBuffer sb = new StringBuffer(stringtoReverse);
		return sb.reverse().toString();
	}
}
