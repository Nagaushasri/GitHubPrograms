package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class OHRMMain extends OHRMBaseTest {

	@Test
	public void OHRMLoginTest()
	{
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		
		WebElement password =driver.findElement(By.id("txtPassword"));
		password.sendKeys("Ushasri@0707");
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	}
		@Test
		public void logOut()
		{
			
			WebElement username=driver.findElement(By.id("txtUsername"));
			username.sendKeys("admin");
			
			WebElement password =driver.findElement(By.id("txtPassword"));
			password.sendKeys("Ushasri@0707");
			
			WebElement login=driver.findElement(By.id("btnLogin"));
			login.click();
		
		driver.findElement(By.id("welcome")).click();

		//driver.findElement(By.linkText("Logout")).click();

		//Implicit Wait

		By logOutProperty=By.linkText("Logout");

		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));
		// WebElement logOut=driver.findElement(logOutProperty);
		// logOut.click();

		//Explicit Wait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));
		WebElement logOut1=driver.findElement(logOutProperty);
		logOut1.click();
		}
	
	}
	
	
