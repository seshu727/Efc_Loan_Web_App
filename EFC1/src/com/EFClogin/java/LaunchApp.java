package com.EFClogin.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LaunchApp {
	protected static WebDriver driver;
	
	@BeforeTest
	public static void loadbrowser() throws Throwable {
		 driver = new ChromeDriver();
		 driver.get("http://efcdev.firstaccess.co/");
		 Thread.sleep(10000);
		 driver.manage().window().maximize(); 
		 Thread.sleep(5000);
		
	}
	
	/*
	 * @AfterTest public static void closeBrowser() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */
	
	
	
	
}