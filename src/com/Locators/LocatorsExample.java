package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();	
        
//        <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" 
//        data-testid="royal-email" placeholder="Email address or phone number"
//        autofocus="1" aria-label="Email address or phone number">
        
        
       // Id
        //driver.findElement(By.id("email")).sendKeys("LiveTech");
        
        
                       //or
        
      //  WebElement userName=driver.findElement(By.id("email"));
        //userName.sendKeys("Testing");
        
                          //or
        
//        String userName="UshaSri";
//        By user= By.id("email");
//        WebElement userNameProperty= driver.findElement(user);
//        userNameProperty.sendKeys(userName);
//        
        
        //Name
       // driver.findElement(By.name("email")).sendKeys("Live");
        
        //ClassName
       // driver.findElement(By.className("inputtext")).sendKeys("Tech");
        
        //TagName
       List<WebElement>link= driver.findElements(By.tagName("a"));
       
       
      // System.out.println(link.size());
       int links=link.size();
       System.out.println(links);
       
       //linkText
       
       //driver.findElement(By.linkText("Forgotten password?")).click();     
       //driver.findElement(By.partialLinkText("Forgotten")).click();
       //driver.findElement(By.partialLinkText("?")).click();
       // driver.findElement(By.partialLinkText("Forgotten password")).click();
       
       //X path
       
     // WebElement email= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
      //email.sendKeys("Automation");
      
       
      //Relative Path
       
  // WebElement emailId= driver.findElement(By.xpath("//*[@id=\"email\"]"));
  // emailId.sendKeys("Selenium");
       
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Tools");
      
      //driver.findElement(By.cssSelector("#email")).sendKeys("H");
      
       
	}
	

}
