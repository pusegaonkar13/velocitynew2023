package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodChainingConcept
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
// We have to use method Chaining concept for maximize concept
	
/*	driver.manage().window().maximize();

	Options o = driver.manage();
	Window w = o.window();
	w.maximize();  */
	
//	driver.manage().window().setSize(300,500);
	
	
	
		
	}

}
