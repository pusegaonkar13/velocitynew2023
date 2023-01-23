package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebElements 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
													
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
					
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("url is opend");
		
		
		
		

		// hide button
		WebElement hidebtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hidebtn.click();
		Thread.sleep(3000);
		
		//text box
	   WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
	   boolean result1 = textbox.isDisplayed();
		Thread.sleep(3000);
		System.out.println("status on clicking hide button-->"+result1);
		
		//Show button
		
	WebElement showbtn = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		showbtn.click();
		Thread.sleep(3000);
		System.out.println("");
		
		boolean result2 = textbox.isDisplayed();
	System.out.println("status on clicking show button-->"+result2);	
	
	// validation
	
if(result2=true)
{
	textbox.sendKeys("Prashant");
	System.out.println("Element was already displayed");
	System.out.println("Test case is pass");
}
else
{
	showbtn.click();
	textbox.sendKeys("Deepak");
	System.out.println("Element was made displayed");
	System.out.println("Test case is failed");
}
		
		
		
	}

}
