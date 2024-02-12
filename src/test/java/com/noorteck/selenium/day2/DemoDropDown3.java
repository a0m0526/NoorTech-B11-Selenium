package com.noorteck.selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoDropDown3 extends Hooks{

	public static void main(String[] args) {
		
		setUp();
		
		driver.get("https://www.ebay.com/");
		
		WebElement categoriesDropDown = driver.findElement(By.id("gh-cat"));
		Select selectObj = new Select(categoriesDropDown);
		
		List<WebElement> categoriesList = selectObj.getOptions();
		
		for(WebElement categories: categoriesList) {
			
			String categoriesStr = categories.getText();
			
			if (categoriesStr.contains("&")) {
				System.out.println(categoriesStr);
				
				categories.click();
			}
			
		}
		
		
		
		
		tearDown();
		
	}
	
}
