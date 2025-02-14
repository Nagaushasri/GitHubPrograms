package com.VisibilityOfAnWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfAnWebElementExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='Username']"));
		 username.sendKeys("Admin");
		 
		 boolean displayed=username.isDisplayed();	
		 System.out.println(displayed);
		 username.sendKeys("Admin");
		
		 WebElement password =driver.findElement(By.xpath("//input[@name='Password']"));
		 password.sendKeys("admin123");
		
		 boolean enabled =password.isEnabled();
     	 System.out.println(enabled);
		 password .sendKeys("admin123");
		 
		 driver.findElement(By.linkText(" Login ")).click();
		 
		
	}

}
