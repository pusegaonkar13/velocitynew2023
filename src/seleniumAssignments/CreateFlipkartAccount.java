package seleniumAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFlipkartAccount
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is opend");
													
			driver.manage().window().maximize();
			System.out.println("Browser is maximized");
					
			driver.get("https://www.flipkart.com/");
			System.out.println("url is opend");
			
//			List<String>allPage = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(allPage.get(1));
			
		WebElement loginbt =driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		loginbt.click();
		System.out.println("Clicked on login button");
		
		WebElement mobno = driver.findElement(By.xpath(""));
		mobno.sendKeys("8329317631");
		System.out.println("Mobile Number Entered");
		
		
		
		driver.close();
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			driver.close();
			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
