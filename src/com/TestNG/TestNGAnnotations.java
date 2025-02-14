
package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	@Test
	public void test()
	{
		System.out.println("This is my first test case");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This will execute before every method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This will execute After every method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This will execute before every class");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("This will execute after every class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This will execute before every test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("This will execute after every test");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This will execute before every suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This will execute after every suite");
	}
	
	
	
	
}
