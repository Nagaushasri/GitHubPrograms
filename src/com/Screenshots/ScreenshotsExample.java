package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsExample {

	public static void main(String[] args) throws IOException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File(".\\Screenshots\\FacebookHomePage.png"));
		
		
		
		
		//WebElement facebookTable=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]"));

		//File screenshot =facebookTable.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot, new File(".\\Screenshots\\facebookTable.png"));

	WebElement logo= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img"));
	
	File screenshot=logo.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File(".\\Screenshots\\FacebookLogo.png"));
	
	
	}

}
