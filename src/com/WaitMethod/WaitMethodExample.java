package com.WaitMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethodExample {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();

		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		
		WebElement password =driver.findElement(By.id("txtPassword"));
		password.sendKeys("Ushasri@0707");
		
		driver.findElement(By.id("btnLogin")).click();
		 
		
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		
		
		driver.findElement(By.linkText("About")).click();
		
		
		//driver.findElement(By.linkText("Logout")).click();
		
	}


}
