package com.Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		Set<Cookie> cookie =driver.manage().getCookies();
		//System.out.println(cookies.size());
		
		int cookieSize=cookie.size();
		System.out.println(cookieSize);
		
		for(Cookie cookies:cookie)
		{
			System.out.println(cookies.getName()+" "+cookies.getValue());
		}
		
		System.out.println(driver.manage().getCookieNamed("dpr"));

	    Cookie obj= new Cookie("MyCookie13","9788655");
	    driver.manage().addCookie(obj);
        cookie= driver.manage().getCookies();
	   System.out.println(cookie.size());
//	   
	   for(Cookie cookies:cookie)
	   {
		   System.out.println(cookies.getName()+" "+cookies.getValue());
	   }
	   
	   driver.manage().deleteCookie(obj);
	   cookie  = driver.manage().getCookies();
	   System.out.println(cookie.size());
	  
	   
	   for(Cookie cookies:cookie)
	   {
		   System.out.println(cookies.getName()+" "+cookies.getValue());
	   }
	   
	   driver.manage().deleteAllCookies();
	   cookie= driver.manage().getCookies();
	   
	   int cookies=cookie.size();
		System.out.println(cookies);
		
		
	   
	
	}

}
