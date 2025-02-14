package com.TestNG;

import org.testng.annotations.Test;

public class GroupingTest {


	@Test(groups="Sanity")
	public void Test1()
	{
		System.out.println("Sanity is successful");
	}
	
	@Test(groups="Smoke")
	public void Test2()
	{
		System.out.println("Smoke is successful");
	}
	@Test(groups="Sanity, Smoke")
	public void Test3()
	{
		System.out.println("Both Sanity and Smoke test is successful");
	}
}
