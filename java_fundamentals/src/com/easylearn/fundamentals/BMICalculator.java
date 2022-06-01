package com.easylearn.fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.easylearn.utility.PathFormer;
import com.easylearn.utility.TextFileReader;
 
/**
 * Contains methods that prompt user for their
 * height and weight and calculates their BMI based
 * on the entered values.
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
		computAndPostBMIAdviceReport(computBMI());
	}

	public void getWeightAndHeightMetrics() {
		System.out.println(
				"Welcome, this application will calcuate your body mass index \n and suggest improvement base on your index category");

		System.out.println("Please enter your full name:  ");
		name = input.nextLine();

		System.out.println(
				"Please enter unit you will be supplying your height in.\n Enter \"cm\" for centimeter, \"ft\" for foot, \"in\" for inches and \"m\" for meter: ");
		heightUnit = input.nextLine();
		validateHeightUnitInput(heightUnit);

		System.out.println("Please enter your height: ");
		doubleEntryValidator("Please enter a valid height: ");
		rawHeight = input.nextDouble();
		input.nextLine();

		System.out.println(
				"Please enter unit you will be supplying your weight in.\n Enter \"lb\" for pounds, \"g\" for gram or \"kg\" for kilogram: ");
		weightUnit = input.nextLine();
		validateWeightUnitInput(weightUnit);

		System.out.println("Please enter your weight: ");
		doubleEntryValidator("Please enter a valid weight: ");
		rawWeight = input.nextDouble();
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
		switch( weightUnit) {
		case "g":
			weight = rawWeight/1000;
			break;
		case "lb":
			weight = rawWeight/2.205;
			break;
		case "kg":
			weight = rawWeight;
			break;
		default:
			break;
		}
		return weight;
	}
	
	public void validateHeightUnitInput(String unit) {
		while (!unit.equals("cm") || !unit.equals("in") || !unit.equals("ft") || !unit.equals("m")) {
			System.out.println(
					"Please enter unit you will be supplying your height in.\n Enter cm for centimeter, ft for foot, in for inches and m for meter: ");
			heightUnit = input.nextLine();
		}
	}

	public void validateWeightUnitInput(String unit) {
		while (!unit.equals("lb") || !unit.equals("kg")||!unit.equals("g")) {
			System.out.println(
					"Please enter unit you will be supplying your weight in.\n Enter \"lb\" for pounds, \"g\" for gram or \"kg\" for kilogram: ");
			weightUnit = input.nextLine();
		}
	}

	public void doubleEntryValidator(String message) 
	{
		boolean isDouble = input.hasNextDouble();
		while(isDouble == false)
		{
			System.out.println(message);
		}
	}

	public double computBMI() {
		double userBMI = getWeight()/Math.pow(height, 2);
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(userBMI));
	}
	
	public String computAndPostBMIAdviceReport(double BMI) {
		String BMIAdice = null;
		if(BMI <= 18.5)
			BMIAdice = textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\underweightadvice"));

		else if(BMI > 18.5 || BMI <= 24.9)
			BMIAdice = textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\normalweightadvice"));

		else if(BMI == 25.0 || BMI <= 29.9)
			BMIAdice =textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\overweightadvice"));

		else if(BMI >= 30.0)
			BMIAdice =textFileReader.ReadFile(pathFormer.constructPath("\\Resource\\heavilyoverweightadvice"));
		return BMIAdice;
	}
}
