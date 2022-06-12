package com.easylearn.fundamentals;

public class IntegerReversalWithStringBuffer {
   public int reverseInteger(int intergerToReverse) {
	return Integer.parseInt(new StringBuffer(String.valueOf(intergerToReverse)).reverse().toString());
   }
}
