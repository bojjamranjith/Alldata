package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	

public class ExcelCommonMethods {
	
	
	String excelFileInputPath;
	String excelFileoutputPath;
	String SheetName;
	XSSFWorkbook Workbook;
	
	public ExcelCommonMethods(String excelFileInputPath,String excelFileoutputPath,String SheetName) throws IOException
	{
		this.excelFileInputPath= excelFileInputPath;
		this.excelFileoutputPath =excelFileoutputPath;
		this.SheetName =SheetName;
		
		
	FileInputStream file = new FileInputStream("D:\\ECLIPS WORK SPACE\\com.OrangeHRMAppilication\\src\\main\\java\\com\\OrangeHRMApplicationTestDataFiles\\LogInTest.xlsx");
	Workbook =new XSSFWorkbook(file);
	}
	public String getcelvalue(int rowIndex,int CellIndex)
	{
		XSSFSheet sheet=Workbook.getSheet(SheetName);
		Row row=sheet.getRow(rowIndex);
		Cell rowcell=row.getCell(CellIndex);
		return rowcell.getStringCellValue();
		
		
	}
	public void Setcellvalue(int rowIndex,int CellIndex,String data) throws IOException {
		XSSFSheet sheet=Workbook.getSheet(SheetName);
		Row row=sheet.getRow(rowIndex);
		Cell rowofcell=row.createCell(CellIndex);
		rowofcell.setCellValue(data);
		FileOutputStream outputstreamTestResult = new FileOutputStream(excelFileoutputPath);
		Workbook.write(outputstreamTestResult);
		
		
	}
}
