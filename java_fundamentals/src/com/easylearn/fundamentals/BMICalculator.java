package com.easylearn.fundamentals;

import java.util.Scanner;

//Calculates users Body Mass index
public class BMICalculator {
	Scanner input = new Scanner(System.in);
	String name;
	String heightUnit;
	double rawHeight;
	String weightUnit;
	double rawWeight;
	double height;

	public double calculateBMI() {

		takeDetails();

		return 0.00;
	}

	public void takeDetails() {
		System.out.println(
				"Welcome, this application will calcuate your body mass index \n and suggest improvement base on your index category");

		System.out.println("What is your name? ");
		name = input.nextLine();

		System.out.println(
				"Please enter unit you will be supplying your height in.\n Enter cm for centimeter, ft for foot, in for inches and m for meter: ");
		validateHeightUnitInput(input.nextLine());

		System.out.println("Please enter your height: ");
		doubleEntryValidator("Please enter a valid height: ");
		rawHeight = input.nextDouble();
		input.nextLine();

		System.out.println(
				"Please enter unit you will be supplying your weight in.\n Enter lb for pounds or kg for kilogram: ");
		validateWeightUnitInput(input.nextLine());

		System.out.println("Please enter your weight: ");
		doubleEntryValidator("Please enter a valid weight: ");
		rawWeight = input.nextDouble();
		input.nextLine();
	}

	public double GetHeight() {
		switch (heightUnit) {
		case "cm":
			height = rawHeight / 100;
			break;
		case "in":
			height = rawHeight / 100;
			break;
		case "ft":
			height = rawHeight / 100;
			break;
		case "m":
			height = rawHeight / 100;
			break;
		default:
			System.out.println("");
			break;
		}
		return height;
	}

	public void validateHeightUnitInput(String unit) {
		if (!unit.equals("cm") || !unit.equals("in") || !unit.equals("ft") || !unit.equals("m")) {
			System.out.println(
					"Please enter unit you will be supplying your height in.\n Enter cm for centimeter, ft for foot, in for inches and m for meter: ");
			heightUnit = input.nextLine();
		}
	}

	public void validateWeightUnitInput(String unit) {
		if (!unit.equals("lb") || !unit.equals("kg")) {
			System.out.println(
					"Please enter unit you will be supplying your weight in.\n Enter lb for pounds or kg for kilogram: ");
			weightUnit = input.nextLine();
		}
	}
	
	public void doubleEntryValidator(String message) 
	{
		while(!input.hasNextDouble())
		{
			System.out.println(message);
		}
	}
	
	/*
	 * public void validateDoubleEntry(double input) { if (input.hasNextDouble()) {
	 * rawWeight = input.nextDouble(); } else {
	 * System.out.println("Please enter a valid weight: "); rawWeight =
	 * input.nextDouble(); } }
	 */

	/*
	 * public static <T> boolean ValidateHeightWeightInput(T userInput) { boolean
	 * isDouble = false; try {
	 * 
	 * } catch (ArithmeticException e) {
	 * 
	 * } catch (Exception e) {
	 * 
	 * } return isDouble; }
	 */
}
