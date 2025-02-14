package com.OmayoAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropDownOmayoExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement drop1Name= driver.findElement(By.id("drop1"));
	
	Select DropName= new Select(drop1Name);
	
	List<WebElement> DropNameOptions =DropName.getOptions();
	
	int DropNameOptionsCount= DropNameOptions.size();
	System.out.println(DropNameOptionsCount);

	for(int i=0;i<DropNameOptions.size();i++)
	{
		System.out.println(DropNameOptions.get(i).getText());
	}

	for(WebElement options: DropNameOptions)
	{
		System.out.println("The single selection dropdown selected text is :" + options.getText());
	}

	DropName.selectByIndex(4);
	Thread.sleep(500);
	
	DropName.selectByValue("def"); 
	
	DropName.selectByVisibleText("doc 3");
	
	//DropName.deselectAll();
	//DropName.deselectByValue("doc 3");
	
	WebElement optioncount= DropName.getFirstSelectedOption();
	System.out.println("The first selection option  is :" + optioncount.getText() );
	
	List<WebElement> AllOptions= DropName.getAllSelectedOptions();
	
	for(WebElement index:AllOptions )
	System.out.println("All selected  options  is :" + index.getText() );
	
	
	}

}
