package webTableIframe;

import java.util.List;

import org.apache.xmlbeans.soap.SOAPArrayType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDataPrintFromTable 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("url is opend");
		// Headers/ column 
		List<WebElement>columnHeaders = driver.findElements(By.xpath("//table//tbody//tr//th"));
		
		int noOfColumns = columnHeaders.size();
		System.out.println("noOfColumns"+noOfColumns);
		
		for(int i =0; i<noOfColumns;i++)
		{
			System.out.println(columnHeaders.get(i).getText());
		}
		
		// cell data -- row and  cell print
		
		 List<WebElement>allcelldata = driver.findElements(By.xpath("//table//tbody//tr//td"));
		 int noOfCells = allcelldata.size();
		 System.out.println("noOfCells"+noOfCells);
		 
		 for(int i =0;i<noOfCells;i++)
		 {
			 
			  String celldata = allcelldata.get(i).getText();
			 System.out.println(celldata);
		 }
		
		 
		driver.close(); 
		
		
		
		
		
	}

}
