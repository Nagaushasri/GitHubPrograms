package com.RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();

		WebElement tableProperty = driver.findElement(By.xpath(
				"/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> groupElements = tableProperty.findElements(By.name("group1"));
		int groupElementSize = groupElements.size();
		System.out.println(groupElementSize);

		for (int i = 0; i < 3; i++) {
			groupElements.get(i).click();
			for (int j = 0; j < 3; j++) {
				String index = groupElements.get(j).getAttribute("value") + " "
						+ groupElements.get(j).getAttribute("checked");
				System.out.println(index);
			}
		}

		
		  WebElement tableProperty2= driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		  List<WebElement> group2Elements=tableProperty2.findElements(By.name("group2"));
		  int group2ElementSize=group2Elements.size();
		  System.out.println(group2ElementSize);
		  
		  for(int a=0;a<3;a++) { 
			  group2Elements.get(a).click(); 
			  for(int b=0;b<3;b++) {
		  String index2=group2Elements.get(b).getAttribute("value")+" "+group2Elements.get(b). getAttribute("checked");
		  System.out.println(index2); 
		  }
			  }
		 
	}
}

//       
