package com.easylearn.main;

import com.easylearn.fundamentals.AddsTwoNumbers;
import com.easylearn.fundamentals.CodeExample;
import com.easylearn.fundamentals.SampleArray;
import com.easylearn.fundamentals.VariableSwapper;

public abstract class Program {

	public static void main(String[] args) {
		CodeExample ce = new CodeExample();
		AddsTwoNumbers atn = new AddsTwoNumbers();
		SampleArray ar = new SampleArray();
		
		ce.greetings("Good morning friends!");
		System.out.println(atn.handleString());
		ar.populateAndPrintAr();
		System.out.println(VariableSwapper.swapVariable("England","Wales")); 

	}

}
