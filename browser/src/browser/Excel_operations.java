package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_operations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  FileInputStream file3 = new FileInputStream("D:/Excelfiles/Testing.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(file3);
          XSSFSheet sheet = workbook.getSheet("Sheet1");
          Row row=sheet.createRow(5);
          Cell cell=row.createCell(6);
          cell.setCellValue("H.no:Thirumalapur,village:Thirumalapur,mandal:Chityal");
          FileOutputStream ff = new FileOutputStream("D:/Excelfiles/Testing.xlsx");
          workbook.write(ff);
          
          
	}

}
