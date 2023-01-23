package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
						
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opend");
															
	driver.manage().window().maximize();
	System.out.println("Browser is maximized");
							
	driver.get("https://vctcpune.com/selenium/practice.html");
	System.out.println("url is opend");
	
	WebElement radio1 = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/input[1]"));
	boolean result1 = radio1.isSelected();
	System.out.println("Clicked on radio button 1 ");
	
	WebElement radio2 = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/input[2]"));
	boolean result2 = radio2.isSelected();
	
	WebElement radio3 = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/label[3]"));
	boolean result3 = radio3.isSelected();
	
	WebElement radio4 = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/input[4]"));
	boolean result4 = radio4.isSelected();
	
	
	if(result1=true)
	{
		radio1.click();
		System.out.println("test case passed");
	}
	else
	{
	System.out.println("test case failed");
	
	
	
	}

}
}