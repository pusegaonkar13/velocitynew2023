package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
										
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.flipkart.com/");
		System.out.println("url is opend");
		
		
		WebElement usename = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		usename.sendKeys("9890649664");
		System.out.println("User Name Entered");

		
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys("prince13");
		System.out.println("Password Entered");
		
	    WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		loginbtn.click();
		System.out.println("Clieked on login button");
		Thread.sleep(2000);
		
	   WebElement movetofashion = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
	   
	   Actions act = new Actions(driver);
	   act.moveToElement(movetofashion).perform();
	   Thread.sleep(2000);
	 
	   
		 	
	    System.out.println("cursor moved on fashion");
	    
		WebElement menstshirt = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));	
	   // Actions act2 = new Actions(driver);						
	    menstshirt.click();
	    System.out.println("clicked on Mens T-Shirt");
	    
	    
	    
	
  //      driver.close();
		
		
		
	}

}
