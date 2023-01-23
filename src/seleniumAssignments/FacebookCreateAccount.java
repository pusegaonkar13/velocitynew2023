package seleniumAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAccount
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
							
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
												
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
												
		driver.get("https://www.facebook.com/");
		System.out.println("url is opend");
		
		
		
		WebElement create = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		create.click();
		System.out.println("Click on Create accout Button");
		
//		List<String> allpage = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(allpage.get(1));
		
		
		
	WebElement fname = driver.findElement(By.xpath("//*[@id=\"u_2_b_af\"]"));
		fname.sendKeys("prashant");
	System.out.println("first name is entered");
	
	
	
	
	WebElement lname = driver.findElement(By.xpath("//input[@id='u_r_d_5D']"));
	lname.sendKeys("dhabe");
	System.out.println("Last name entered");
	
	WebElement mobno = driver.findElement(By.xpath("//input[@id='u_1b_g_of']"));
		mobno.sendKeys("8329317631");
		
	WebElement pass = driver.findElement(By.xpath("//input[@id='password_step_input']"));	
		pass.sendKeys("prince1317");
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
