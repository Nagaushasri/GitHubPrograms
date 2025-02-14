package com.DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropDownExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"+ "");
		driver.manage().window().maximize();

		WebElement course=driver.findElement(By.id("course"));
		
		Select courseName= new Select(course);
		List<WebElement>CourseNameOptions=courseName.getOptions();
		
//		int CourseNameOptionsCount=CourseNameOptions.size();
//		System.out.println(CourseNameOptionsCount);
		System.out.println(CourseNameOptions.size());
		
		
		for(int i=0;i<CourseNameOptions.size();i++)
		{
			System.out.println(CourseNameOptions.get(i).getText());
		}
		
		//forloop enhancement//
		
		for(WebElement options:CourseNameOptions)
		{
			System.out.println("The single selection dropdown selected text is :" + options.getText());
		}
		
		courseName.selectByIndex(2);
		Thread.sleep(500);
		
		courseName.selectByValue("js");
		Thread.sleep(500);
		
		courseName.selectByVisibleText("Java");
		
		//courseName.deselectAll();
		//courseName.deselectByIndex(3);
		
		WebElement option= courseName.getFirstSelectedOption();
		System.out.println("The first selected option is:" + option.getText());
		
		List<WebElement> alloptions=courseName.getAllSelectedOptions();
		
		    for(WebElement index:alloptions)
		    {
		    	System.out.println("All selected options is:" + index.getText());
		    }
		
	}

}
