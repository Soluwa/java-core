package com.easylearn.fundamentals;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class PrimeCheckerLimit {

	List<Integer> primeNumbers = new ArrayList<>();
	
	public void getAllPrimeWithinSpecifiedLimit(int limit) {
		
		for(int numToCheck = 2; numToCheck <= limit; numToCheck++) {
			boolean isPrime = true;
			for(int factor = 2; factor<= numToCheck /2; factor++) {
				if(numToCheck%factor == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) primeNumbers.add(numToCheck);
		}
		
		System.out.println(MessageFormat.format("There are {0} prime numbers between 1 and {1}.", primeNumbers.size(),limit));
		System.out.println("And they are:");
		for(int x:primeNumbers) {
			System.out.println(x);
		}
		
	}
}
