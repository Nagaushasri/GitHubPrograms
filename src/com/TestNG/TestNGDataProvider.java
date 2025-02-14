package com.TestNG;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;//NO NEED TO GIVE HTML FILEPUBLIC CLASS 

public class TestNGDataProvider {


	@DataProvider(name="loginData")
	public Object[][] getdata(){
		return new Object[][] {// NO NEED TO CREATE XML FILE
			
			{"Admin", "Livetech"},//VALID usename, invalid password
			{"Livetech","Ushasri@0707"},// invalid username, valid passwor d
			{"Livetech","Testing"},// invalid username, invalid password
			{"Admin", "Ushasri@0707"}// valid username, valid password
		
			
		};
	}
	
	@Test(dataProvider="loginData")
	public void LoginTest(String user,String pass) {
	
	
		System.out.println("UserName:"+user+","+"Password:"+pass);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
	    ChromeDriver driver= new ChromeDriver();

		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		
		WebElement password =driver.findElement(By.id("txtPassword"));
		password.sendKeys("Ushasri@0707");
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	
		
	}
	
		
				
			
		
	
	
}