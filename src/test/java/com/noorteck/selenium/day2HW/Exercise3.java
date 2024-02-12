package com.noorteck.selenium.day2HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(2000);
		
		WebElement registerLink = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		
		registerLink.click();
		
		Thread.sleep(2000);
		
		String titleExpected = "nopCommerce demo store. Register";
		String registerTitle = driver.getTitle();
		
		Boolean check = registerTitle.contains(titleExpected);
		
		if (check){
			System.out.println("Title is correct");
		} else { 
			System.out.println("Title does not match");
		}
		
		WebElement maleBtn = driver.findElement(By.id("gender-male"));
		maleBtn.click();
		
		WebElement firstNameField = driver.findElement(By.id("FirstName"));
		firstNameField.sendKeys("Alex");
		
		WebElement lastNameField = driver.findElement(By.id("LastName"));
		lastNameField.sendKeys("Medrano");
		
		WebElement dayField = driver.findElement(By.name("DateOfBirthDay"));
		Select dayFieldObj = new Select(dayField);
		
		dayFieldObj.selectByValue("14");
		
		WebElement monthField = driver.findElement(By.name("DateOfBirthMonth"));
		Select monthFieldObj = new Select(monthField);
		
		monthFieldObj.selectByValue("3");
		
		WebElement yearField = driver.findElement(By.name("DateOfBirthYear"));
		Select yearFieldObj = new Select(yearField);
		
		yearFieldObj.selectByValue("1980");
		
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("no_where3@nowhere.com");
		
		WebElement companyField = driver.findElement(By.id("Company"));
		companyField.sendKeys("Whatever Inc");
		
		WebElement newsletterBox = driver.findElement(By.id("Newsletter"));
		newsletterBox.click();
		
		WebElement passwordField = driver.findElement(By.id("Password"));
		passwordField.sendKeys("123456789");
		
		WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordField.sendKeys("123456789");
		
		WebElement registerBtn = driver.findElement(By.id("register-button"));
		registerBtn.click();
		
		Thread.sleep(2000);
		
		String expectedComplete = "Your registration completed!!!";
		WebElement completeText = driver.findElement(By.className("result"));
		String actualCompleteText = completeText.getText();
		Boolean completeVerify = actualCompleteText.contains(expectedComplete);
		
		if (completeVerify) {
			System.out.println("TESTCASE PASSED");
		} else { 
			System.out.println("TESTCASE FAILED");
		}
		
		
		tearDown();
		
	}

}
