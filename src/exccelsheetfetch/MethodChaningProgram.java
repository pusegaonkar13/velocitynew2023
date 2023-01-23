package exccelsheetfetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MethodChaningProgram 
{
	public static void main(String[] args) throws IOException  
	{
		String address = "C:\\Users\\Public\\software JAVA Backup\\Apache\\prince.xlsx";
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook book = new XSSFWorkbook(file);
	double data1 = book.getSheet("prince").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(data1);
	double data2 = book.getSheet("prince").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(data2);	
		
		
	}

}
