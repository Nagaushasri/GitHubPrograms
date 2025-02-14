package com.TextBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;

public class TextBoxExample {

	private static WebElement userName;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Admin");
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");
		
		String userid=Username.getAttribute("value");
		System.out.println(userid);
	 	
		String pwd=Password.getAttribute("value");
		System.out.println(pwd);
		
		
		if(userid.equals(pwd))
		{
			
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
			
		}
		
		driver.findElement(By.id(" Forgot your password? ")).click();
		
		
	//	<div data-v-0af708be="" class="orangehrm-login-forgot"><p data-v-7b563373="" data-v-0af708be="" class="oxd-text oxd-text--p orangehrm-login-forgot-header">Forgot your password? </p></div>
			
	}

}
