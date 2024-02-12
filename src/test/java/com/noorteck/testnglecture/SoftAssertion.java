package com.noorteck.testnglecture;

import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	public static void main(String[] args) {
		SoftAssert softAssertObj = new SoftAssert();
		
		int a = 10;
		int b = 20;
		//1. check if a equals b, if true print equals otherwise not equals;
		
		softAssertObj.assertEquals(a, b);
		
		
		String s1 = "Java";
		String s2 = "SQL";
		//2. Check if s1 equals to s2, if true print equals  otherwise not equals
		
		softAssertObj.assertEquals(s1,s2);
		
		
		
		char option1 = 'A';
		char option2 = 'B';
		//3.check if option1 equals to option 2, if true print equals otherwise not equals
		softAssertObj.assertEquals(option1, option2);
		
		
		
		double price1 = 22.2;
		double price2 = 34.4;
		//4. check if price1 equals price 2, if true print equals otherwise not equals
		softAssertObj.assertEquals(price1, price2);
		
		
		softAssertObj.assertAll();
	}
}
