package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1stProgram 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("https://www.google.com/");
		
	}


}
