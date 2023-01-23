package webTableIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTextBox 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				System.out.println("Browser is opend");
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
				System.out.println("url is opend");
	
	// Switch to Iframe
				
		WebElement frameele = driver.findElement(By.xpath("//iframe[@id='frame2']"));	
		driver.switchTo().frame(frameele);
		
		WebElement textbox = driver.findElement(By.xpath("/html/body/input"));
				textbox.sendKeys("Prashant");
				
	}

}
