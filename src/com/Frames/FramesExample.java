package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/demos/");
		
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Droppable")).click();
		
		WebElement frameProperty= driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameProperty);
		
		WebElement drag= driver.findElement(By.id("draggable"));
		 
		String DragText= drag.getText();
		System.out.println(DragText);
		
		WebElement drop= driver.findElement(By.id("droppable"));
		String droptext=drop.getText();
		
		System.out.println( droptext);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		
		driver.switchTo().defaultContent();
		WebElement resiableProperty= driver.findElement(By.linkText("Resizable"));
		
		resiableProperty.click();
		
		
	}
	

}
