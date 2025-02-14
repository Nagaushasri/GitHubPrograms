package com.Log4j;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
   
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		System.out.println("testing");
		
		Logs.info("Testing");

	}

}
