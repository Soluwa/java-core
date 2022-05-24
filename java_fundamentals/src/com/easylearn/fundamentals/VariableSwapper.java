package com.easylearn.fundamentals;

import java.text.MessageFormat;

public class VariableSwapper {

	public static String swapVariable(String x, String y) 
	{
		System.out.println(MessageFormat.format("First value supplied is {0}\nSecond value supplied is {1}", x,y));
		System.out.println("Swapping first and second values supplied");
		String temp = null;
		temp = x;
		x = y;
		y = temp;
		return MessageFormat.format("After swapping, first value is now {0} and \nSecond value is now {1}", x,y);
	}
}
