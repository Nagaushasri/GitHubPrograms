package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        
        
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        
        //<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass"
        //data-testid="royal-pass" placeholder="Password" aria-label="Password">
        
        //id
        
       // WebElement userName=driver.findElement(By.id("pass"));
        //userName.sendKeys("Ushasri");
        
        //Name
        
       // driver.findElement(By.name("pass")).sendKeys("SRI07");
        
        //ClassName
        
       // driver.findElement(By.className("inputtext")).sendKeys("Tools");
        
        //TagName
      //  List<WebElement>link= driver.findElements(By.tagName("a"));
//        System.out.println(link.size());
       // int links=link.size();
        //System.out.println(links);
        
        
       //LinkText
        
        //driver.findElement(By.linkText("Create a Page")).click();    
        //driver.findElement(By.partialLinkText("Create a")).click();
        driver.findElement(By.partialLinkText("Create a Page")).click();
        
        
        //x path
        
//        WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/form/div/div[4]/input"));
//        pass.sendKeys("Selenium");
        
        //Relative Path
        
        //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("USHA");
        
        //css
        
        driver.findElement(By.cssSelector("#pass")).sendKeys("U");
	}

}
