package com.noorteck.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoLocator extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		/*
		driver.get("https://www.amazon.com");
		
		//ID Locator
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchField.sendKeys("Selenium WebDriver");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		*/
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		
		
		Thread.sleep(2000);
		driver.get("https://yahoo.com");
		WebElement sportLink = driver.findElement(By.linkText("Sports"));
		sportLink.click();
		
		//PartialLink Text
		driver.get("https://yahoo.com");
		Thread.sleep(2000);
		
		WebElement signLink = driver.findElement(By.partialLinkText("Sign"));
		signLink.click();
		
		
		driver.get("https://google.com");
		Thread.sleep(2000);
		WebElement googleSearch = driver.findElement(By.cssSelector("#APjFqb"));
		googleSearch.sendKeys("Selenium is Fun...");
		
		
		WebElement googleClick = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b"));
		googleClick.click();
		
		
		tearDown();
	}
}
