package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDrivers
{
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Net Comm22\\Downloads\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	
// 1. get method
	
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
	
// 2. method chaining concept
	driver.navigate().to("https://www.google.com");
	Thread.sleep(5000);

// 3. back navigate method
	driver.navigate().back();
	Thread.sleep(5000);
	
// 4. forward navigate method
	driver.navigate().forward();
	Thread.sleep(5000);
	
// 5. refersh method
	driver.navigate().refresh();
	
	
	
}

}
