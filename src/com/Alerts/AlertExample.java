package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement alert=driver.findElement(By.id("alert1"));
        alert.click();
        Alert alerttext= driver.switchTo().alert();
        //alerttext.accept();
	
        //alerttext.dismiss();
        String obj=alerttext.getText();
	    System.out.println(obj); 
	    
	    alerttext.sendKeys("LiveTech");
	}
	

}
