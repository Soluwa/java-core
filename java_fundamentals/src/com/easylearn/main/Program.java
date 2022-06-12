package com.easylearn.main;
import com.easylearn.fundamentals.AmstrongChecker;
import com.easylearn.fundamentals.DuplicateInArrFinder;
import com.easylearn.fundamentals.IntegerReversal;
import com.easylearn.fundamentals.IntegerReversalWithStringBuffer;
import com.easylearn.fundamentals.MaxMinNumFinderInArray;
import com.easylearn.fundamentals.MissingNumberFinderInArr;
import com.easylearn.fundamentals.PrimeCheckerLimit;
import com.easylearn.fundamentals.PrimeCheckerSingle;
import com.easylearn.fundamentals.StringReversal;
import com.easylearn.fundamentals.StringReversalWithBuffer;
import com.easylearn.fundamentals.StringSwapper;

public abstract class Program {

	public static void main(String[] args) {
		PrimeCheckerLimit checker = new PrimeCheckerLimit();
		PrimeCheckerSingle pcs = new PrimeCheckerSingle();
		StringReversal sr = new StringReversal();
		AmstrongChecker am = new AmstrongChecker();
		StringReversalWithBuffer srwb = new StringReversalWithBuffer();
		IntegerReversal ir = new IntegerReversal();
		IntegerReversalWithStringBuffer irwsb = new IntegerReversalWithStringBuffer();
		MissingNumberFinderInArr mnfia = new MissingNumberFinderInArr();
		DuplicateInArrFinder diaf = new DuplicateInArrFinder();
		MaxMinNumFinderInArray mmnfia = new MaxMinNumFinderInArray();
		StringSwapper sss = new StringSwapper();
		sss.swapStringSupplied("Praise", "Unlimited");
		
		System.out.println(mmnfia.findMaxMinNumInArray(new int[] {78,16,2,14,7,23}));
		
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
