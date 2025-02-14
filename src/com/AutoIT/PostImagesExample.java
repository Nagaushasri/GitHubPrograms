package com.AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostImagesExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {


		ChromeDriver driver= new ChromeDriver();
		driver.get("https://postimages.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("tirumalapudinagaushasri@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
	WebElement login1=	driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/form[1]/div[3]/div/input"));;
	login1.click();
	
	WebElement uploadfile=driver.findElement(By.id("ddinput"));
	uploadfile.click();
	
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\FileUploadScript1.exe");
	
	WebElement cursorpointuponimage=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/a"));
	cursorpointuponimage.click();
	
	WebElement remove =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/span[2]"));
	remove.click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}

}

//C:\Users\rupch\OneDrive\Desktop\Automation\BrowserFolder\FileUploadScript1.exe
