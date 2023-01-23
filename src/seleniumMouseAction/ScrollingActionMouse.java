package seleniumMouseAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingActionMouse
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
									
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opend");
																		
	driver.manage().window().maximize();
	System.out.println("Browser is maximized");
										
	driver.get("https://demoqa.com/buttons");
	System.out.println("url is opend");
	Thread.sleep(3000);
	
	// scroll down
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);
	
	}

}
