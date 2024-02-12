package com.noorteck.selenium.day2HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement registerLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]"));
		
		registerLink.click();
		
		Thread.sleep(2000);
		
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Alex");
		
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Medrano");
		
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("555-555-5555");
		
		
		//html labels email as user id 
		WebElement emailField = driver.findElement(By.id("userName"));
		emailField.sendKeys("no_one@nowhere.com");
		
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("321 Somewhere St");
		
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Houston");
		
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("Texas");
		
		WebElement postalCodeField = driver.findElement(By.name("postalCode"));
		postalCodeField.sendKeys("77026");
		
		//html id email on userName field
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("no_one@nowhere.com");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("123456789");
		
		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		confirmPasswordField.sendKeys("123456789");
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		Thread.sleep(2000);
		
		String verify = "Thank you for registering.";
		WebElement confirmationText = driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(2) > font"));
		String confirmationTextStr = confirmationText.getText();
		
		if (confirmationTextStr.contains(verify)) {
			System.out.println("TESTCASE PASSED");
		} else {System.out.println("TESTCASE FAILED");}
		
		
		
		tearDown();
		
		
		
		
	}
	
}
