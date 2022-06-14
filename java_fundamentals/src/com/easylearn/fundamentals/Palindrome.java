package com.easylearn.fundamentals;

import java.text.MessageFormat;
import java.util.List;

public class Palindrome {
	public String isPalindrom(int num) {
		var remainder = 0;
		var inMemory = num;
		var sum = 0;
		
		while(num>0) {
			remainder = num%10;
			sum = (sum * 10) + remainder;
			num/=10;
		}
		var currency = List.of("Dollar","Pounds","Euro","Rand","Naira","Cidi","Yen","Pesso","Rupee","Rial","Shekel","Franc","Lira","Dirham","Dinar","ruble");
		currency.stream().forEach(e -> System.out.println(e));	 
		
		if(inMemory == sum)
			return MessageFormat.format("{0} is a palindrome", inMemory);
		else
			return MessageFormat.format("{0} is not a palindrome", inMemory);
	}
}
