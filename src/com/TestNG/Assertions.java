package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void testAssertion()
	{
		int Actual=6;
		int Expected=6;
		
		Assert.assertEquals(Actual, Expected, "Both are equal");
		Assert.assertTrue(Actual>2, "Condition is true");
		Assert.assertFalse(Actual<4, "condition should be false");
		Assert.assertNotNull(Actual, "object is not null");
	}
}



