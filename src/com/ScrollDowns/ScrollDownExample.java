package com.ScrollDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownExample {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
// Scenario 1 
		
		Thread.sleep(500);
//		js.executeScript("window.scrollBy(0,500)","");
//		Thread.sleep(500);
//		js.executeScript("window.scrollBy(0,-500)","");

// Scenario 2
		
   WebElement dropdown=driver.findElement(By.linkText("Dropdown"));
   js.executeScript("arguments[0].scrollIntoView();",dropdown);
	
//     
//    WebElement forgotproperty= driver.findElement(By.linkText("Forgot Password"));
//    js.executeScript("arguments[0].scrollIntoView();",forgotproperty );

// ScENARIO 3
		
//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
   
// Scenario 4
	
	//WebElement context =driver.findElement(By.linkText("Context Menu"));
    //js.executeScript("arguments[0].scrollIntoView();",context);
	
	
	
	}

}
