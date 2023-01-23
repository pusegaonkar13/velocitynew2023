package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	// maximize the browser
		
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
       
	driver.close();   // this for close only one window or tab
	//	driver.quit();// this is for whole window all tabs	
	}		
		
	
}
