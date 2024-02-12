package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		//set up webdrivermanager
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		//now we can navigate to the URL
		driver.get("https://www.expedia.com");
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
}
