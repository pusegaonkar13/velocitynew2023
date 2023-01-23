package seleniumpack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopWindowAlertProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opend");
					
	driver.manage().window().maximize();
	System.out.println("Browser is maximized");
					
	driver.get("https://demoqa.com/alerts");
	System.out.println("url is opend");
//	Thread.sleep(3000);
	
// click me Button
	
	WebElement clickmebutton1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
	
		clickmebutton1.click();
		
	// alert switch the selenium on alert
		
			Alert alt =  driver.switchTo().alert();
			alt.accept();
			
			
		WebElement clickmekbutton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
			clickmekbutton2.click();
	
	
	}

}






