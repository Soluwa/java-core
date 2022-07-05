package com.easylearn.testng.refresh;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.easylearn.utility.FailedTestRetryRunner;

public class TestNgRetryFailedTestSample {

	@Test(retryAnalyzer = FailedTestRetryRunner.class)
	public void testRetryFail() {
		Assert.assertEquals(false, true);
	}
}
