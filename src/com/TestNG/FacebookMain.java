package com.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookMain extends FacebookBaseTest{

	@Test
	public void FacebookLoginTest()
	{
		
		
		driver.findElement(By.id("email")).sendKeys("Ushasri");
		
		driver.findElement(By.id("pass")).sendKeys("Ushasri@0707");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}
	
	
}
