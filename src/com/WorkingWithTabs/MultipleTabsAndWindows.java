package com.WorkingWithTabs;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsAndWindows {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://youtube.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://omayo.blogspot.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://omayo.blogspot.com/");
	
		//driver.close();
		driver.quit();
		

	}

}

