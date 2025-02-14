package com.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadOperations {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver= new ChromeDriver();
		
		// Identify the excel in the system
		
		FileInputStream excelTestData= new FileInputStream("C:\\Users\\rupch\\OneDrive\\Desktop\\Automation\\BrowserFolder\\chromedriver.exe");
		
		// Identify the Workbook in the excel
		
		XSSFWorkbook excelWorkbook =new XSSFWorkbook(excelTestData);
		
		//Identify the sheets in  the workbook
		
		XSSFSheet workbooksheet= excelWorkbook.getSheet("Sheet1");
		
		//Identify the rows in the sheet
		
		XSSFRow  SheetOfRow= workbooksheet.getRow(0);
		
		//Identify the cell in the row
		
		XSSFCell RowOfCell = SheetOfRow.getCell(0);
		
		// To read the data in the cell
		
		String testdata=RowOfCell.getStringCellValue();
		System.out.println(testdata);
		
		

	}

}
