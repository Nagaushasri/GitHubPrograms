package com.OmayoAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDownOmayoExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement Multiselect= driver.findElement(By.id("multiselect1"));
	
	Select Multiselect1= new Select(Multiselect);
	
	List<WebElement> MultiselectOptions =Multiselect1.getOptions();
	
	int MultiselectOptionCount= MultiselectOptions.size();
	System.out.println(MultiselectOptionCount);

	for(int i=0;i<MultiselectOptions.size();i++)
	{
		System.out.println(MultiselectOptions.get(i).getText());
	}

	for(WebElement options: MultiselectOptions)
	{
		System.out.println("The multi selection dropdown selected text is :" + options.getText());
	}

	Multiselect1.selectByIndex(2);
	Thread.sleep(500);
	
	Multiselect1.selectByValue("volvox"); 
	
	Multiselect1.selectByVisibleText("Audi");
	

	//Multiselect1.deselectAll();
	Multiselect1.deselectByValue("audix");
	
	WebElement optioncount= Multiselect1.getFirstSelectedOption();
	System.out.println("The first selection option  is :" + optioncount.getText() );
	
	List<WebElement> AllOptions= Multiselect1
			.getAllSelectedOptions();
	
	for(WebElement index:AllOptions )
	System.out.println("All selected  options  is :" + index.getText() );
	
	

	}

}
