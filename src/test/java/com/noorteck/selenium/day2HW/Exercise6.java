package com.noorteck.selenium.day2HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		
		String expectedTitle = "Alerts";
		
		String pageTitle = driver.getTitle();
		
		Boolean titleCheck = pageTitle.contains(expectedTitle);
		
		if (titleCheck) {
			System.out.println("Title is correct. ");
		} else {
			System.out.println("Title is incorrect.");
		}
		/*
		WebElement alertWithOKLink = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		alertWithOKLink.click();
		
		WebElement alertBtn = driver.findElement(By.className("btn btn-danger"));
		alertBtn.click();
		
		Alert alertObj = driver.switchTo().alert();
		String text = alertObj.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		*/
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
		
		if (checkText) {
			System.out.println("Textbox Passed");
		} else {
			System.out.println("Textbox Failed");
		}
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		
		
		WebElement alertWithCancelLink = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertWithCancelLink.click();
		
		WebElement alertCancelBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
		alertCancelBtn.click();
		
		Thread.sleep(2000);
		
		Alert cancelTextObj = driver.switchTo().alert();
		String expectedCancelAlert = "Press a Button !";
		String cancelAlertText = cancelTextObj.getText();
		Boolean checkCancelAlertText = cancelAlertText.contains(expectedCancelAlert);
		
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
		
		if (checkCancelText) {
			System.out.println("Textbox Passed");
		} else {
			System.out.println("Textbox Failed");
		}
		
		
		
		tearDown();
		
	}

}
