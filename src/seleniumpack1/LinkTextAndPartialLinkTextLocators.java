package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextLocators 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
							
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
							
		driver.get("https://www.facebook.com/");
		System.out.println("url is opend");
	

/* 5 .Locator linkText
		 
WebElement forgotpassword = driver.findElement(By.linkText("Forgotten password?"));			

	forgotpassword.click(); 
	
	System.out.println("Clicked on forgot password link");
	
	driver.close();
	System.out.println("Close The browser");
*/					
	
// 6. Locator partiallinkText
		
	WebElement forgotpassword = driver.findElement(By.partialLinkText("Forgotten"));
	forgotpassword.click();
	Thread.sleep(3000);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
