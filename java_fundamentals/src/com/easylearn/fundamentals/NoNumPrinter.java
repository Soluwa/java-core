package com.easylearn.fundamentals;

public class NoNumPrinter {

	public void printAllWithoutUsingNum() {
		var stringWithLengthOne = "I";
		var oneRep = stringWithLengthOne.length();
		//ASCII value of 'd' is one hundred
		for(var x = oneRep; x <= 'd'; x++) System.out.println(x);
	}
}
