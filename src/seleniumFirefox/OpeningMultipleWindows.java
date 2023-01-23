package seleniumFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningMultipleWindows
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\Net Comm22\\Downloads\\Driver\\Firfox New Driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
				
			// multiple browser opening
				
				WebDriver driver = new FirefoxDriver();
				WebDriver driver1 = new FirefoxDriver();
				WebDriver driver2 = new FirefoxDriver();
				WebDriver driver3 = new FirefoxDriver();
			
			driver.get("https://www.google.com/");
				
			}
		
	}


