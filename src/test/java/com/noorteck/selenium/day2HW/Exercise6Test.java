package com.noorteck.selenium.day2HW;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.Hooks;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Exercise6Test extends Hooks {


	@BeforeTest
	public void beforeTest() throws InterruptedException {
		setUp();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);
	}

	@Test
	public void titleCheck() {
		String expectedTitle = "Alerts";
		
		String pageTitle = driver.getTitle();
		
		Boolean titleCheck = pageTitle.contains(expectedTitle);
		
		SoftAssert softAssertObj = new SoftAssert();
		softAssertObj.assertEquals(titleCheck, true);
		
		softAssertObj.assertAll();
		
		if (titleCheck) {
			System.out.println("Title is correct. ");
		} else {
			System.out.println("Title is incorrect.");
		}
	}

	@Test
	public void alertInputText() throws InterruptedException {
		
		WebElement alertWithTextLink = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertWithTextLink.click();
		
		WebElement alertTextBtn = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		alertTextBtn.click();
		
		Thread.sleep(2000);
		
		Alert alertTextObj = driver.switchTo().alert();
		alertTextObj.sendKeys("Alex");
		
		alertTextObj.accept();
		
		Thread.sleep(2000);
		WebElement textBoxField = driver.findElement(By.id("Textbox"));
		
		String expectedText = "How are you today";
		String actualTextBox = textBoxField.getText();
		
		Boolean checkText = actualTextBox.contains(expectedText);
		
		SoftAssert softAssertObj = new SoftAssert();
		softAssertObj.assertEquals(checkText, true);
		
		softAssertObj.assertAll();
		
		if (checkText) {
			System.out.println("Textbox Passed");
		} else {
			System.out.println("Textbox Failed");
		}
		
		
	}
	
	@Test
	public void alertConfirmText() throws InterruptedException {
		
		WebElement alertWithCancelLink = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertWithCancelLink.click();
		
		WebElement alertCancelBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
		alertCancelBtn.click();
		
		Thread.sleep(2000);
		
		Alert cancelTextObj = driver.switchTo().alert();
		String expectedCancelAlert = "Press a Button !";
		String cancelAlertText = cancelTextObj.getText();
		Boolean checkCancelAlertText = cancelAlertText.contains(expectedCancelAlert);
		
		SoftAssert softAssertObj = new SoftAssert();
		softAssertObj.assertEquals(checkCancelAlertText, true);
		
		
		if (checkCancelAlertText) {
			cancelTextObj.accept();
		} else {
			cancelTextObj.dismiss();
		}
		
		
		
		Thread.sleep(2000);
		WebElement canceltextBoxField = driver.findElement(By.id("demo"));
		
		String expectedCancelText = "You Pressed";
		String actualCancelTextBox = canceltextBoxField.getText();
		
		Boolean checkCancelText = actualCancelTextBox.contains(expectedCancelText);
		
		softAssertObj.assertEquals(checkCancelText, true);
		softAssertObj.assertAll();
		if (checkCancelText) {
			System.out.println("Textbox Passed");
		} else {
			System.out.println("Textbox Failed");
		}
		
	}

	@AfterTest
	public void afterTest() {
		tearDown();
	}

}
