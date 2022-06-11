package com.easylearn.main;
import com.easylearn.fundamentals.PrimeCheckerLimit;
import com.easylearn.fundamentals.PrimeCheckerSingle;

public abstract class Program {

	public static void main(String[] args) {
		PrimeCheckerLimit checker = new PrimeCheckerLimit();
		PrimeCheckerSingle pcs = new PrimeCheckerSingle();
		System.out.println(pcs.checkIfIsPrime());
		//checker.getAllPrimeWithinSpecifiedLimit(40);
		/*
		 * CodeExample ce = new CodeExample(); AddsTwoNumbers atn = new
		 * AddsTwoNumbers(); SampleArray ar = new SampleArray(); ArrayListExample ale =
		 * new ArrayListExample();
		 */
		
		/*
		 * ce.greetings("Good morning friends!");
		 * System.out.println(atn.handleString()); ar.populateAndPrintAr();
		 * System.out.println(VariableSwapper.swapVariable("England"));
		 * //ale.getAllNames(); ale.getAllNationalities(); Path currentRelativePath =
		 * Paths.get(""); String s = currentRelativePath.toAbsolutePath().toString();
		 * System.out.println("Current absolute path is: " + s);
		 */
		//System.out.println(new TextFileReader().ReadFile(new PathFormer().constructPath("\\Resource\\heavilyoverweightadvice")));
		//new BMICalculator().calculateBMI();
		 

	}

}
