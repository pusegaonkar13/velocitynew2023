package seleniumsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageWithThreeSliders
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
										
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
															
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
															
		driver.get("http://practice.automationtesting.in/");
					System.out.println("url is opend");
					
	WebElement shop = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a"));			
	shop.click();
	
	WebElement home = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/nav/a"));
	home.click();
	Thread.sleep(2000);
	
	// homePage
	
	System.out.println("Went to home Page");
	
	// Validation 
	System.out.println("Apply the validation");
	
	String givenTitle ="practice.automationtesting.in/"; 
	
	String acturalTitle = driver.getTitle();
	
	if(givenTitle.equals(acturalTitle))
		
	{
		System.out.println("Test case is pass");
		
	}
	else
	{
		System.out.println("Test case is Failed");
	}
	
	
	
		
					
					
		
					
					
					
					
					
	//	 driver.close();
					
		
	}

}
