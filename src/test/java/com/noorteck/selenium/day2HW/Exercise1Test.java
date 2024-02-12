package com.noorteck.selenium.day2HW;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Exercise1Test extends Hooks {
   
	
   
   

  @BeforeTest
  
  public void beforeTest() throws InterruptedException {
	  	setUp();
	  	driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
	  	Thread.sleep(2000);
		
		//<input class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password" data-v-844e87dc="">
		WebElement usernameField = driver.findElement(By.name("username"));
		
		usernameField.sendKeys("ntk-admin");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		
		passwordField.sendKeys("Ntk-orange!admin.123");
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		loginBtn.click();
		Thread.sleep(2000);
  }
 
  @Test
  public void f() {
	 String valid = "Dashboard";
	 String titleHeaderText = driver.getTitle();
	 SoftAssert softAssertObj = new SoftAssert();
	 
	 softAssertObj.assertEquals(titleHeaderText, valid);
	 softAssertObj.assertAll(); 
  }
  
  @AfterTest
  public void afterTest() {
     tearDown();	
	 
  }
  

}
