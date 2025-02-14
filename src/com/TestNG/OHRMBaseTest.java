package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//Serial execution using TestNG

public class OHRMBaseTest {
	
	
	
	WebDriver driver;
    String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
   @BeforeMethod
    public void applicationLaunch()
	
	{
		driver= new ChromeDriver();
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}
	
   @AfterMethod
	public void applicationClose()
	{
		driver.quit();
		
	}
	
	
}
