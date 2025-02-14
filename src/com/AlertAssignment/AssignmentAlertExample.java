package com.AlertAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentAlertExample {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

// simple alert
		
		WebElement simple= driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button"));
		simple.click();
        Alert alerttext= driver.switchTo().alert();
       // alerttext.accept();
        
 //Confirmation alert //
        
       // alerttext.dismiss();
	
 // Prompt alert //
        
//        String obj= alerttext.getText();
//	    System.out.println(obj);
//	    
	    
	    driver.findElement(By.linkText("JavaScript Alerts")	).click();
	   
	  
	 
	    
	    
	
	}

}




Feature: OrangeHRM Functionality Testing
Scenario: OHRM Application Login Credentials
Given User should open the chrome browser
When User should enter Valid URL Address
Then User should successfully navigating to OHRM Application
Then User should close the Application along with browser 








WebDriver driver;
String ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@Given("User should open the chrome browser")
public void user_should_open_the_chrome_browser() {

driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

System.out.println("Application Launched Successfully");

}

@When("User should enter Valid URL Address")
public void user_should_enter_valid_url_address() {

driver.get(ApplicationURLAddress);
System.out.println("Application url is successfully");


}

@Then("User should successfully navigating to OHRM Application")
public void user_should_successfully_navigating_to_ohrm_application() {

String Expected_Title="OHRM";
System.out.println(Expected_Title);
String Actual_Title=driver.getTitle();
System.out.println(Actual_Title);

if(Actual_Title.equals(Expected_Title))
{
	System.out.println("Actual title is same as expected title:pass");
}
else
{
	System.out.println("Actual title is not same as expected title:fail");

}

}

@Then("User should close the Application along with browser")
public void user_should_close_the_application_along_with_browser() {

driver.quit();
System.out.println("Application close successfully");

}


