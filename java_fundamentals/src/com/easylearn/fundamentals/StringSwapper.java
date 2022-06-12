package com.easylearn.fundamentals;

public class StringSwapper {
	public void swapStringSupplied(String x,String y) {
		System.out.println("The first string before swap is:"+ x + "\nThe second string before swap is: " +y);
		System.out.println(x+y);
		x+=y;
		y = x.substring(0, (x.length() - y.length()));
		x = x.substring(y.length());
		
		System.out.println("The first string after swap is:"+ x + "\nThe second string after swap is: " + y);
		System.out.println(x+y);
	}
}
