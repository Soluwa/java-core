package com.easylearn.main;
import com.easylearn.fundamentals.AddsTwoNumbers;
import com.easylearn.fundamentals.ArrayListExample;
import com.easylearn.fundamentals.BMICalculator;
import com.easylearn.fundamentals.CodeExample;
import com.easylearn.fundamentals.SampleArray;
import com.easylearn.fundamentals.VariableSwapper;
import com.easylearn.utility.PathFormer;
import com.easylearn.utility.TextFileReader;

public abstract class Program {

	public static void main(String[] args) {
		CodeExample ce = new CodeExample();
		AddsTwoNumbers atn = new AddsTwoNumbers();
		SampleArray ar = new SampleArray();
		ArrayListExample ale = new ArrayListExample();
		
		/*
		 * ce.greetings("Good morning friends!");
		 * System.out.println(atn.handleString()); ar.populateAndPrintAr();
		 * System.out.println(VariableSwapper.swapVariable("England"));
		 * //ale.getAllNames(); ale.getAllNationalities(); Path currentRelativePath =
		 * Paths.get(""); String s = currentRelativePath.toAbsolutePath().toString();
		 * System.out.println("Current absolute path is: " + s);
		 */
		System.out.println(new TextFileReader().ReadFile(new PathFormer().constructPath("\\Resource\\heavilyoverweightadvice")));
		 

	}

}
