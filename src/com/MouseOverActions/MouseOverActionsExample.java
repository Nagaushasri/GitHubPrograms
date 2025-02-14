package com.MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionsExample {

	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("https://greenstechnologys.com/");
        driver.manage().window().maximize();
        
        
        
        
        WebElement Home= driver.findElement(By.linkText("HOME"));
        
        Actions action=new Actions(driver);
        action.moveToElement(Home).build().perform();
        Home.click();
        
       
        driver.findElement(By.linkText("Selenium")).click();
        driver.navigate().back();
        
        
   
        
	
	
	
}
	
}
