package com.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		WebElement UserName=driver.findElement(By.id("username"));
		 UserName.sendKeys("kutti");
		 
		 WebElement password=driver.findElement(By.id("password"));
		 password.sendKeys("Usha@07");
		 
		 driver.findElement(By.id("Login")).click();
		 
		 WebElement select=driver.findElement(By.id("rememberUn"));
         boolean selected=select.isSelected();
         System.out.println(selected);
         select.click();
         
         System.out.println(select.isSelected());
         
	}
	
	
	

}
