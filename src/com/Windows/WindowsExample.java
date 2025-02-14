package com.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://gmail.com");
		driver.manage().window().maximize();

		WebElement helpProperty=driver.findElement(By.linkText("Help"));
		
		String parent=driver.getWindowHandle();
	    System.out.println(parent);
	    helpProperty.click();
	    
	    Set<String> child=driver.getWindowHandles();
	    System.out.println(child);
	    
	    
	    if(parent.equals(child))
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	    
	   
	}

}
