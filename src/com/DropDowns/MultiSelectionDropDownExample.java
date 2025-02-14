package com.DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDownExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"+ "");
		driver.manage().window().maximize();

		WebElement ideName =driver.findElement(By.id("ide"));
		
		Select ideNames= new Select(ideName);
		
		List<WebElement>ideNamesOptions= ideNames.getOptions();
		
		//System.out.println(ideNamesOptionsCount);
		System.out.println(ideNamesOptions.size());
		
		
		for(int i=0;i<ideNamesOptions.size();i++)
		{
	
			System.out.println(ideNamesOptions.get(i).getText());
		}
		
	//forloop enhancement//
		
		for(WebElement Alloptions:ideNamesOptions)
		{
			System.out.println("The multi selection dropdown selected text is :" + Alloptions.getText());
		}
		
		ideNames.selectByIndex(3);
		Thread.sleep(500);
		
		ideNames.selectByValue("ij");
		Thread.sleep(500);
		
		ideNames.selectByVisibleText("NetBeans");
		
		
		//ideNames.deselectAll();
		ideNames.deselectByIndex(3);
		
		WebElement option= ideNames.getFirstSelectedOption();
		System.out.println("The first selected option is:" + option.getText());
		
		List<WebElement> alloptions=ideNames.getAllSelectedOptions();
		
	     for(WebElement index:alloptions)
		    {
    	       
	    	 System.out.println("All selected options is:" + index.getText());

		    }
		
	}

}
