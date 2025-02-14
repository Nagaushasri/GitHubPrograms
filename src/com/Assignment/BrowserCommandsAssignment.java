package com.Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommandsAssignment {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		String src= driver.getPageSource();
		System.out.println(src);
		
		String Title = driver.getTitle();
		System.out.println(Title);
				
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.ajio.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}

}
