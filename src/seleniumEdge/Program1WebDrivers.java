package seleniumEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program1WebDrivers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver",
"C:\\Users\\Public\\Eclipse\\Driver\\Edge Driver\\edgedriver_win64\\msedgedriver.exe");	
		
		WebDriver driver = new EdgeDriver();
		
		
		
		
	// 1. get method
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
	// 2. method chaining concept
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);

	// 3. back navigate method
		driver.navigate().back();
		Thread.sleep(5000);
		
	// 4. forward navigate method
		driver.navigate().forward();
		Thread.sleep(5000);
		
	// 5. refresh method
		driver.navigate().refresh();
		
		
		driver.close();
		

		
	}

}
