package com.BrowserInteractionCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe" );
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		Thread.sleep(5000);
		driver.manage().window().maximize();
		
//		String src= driver.getPageSource();
//		System.out.println(src);
		
		//or
		System.out.println(driver.getPageSource());

		String title= driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.instagram.com/");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	    driver.close();
	    driver.quit();
	}

}
