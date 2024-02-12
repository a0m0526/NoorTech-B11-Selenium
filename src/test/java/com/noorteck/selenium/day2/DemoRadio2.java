package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoRadio2 extends Hooks {


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
			
			
			System.out.println(bmwRadio.isSelected());
			System.out.println(benzRadio.isSelected());
			System.out.println(hondaRadio.isSelected());
			
			System.out.println("Show & Hide Example");
			
			WebElement hideButton = driver.findElement(By.id("hide-textbox"));
			WebElement showButton = driver.findElement(By.id("show-textbox"));
			WebElement showHideTextField = driver.findElement(By.id("displayed-text"));

			System.out.println("Click the hide Button");
			hideButton.click();
			
			System.out.println("Is Text Field Displayed " + showHideTextField.isDisplayed());
			Thread.sleep(2000);
			
			System.out.println("****************");
			
			System.out.println("Click the hide Button");
			showButton.click();
			
			System.out.println("Is Text Field Displayed " + showHideTextField.isDisplayed());
			Thread.sleep(2000);
			
			System.out.println("**** Enabled / disabled example");
			
			WebElement enabledButton = driver.findElement(By.id("enabled-button"));
			WebElement disabledButton = driver.findElement(By.id("disabled-button"));
			WebElement enabledDisabledTextField = driver.findElement(By.id("enabled-example-input"));
			
			System.out.println("Click on disabled");
			disabledButton.click();
			System.out.println("Is Textfield enabled: " + enabledDisabledTextField.isEnabled());
			
			
			System.out.println("Click on enabled");
			enabledButton.click();
			System.out.println("Is Textfield enabled: " + enabledDisabledTextField.isEnabled());
			
			
			tearDown();
					
	}
}
