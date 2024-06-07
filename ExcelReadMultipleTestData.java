package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class ExcelReadMultipleTestData {

	

	public static void main(String[] args) throws IOException  {
		
    FileInputStream testdatafile = new FileInputStream("./src/com/ExcelOperation/ExcelReadData.xlsx");
    
    XSSFWorkbook  workbook = new XSSFWorkbook(testdatafile);
    
    XSSFSheet    testdatasheet = workbook.getSheet("Sheet1");
    
    int  rowCount=testdatasheet.getLastRowNum();
    
    for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
    {
    	Row testdatasheetRow=testdatasheet.getRow(rowIndex);
    	
    	int testdataRowOfCellCount=testdatasheetRow.getLastCellNum();
    	
    	for(int RowOfCellIndex=0;RowOfCellIndex<testdataRowOfCellCount;RowOfCellIndex++)
    	{
    	Cell	rowOfCell=testdatasheetRow.getCell(RowOfCellIndex);
    	
    	String testdata=rowOfCell.getStringCellValue();
    	
    	System.out.print(testdata+"  |   ");
    	
    	}
    	
    	System.out.println();
    	
   }
   
      
	}
}
