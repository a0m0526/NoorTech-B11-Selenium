package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Step 1. We need to call setProperty() from system and pass 2 parameters.
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ross\\Desktop\\selenium_b11\\geckodriver.exe");
		
		
		
		//Step 2. Create an object of WebDriver
		WebDriver driver = new FirefoxDriver();
		
		
		
		//now we can navigate to the URL
		driver.get("https://www.expedia.com");
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}


/**
	firefox: key --> webdriver.gecko.driver
	
	chrome: key --> webdriver.chrome.driver
	
	edge: key --> webdriver.edge.driver
	
	safari: key --> webdriver.safari.driver


*/