package com.practice.validation;

import org.testng.Assert;

public class VerificationManager {

	/**
	 * 
	 * @param texts
	 * @param expected
	 * @param message
	 */
	public void verify(Object texts, String expected, String message) { // String or objects depend
		try {

			Assert.assertEquals(texts, expected, message);
			

		} catch (AssertionError e) {
			
		}
	}

	public void verifyContent(String actual, String expected, String message) {
		try {

			// Assert.as(actual.contains(expected),expected, message);
			Assert.assertEquals(actual.contains(expected), expected, message);
			

		} catch (AssertionError e) {
			
		}
	}

//	public String removeINR(String cost) {
//		cost = cost.replace("INR ", "");
//		return cost;
//	}

}
