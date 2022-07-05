package com.easylearn.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateInArrFinder {
	public void findDuplicateInArr(String[] x) {
		var counter = 0;
		var duplicates = new ArrayList<>();
		var noDuplicateCollection = new HashSet<>();
		
		for(var i:x) {
			if(!noDuplicateCollection.add(i)) {
				counter += 1;
				duplicates.add(i);
			}
		}
		
		if(counter > 0) {
			System.out.println("The following values are duplicated in the supplied array: ");
		}
		
		duplicates.forEach(value -> System.out.println(value));
		//duplicates.stream().forEach(value -> System.out.println(value));
			
		 
	}
}
