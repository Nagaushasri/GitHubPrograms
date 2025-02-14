package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPrioritizations {

	
	@Test(priority=4)
	public void AddEmployee()
	{
		System.out.println("add Employee");
	}
	@Test(priority=5)
	public void EditEmployee()
	{
		System.out.println("Edit Employee");
	}
	@Test(priority=3)            //@Test   if priority is not mentioned @Test is the highest priority.
	public void DeleteEmployee()
	{
		System.out.println("Delete Employee");
	}
	@Test(priority=2)
	public void UpdateEmployee()
	{
		System.out.println("Update Employee");
	}
	@Test(priority=1)
	public void SelectEmployee()
	{
		System.out.println("Select Employee");
	}


}
