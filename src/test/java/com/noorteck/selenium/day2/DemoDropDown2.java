package com.noorteck.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoDropDown2 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement countryDropDown = driver.findElement(By.name("country"));
		
		Select selectObj = new Select(countryDropDown);
		
		List<WebElement> countryList = selectObj.getOptions();
		
		for(WebElement country: countryList) {
			
		/*	country.click();
			Thread.sleep(500);
		*/
			String countryStr = country.getText();
			if(countryStr.equals("SPAIN")) {
				country.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		
		tearDown();
		
	}

}
