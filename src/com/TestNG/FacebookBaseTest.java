package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FacebookBaseTest {

	WebDriver driver;
	String applicationURLAddress="https://www.facebook.com/";
	
	 @BeforeMethod
	    public void applicationLaunch()
		
		{
			driver= new ChromeDriver();
			driver.get(applicationURLAddress);
			driver.manage().window().maximize();
			
		}
		
	   @AfterMethod
		public void applicationlose()
		{
			driver.quit();
		}
	
}
