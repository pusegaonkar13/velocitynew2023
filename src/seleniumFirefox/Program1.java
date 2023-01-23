package seleniumFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 
{
	
		public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\Net Comm22\\Downloads\\Driver\\Firfox New Driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
		}
	
	}
	


