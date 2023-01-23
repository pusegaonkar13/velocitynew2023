package exccelsheetfetch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultiDataCall 
{
	public static void main(String[] args) throws IOException 
	{
		String address ="C:\\Users\\Public\\software JAVA Backup\\Apache\\prish.xlsx";
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("prish");
		
// first data
		XSSFRow row1 = sheet.getRow(0);
		XSSFCell cell1 = row1.getCell(0);
		String data1 = cell1.getStringCellValue();
		System.out.println(data1);
		
//	Second Data	
		XSSFRow row2 = sheet.getRow(0);
		XSSFCell cell2 = row2.getCell(0);
		String data2 = cell2.getStringCellValue();
		System.out.println(data2);

		
	}

}
