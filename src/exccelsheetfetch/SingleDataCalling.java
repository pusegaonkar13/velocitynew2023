package exccelsheetfetch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleDataCalling 
{
	public static void main(String[] args) throws IOException
	{
		// this is address where excel file saved	
		String address ="C:\\Users\\Public\\software JAVA Backup\\Apache\\prish.xlsx";

		// read excel file
		FileInputStream file = new FileInputStream(address);
		
		//workbook 
		 XSSFWorkbook book = new XSSFWorkbook(file);
		
		//sheet read
		XSSFSheet sheet = book.getSheet("prashant");
		
		
		// read row
		
		XSSFRow row = sheet.getRow(0);
		
		// cell read
		
		XSSFCell cell = row.getCell(0);
		
	// read data from cell or string data
		
		String data = cell.getStringCellValue();
		System.out.println(data);
		

		
		
		
		
		
		
		
		
		
	}

	
}








