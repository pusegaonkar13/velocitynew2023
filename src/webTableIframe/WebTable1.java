package webTableIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 
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
	
// fetching single element from table
	
	WebElement cell2 = driver.findElement(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']"));
	String celldata = cell2.getText();
	
	
	
// validation 
		
	}

}
