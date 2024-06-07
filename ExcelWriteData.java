package com.ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteData {

	public static void main(String[] args) throws IOException {
		
		//identifying the file(excel) in the system
		
		FileInputStream excelTestdatafile = new FileInputStream("./src/com/ExcelSheet/ExcelReadData.xlsx");
		
		//identifying the workbook in the excelfile
		
		XSSFWorkbook  workBook=new XSSFWorkbook(excelTestdatafile);
		
		//identifying a particular sheet in the workbook
		
		XSSFSheet  testdatasheet=workBook.getSheet("Sheet1");
		
		//creat the row
		
		Row newrow=testdatasheet.createRow(3);
		
		//creat the cell
		
		Cell newrowofnewcell=newrow.createCell(3); 
		
		newrowofnewcell.setCellValue("akhil");
		
		FileOutputStream testoutputfile =new FileOutputStream("./src/com/ExcelSheet/ExcelReadData.xlsx");
		
		workBook.write(testoutputfile);

	}

}
