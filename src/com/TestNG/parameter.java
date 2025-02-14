package com.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {
	@Test
	@Parameters({"username","password"})
	public void LoginTest(String user,String pass)
	{
	System.out.println("Username:"+user);
	System.out.println("Password:"+pass);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

	driver.manage().window().maximize();

	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	//WebElement userName=driver.findElement(By.id("txtUsername"));
	//userName.sendKeys(user);

	//WebElement Password=driver.findElement(By.id("txtPassword"));
	//Password.sendKeys(pass);

	//driver.findElement(By.id("btnLogin")).click();

}
}



