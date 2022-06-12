package com.easylearn.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArrFinder {
	public void findDuplicateInArr(String[] x) {
		int counter = 0;
		List<String> duplicates = new ArrayList<>();
		Set<String> noDuplicateCollection = new HashSet<>();
		
		for(String i:x) {
			if(!noDuplicateCollection.add(i)) {
				counter += 1;
				duplicates.add(i);
			}
		}
		if(counter > 0) {
			System.out.println("The following values are duplicated in the supplied array: ");
		}
		for(String y:duplicates) System.out.println(y);
	}
}
