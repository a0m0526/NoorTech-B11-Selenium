package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoRadio extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		
		bmwRadio.click();
		Thread.sleep(2000);
		
		benzRadio.click();
		Thread.sleep(2000);
		
		hondaRadio.click();
		Thread.sleep(2000);
				
		WebElement bmwcheck = driver.findElement(By.id("bmwcheck"));
		WebElement benzcheck = driver.findElement(By.id("benzcheck"));
		WebElement hondacheck = driver.findElement(By.id("hondacheck"));
		
		bmwcheck.click();
		Thread.sleep(2000);
		
		benzcheck.click();
		Thread.sleep(2000);
		
		hondacheck.click();
		Thread.sleep(2000);
		
		bmwcheck.click();
		Thread.sleep(2000);
		
		
		tearDown();
	}

}
