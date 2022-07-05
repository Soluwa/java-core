package com.easylearn.testng.refresh;

import java.text.MessageFormat;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterSample {
	
	@BeforeMethod
	@Parameters({"URL"})
	public void launchSite(String URL) {
		System.out.println(MessageFormat.format("Navigating to the site: ", URL));
	}
	
	@Test
	@Parameters({"username","password"})
	public void validCredentialsLogin(String username,String passwrd) {
		System.out.println(MessageFormat.format("Entering username: {0} into the username field ", username));
		System.out.println(MessageFormat.format("Entering username: {0} into the username field ", passwrd));
		System.out.println("Clicking on login button");
	}
	
	@AfterMethod
	public void tearDownProcesses() {
		System.out.println("Closing the driver.............");
	}
	@AfterTest
	public void closeResources() {
		System.out.println("Quiting the driver.........");
	}

}
