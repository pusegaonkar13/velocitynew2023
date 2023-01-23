package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenigMultipleBrowser 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Net Comm22\\Downloads\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		
	// multiple browser opening
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
	
	driver.get("https://www.google.com/");
		
	}

}
