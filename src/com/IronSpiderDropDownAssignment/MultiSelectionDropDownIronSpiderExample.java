package com.IronSpiderDropDownAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDownIronSpiderExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
	WebElement CoffeeName= driver.findElement(By.name("coffee2"));
	
	Select CoffeeNames= new Select(CoffeeName);
	
	List<WebElement>CoffeeNamesOptions =CoffeeNames.getOptions();
	
	int CoffeeNamesCount= CoffeeNamesOptions.size();
	System.out.println(CoffeeNamesCount);

	for(int i=0;i<CoffeeNamesOptions.size();i++)
	{
		System.out.println(CoffeeNamesOptions.get(i).getText());
	}

	for(WebElement options: CoffeeNamesOptions)
	{
		System.out.println("The single selection dropdown selected text is :" + options.getText());
	}

	 CoffeeNames.selectByIndex(3);
	 Thread.sleep(500);
//	
	CoffeeNames.selectByValue("donut"); 
//	
	CoffeeNames.selectByVisibleText("A danish");
//	
	//CoffeeNames.deselectAll();
	CoffeeNames.deselectByValue("muffin");
//	
	WebElement optioncount= CoffeeNames.getFirstSelectedOption();
	System.out.println("The first selection option  is :" + optioncount.getText() );
//	
	List<WebElement> AllOptions= CoffeeNames.getAllSelectedOptions();
//	
	for(WebElement index:AllOptions )

		System.out.println("All selected  options  is :" + index.getText() );

	}

}
