package com.ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteData22 {

	public static void main(String[] args) throws IOException {
		
		//identifying the file(excel) in the system
		
		FileInputStream excelTestDatafile = new FileInputStream("./src/com/ExcelSheet/ExcelReadData.xlsx");
		
		//identifying the workbook in the excelfile
		
		XSSFWorkbook  workbook = new XSSFWorkbook(excelTestDatafile);
		
		//identify a particular sheet in the workbook
		
		XSSFSheet testdatasheet = workbook.getSheet("Sheet1");
		
		//create a Row in the sheet
		
		Row newRow=testdatasheet.createRow(10);
		
		//create a cell in the sheet
		
		Cell newRowofnewcell=newRow.createCell(10); 
		
		//send the value into the new rowofnewcell
		
		 newRowofnewcell.setCellValue("kumar");
		 
		 //save the excelfile on to the system with the names of file along the extenison of the file
		 
		 FileOutputStream testoutputfile = new FileOutputStream("./src/com/ExcelSheet/ExcelReadData.xlsx");
		 
		 workbook.write(testoutputfile);

	}

}
