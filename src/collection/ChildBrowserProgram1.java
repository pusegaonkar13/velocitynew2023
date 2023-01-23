package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserProgram1 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/");
	
// for window address	
		String mainpageAdd = driver.getWindowHandle();
		System.out.println("mainpageAdd-->"+mainpageAdd);
		
	// Title
	  String title = driver.getTitle();
	  System.out.println("title"+title);
	  
	// url 
	    String url = driver.getCurrentUrl();
	    System.out.println("url--->"+url);
	    
	// Address
//	    	String address = driver.getWindowHandle();
//	    	System.out.println("address"+address);
	    
	}

}
