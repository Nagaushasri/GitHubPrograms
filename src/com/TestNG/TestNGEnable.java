package com.TestNG;

import org.testng.annotations.Test;

public class TestNGEnable {

	
	@Test(enabled=false)
	public void AddEmployee()
	{
		System.out.println("add Employee");
	}
	@Test()
	public void EditEmployee()
	{
		System.out.println("Edit Employee");
	}
	@Test(enabled=false)
	public void DeleteEmployee()
	{
		System.out.println("Delete Employee");
	}
	@Test()
	public void UpdateEmployee()
	{
		System.out.println("Update Employee");
	}
	@Test()
	public void SelectEmployee()
	{
		System.out.println("Select Employee");
	}

	
	
}
