package com.easylearn.fundamentals;

import java.text.MessageFormat;
import java.util.Scanner;

public class PrimeCheckerSingle {
	int num;
	int trueCounter = 0;
	boolean isDivisible = false;
	public String checkIfIsPrime() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please eneter a number to check if it is a prime number:");
		num = input.nextInt() ;
		
		if(num<=1) isDivisible = false;
		for(int x = 2; x<num;x++) {
			if(num%x == 0) {
				isDivisible = true;
				trueCounter+=1;
			}
		}
		input.close();
		if(trueCounter > 0)
			 return MessageFormat.format("{0} is not a prime number", num);
		else return MessageFormat.format("{0} is a prime number", num);
	}

}
