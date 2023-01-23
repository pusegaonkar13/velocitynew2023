package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndMinmize
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	// maximize the browser
		
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.get("https://www.facebook.com/");
	
	// minimize the browser
	
//	driver.manage().window().minimize();
//	Thread.sleep(3000);
	
	driver.close() ; 
	
		
	}

}
