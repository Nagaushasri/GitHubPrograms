package com.ValidatingAnApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingAnApplicationExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String Expected_Title ="OrangeHRM"
				+ "";
		System.out.println( Expected_Title);
		String Actual_Title =driver.getTitle();
		System.out.println(Actual_Title);
		
		
		
		if(Expected_Title.equals(Actual_Title))
		{
			
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(Expected_Title.contains("Actual_Title"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
		
	}

}
