package com.easylearn.main;

import java.io.FileNotFoundException;
import java.text.MessageFormat;

import com.easylearn.fundamentals.AmstrongChecker;
import com.easylearn.fundamentals.CharDuplicateInStringFinder;
import com.easylearn.fundamentals.DuplicateInArrFinder;
import com.easylearn.fundamentals.IntegerReversal;
import com.easylearn.fundamentals.IntegerReversalWithStringBuffer;
import com.easylearn.fundamentals.MaxMinNumFinderInArray;
import com.easylearn.fundamentals.MissingNumberFinderInArr;
import com.easylearn.fundamentals.NoNumPrinter;
import com.easylearn.fundamentals.Palindrome;
import com.easylearn.fundamentals.PrimeCheckerLimit;
import com.easylearn.fundamentals.PrimeCheckerSingle;
import com.easylearn.fundamentals.StringReversal;
import com.easylearn.fundamentals.StringReversalWithBuffer;
import com.easylearn.fundamentals.StringSwapper;
import com.easylearn.fundamentals.VowelCounter;
import com.easylearn.testng.refresh.TestNGDataProviderSample;
import com.easylearn.utility.DynamicDataReader;
import com.easylearn.utility.XlsHandler;

public abstract class Program {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
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
		Palindrome p = new Palindrome();
		NoNumPrinter nnp = new NoNumPrinter();
		CharDuplicateInStringFinder cdisf = new CharDuplicateInStringFinder();
		VowelCounter vc = new VowelCounter();
		DynamicDataReader ddr = new DynamicDataReader();

						/*88u 
						 * System.out.println(System.getProperty("user.dir")); readData();
						 * System.out.println(vc.countVowelInString("I Love You"));
						 * 
						 * cdisf.findDuplicatedCharInString("International");
						 */
		// nnp.printAllWithoutUsingNum();

		/*
		 * sss.swapStringSupplied("Praise", "Unlimited");
		 * 
		 * System.out.println(p.isPalindrom(49));
		 * System.out.println(mmnfia.findMaxMinNumInArray(new int[] {78,16,2,14,7,23}));
		 */

		// checker.getAllPrimeWithinSpecifiedLimit(40);
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
		// System.out.println(new TextFileReader().ReadFile(new
		// PathFormer().constructPath("\\Resource\\heavilyoverweightadvice")));
		// new BMICalculator().calculateBMI();
	}

	public static void readData() throws FileNotFoundException {
		var dataFilePath = MessageFormat.format("{0}\\Resource\\userData.xlsx", System.getProperty("user.dir"));  
		var reader = new XlsHandler(dataFilePath);
		var rowCount = reader.getRowCount("dataFile");
		
		for(var rowNum = 2; rowNum <= rowCount; rowNum++) {
			
			var firstName = reader.getCellData("dataFile", "firstname", rowNum); 
			var surname = reader.getCellData("dataFile", "surname", rowNum);
			var gendal = reader.getCellData("dataFile", "gendal", rowNum);
			var age = reader.getCellData("dataFile", "age", rowNum);
			
			System.out.println("First Name\tSurname\tGendal\tAge");
			System.out.println(MessageFormat.format("{0}\t        {1}\t{2}\t{3}", firstName,surname,gendal,age));
		}
	}
}
