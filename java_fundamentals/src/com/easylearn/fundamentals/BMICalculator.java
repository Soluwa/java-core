package com.easylearn.fundamentals;

import java.text.MessageFormat;
import java.util.Scanner;

import com.easylearn.utility.PathFormer;
import com.easylearn.utility.TextFileReader;

/**
 * Contains methods that prompt user for their height and weight and calculates
 * their BMI based on the entered values.
 */
public class BMICalculator {
	Scanner input = new Scanner(System.in);
	String name;
	String heightUnit;
	double rawHeight;
	String weightUnit;
	double rawWeight;
	double height;
	double weight;
	PathFormer pathFormer = new PathFormer();
	TextFileReader textFileReader = new TextFileReader();

	public void calculateBMI() {
		getWeightAndHeightMetrics();
		double BMI = computBMI();
		System.out.println();
		System.out.println(MessageFormat.format("Hi {0} your BMI is {1}", name, BMI));
		System.out.println();
		System.out.println(computAndPostBMIAdviceReport(BMI));
	}

	public void getWeightAndHeightMetrics() {
		System.out.println("Welcome, this application will calcuate your body mass index \nand suggest improvement base on your index category");
				
		System.out.print("Please enter your full name:  ");
		name = input.nextLine();

		System.out.println("Please enter unit you will be supplying your height in.\nEnter \"cm\" for centimeter, \"ft\" for foot, \"in\" for inches and \"m\" for meter: ");
		heightUnit = enforceAcceptedHeightUnit(input.nextLine());

		System.out.print("Please enter your height: ");
		rawHeight = enforceInputEntryIsDouble();
		input.nextLine();

		System.out.print("Please enter unit you will be supplying your weight in.\nEnter \"lb\" for pounds, \"g\" for gram or \"kg\" for kilogram: ");
		weightUnit = enforceAcceptedWeightUnit(input.nextLine());

		System.out.print("Please enter your weight:");
		rawWeight = enforceInputEntryIsDouble();
		//rawWeight = input.nextDouble();
		input.nextLine();
	}

	public double getHeight() {
		switch (heightUnit) {
		case "cm":
			height = rawHeight / 100;
			break;
		case "in":
			height = rawHeight / 39.37;
			break;
		case "ft":
			height = rawHeight / 3.281;
			break;
		case "m":
			height = rawHeight;
			break;
		default:
			break;
		}
		return height;
	}

	public double getWeight() {
		switch (weightUnit) {
		case "g":
			weight = rawWeight / 1000;
			break;
		case "lb":
			weight = rawWeight / 2.205;
			break;
		case "kg":
			weight = rawWeight;
			break;
		default:
			break;
		}
		return weight;
	}

	public String enforceAcceptedHeightUnit(String unit) {
		String entry = unit;
		boolean isAny = verifyHeightInputUnit(unit);
		while(isAny == false) { 
			System.out.print("Please enter an acceptable height unit representation.\nEnter \"cm\" for centimeter, \"ft\" for foot, \"in\" for inches and \"m\" for meter: ");
			entry = input.nextLine();
			isAny = verifyHeightInputUnit(entry);
		}
		return entry;
	}
	 
	public String enforceAcceptedWeightUnit(String unit) {
		String entry = unit;
		boolean isAny = verifyWeightInputUnit(unit);
		while(isAny == false) { 
			System.out.print("Please enter an acceptable weight unit representation.\nEnter \"kg\" for kilogram, \"lb\" for pounds, and \"g\" for gram: ");
			entry = input.nextLine();
			isAny = verifyWeightInputUnit(entry);
		}
		return entry;
	}
	
	private boolean verifyHeightInputUnit(String userEntry) {
		String [] heightUnits = {"m","ft","cm","in"};
		boolean isFound = false;
		for(String m:heightUnits) {
			if(userEntry.equalsIgnoreCase(m)) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}
	
	private boolean verifyWeightInputUnit(String userEntry) {
		String [] weightUnits = {"kg","lb","g"};
		boolean isFound = false;
		for(String m:weightUnits) {
			if(userEntry.equalsIgnoreCase(m)) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}

	public void validateWeightUnitInput(String unit) {
		if (!unit.equals("lb")|| !unit.equals("kg") || !unit.equals("g")) {
			System.out.print("Please enter unit you will be supplying your weight in.\nEnter \"lb\" for pounds, \"g\" for gram or \"kg\" for kilogram: ");
			weightUnit = input.nextLine();
		}
	}

	private double enforceInputEntryIsDouble() {
		boolean isDouble = input.hasNextDouble();
		while(isDouble == false) {
			System.out.println("Please enter a valid double input: ");
			isDouble = input.hasNextDouble();
			if(isDouble) break;
		}
		return input.nextDouble();
	}

	public double computBMI() {
		double height = getHeight();
		double weight = getWeight();
		double userBMI = weight / Math.pow(height, 2);
		return userBMI;
	}

	public String computAndPostBMIAdviceReport(double BMI) {
		String BMIAdice = null;
		if (BMI <= 18.5)
			BMIAdice = textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\underweightadvice"));

		else if (BMI > 18.5 && BMI <= 24.9)
			BMIAdice = textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\normalweightadvice"));

		else if (BMI > 24.9 && BMI <= 29.9)
			BMIAdice = textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\overweightadvice"));

		else if (BMI >= 30.0)
			BMIAdice = textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\heavilyoverweightadvice"));
		return BMIAdice;
	}
}
