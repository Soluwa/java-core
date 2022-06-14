package com.easylearn.fundamentals;

import java.text.MessageFormat;
import java.util.HashMap;

public class CharDuplicateInStringFinder {
	public void findDuplicatedCharInString(String stringToQuery) {
		if(stringToQuery.isEmpty()) System.out.println("Empty string was passed to function");
		if(stringToQuery.length() == 1) System.out.println("Single character was passed as parameter to the \"findDuplicatedCharInString\" function");
		var charArray = stringToQuery.toCharArray();
		var char_counter_Store = new HashMap<Character,Integer>();
		
		for(var charElement:charArray) {
			if(char_counter_Store.containsKey(charElement))
				char_counter_Store.put(charElement, char_counter_Store.get(charElement)+1);
			else char_counter_Store.put(charElement, 1);
		}
		
		//HashMap does not implements interface "Iterable" hence, can not be iterated through
		//the hashmap is converted to a Set which implements interface "Iterable"
		
		var dataSet = char_counter_Store.entrySet();
		for(var entry:dataSet) {
			if(entry.getValue() > 1) {
				System.out.println(MessageFormat.format("{0}: {1}", entry.getKey(), entry.getValue()));
			}
		}
	}
}
