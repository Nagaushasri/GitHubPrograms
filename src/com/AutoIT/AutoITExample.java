package com.AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Ushasri@0707");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Ushasri");
		driver.findElement(By.id("lastName")).sendKeys("Tirumalapudi");
		WebElement photofile=driver.findElement(By.id("photofile"));
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",photofile );
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"/Automation/usha.jpg");
		

	}

}
