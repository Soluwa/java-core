package com.easylearn.testng.refresh;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("initialize browser with value based on property file browser value");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start of a new test case. Launch site URL");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("maximize browser and set implicit wait after launch");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Launch browser based on value set in the before suite");
	}
	@Test(priority = 1)
	public void testMethodOpal() {
		System.out.println("execute all code logics in TC1");
	}
	
	@Test(priority = 3)
	public void testMethodIndigo() {
		System.out.println("execute all code logics in TC2");
	}
	@Test(priority = 2)
	public void testMethodJupital() {
		var x = 5/0;
		System.out.println("execute all code logics in TC3");
	}
	@AfterMethod
	public void afterTestMethod() {
		System.out.println("Delete all cookies after TC execution");
	}
}
