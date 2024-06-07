package com.ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	public static void main(String[] args) throws IOException {
		
		//identifying the file (excel) in the system
		
		FileInputStream testdatafile =new  FileInputStream("./src/com/ExcelSheet/ExcelReadData.xlsx");
		
		//identifying the workbook in the excel file
		
		XSSFWorkbook  workbook=new   XSSFWorkbook(testdatafile);
		
		//identifying a particular sheet in the workbook
		
		XSSFSheet testdatasheet=workbook.getSheet("Sheet1");
		
		//identify a particuar Row in the sheet
		//Row-is an interface in apache poi
		
		Row testdatasheet_Row=testdatasheet.getRow(4);
		
		//identify a particuar Row of a  cell
		
		Cell testdatasheet_Rowofcell=testdatasheet_Row.getCell(10);
		
		//get the testdata from the row of a cell
		
		String testdata=testdatasheet_Rowofcell.getStringCellValue();
		
		System.out.println("The testdata in the excelfile is:-"+testdata);
		
		

	}

}
