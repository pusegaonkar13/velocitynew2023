package seleniumMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod 
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
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		System.out.println("Right click opearion performed");
	
	// validation
		
	String givenResult = "You have done a right click";
	
	WebElement message = driver.findElement(By.xpath("//*[@id=\"rightClickMessage\"]"));
		
	String actualResult = message.getText();
	if(givenResult.equals(actualResult))
	{
		System.out.println("Test case is Passed");
	}
	else
	{
		System.out.println("Test cade is failed");
	}
		
		
		
		
		
		
		
		
	}

}
