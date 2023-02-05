package browser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_create_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("D:/Excelfiles/Testing.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.createRow(1);
		//Row row1=sheet.createRow(2);
		Cell cell = row.createCell(3);
		//Cell cell1=row1.createCell(3);
		cell.setCellValue("Ranjith Bojjam");
		//cell1.setCellValue("Village:Thirumalapur");
	FileOutputStream file1 = new FileOutputStream("D:/Excelfiles/Testing.xlsx");
		workbook.write(file1);

	}

}
