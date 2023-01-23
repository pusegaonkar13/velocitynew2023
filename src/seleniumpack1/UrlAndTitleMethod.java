package seleniumpack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlAndTitleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		String url = driver.getCurrentUrl();
		System.out.println("url is-->"+url);
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("title is -->"+title);
		Thread.sleep(5000);
		
		driver.close();
	}

}
