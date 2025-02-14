package com.KeyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandlingExample {

	public static void main(String[] args) {


		ChromeDriver driver= new ChromeDriver();
		
		String applicationURLAddress= "https://demoqa.com/text-box";
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();

		WebElement username=driver.findElement(By.id("userName"));
		username.sendKeys("Ushasri");
		
		WebElement email= driver.findElement(By.id("userEmail"));
		email.sendKeys("Ushasri@07gmail.com");
		
		WebElement currentaddress= driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("Neredmet, Hyderabad");
		
      // WebElement permanentaddress= driver.findElement(By.id("permanentAddress"));
	
       
       //Select the text 
		
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
	//copy the text
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		 WebElement permanentaddress= driver.findElement(By.id("permanentAddress"));
			
		 action.sendKeys(Keys.TAB);
		 action.keyDown(Keys.CONTROL);
		 action.sendKeys("v"); 
		 action.keyUp(Keys.CONTROL);
	     action.perform();
	     
	     
	     driver.findElement(By.id("submit")).click();
	     
//	     action.keyDown(Keys.ARROW_DOWN);
//	     action.perform();

		
	}

}


