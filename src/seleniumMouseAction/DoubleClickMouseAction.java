package seleniumMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseAction
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
		String givenResult =" You have done a double clicked Prashant";
		
		WebElement massage = driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]"));
		
		String aturalResult = massage.getText();
		if(givenResult.equals(aturalResult))
		{
			System.out.println("Test Case Is passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}















