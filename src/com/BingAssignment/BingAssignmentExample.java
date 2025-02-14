package com.BingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingAssignmentExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        
        driver.get("https://www.bing.com/");
        
        driver.manage().window().maximize();
        
        String Expected_Title="Search - Microsoft Bing";
        System.out.println(Expected_Title);
        
        String Actual_Title=driver.getTitle();
        System.out.println(Actual_Title);
        
        if(Expected_Title.equals(Actual_Title))
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        
        if(Expected_Title.equals(Actual_Title))
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        
        
        if(Expected_Title.contains(Actual_Title))
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("false");
        }
        
//        driver.findElement(By.linkText("Copilot")).click();
//        driver.findElement(By.linkText("Shopping")).click();
//        driver.navigate().back();
//        
        //WebElement Searchicon=driver.findElement(By.id("search_icon"));
        
//        boolean displayed =Searchicon.isDisplayed();
//        System.out.println(displayed);
//        Searchicon.sendKeys("Microsoft");
        
        WebElement Searchicon=driver.findElement(By.id("search_icon"));
        
        boolean enabled =Searchicon.isEnabled();
        System.out.println(enabled);
        Searchicon.sendKeys("Microsoft");
        
        
        
        
        
        
        
	}

}
