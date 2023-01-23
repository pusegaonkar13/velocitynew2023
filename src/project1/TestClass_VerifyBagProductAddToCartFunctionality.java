package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_VerifyBagProductAddToCartFunctionality 
{
	public static void main(String[] args)
	{
		System.out.println("verify Login Functionality test case");
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opned");
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("url opened");
		
	// Login Activity 
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.username();
		System.out.println("user name entered");
		
		lp.password();
		System.out.println("Password is entered");
		
		lp.clcikloginbutton();
		System.out.println("Clidked on login button");
		
		// home page
		System.out.println("Went to home page");
		
		HOME_PAGE_POM_CLASS hp = new HOME_PAGE_POM_CLASS(driver);
		hp.clickbagproduct();
		System.out.println("clicked on bag product");
		
		
		
	
		// Apply Validation
		System.out.println("Apply validation");
		String expectedProductSelection ="1";		
		String actualProductSelected = hp.getTextFromAddToCartBtn();
		
		if(expectedProductSelection.equals(actualProductSelected)) 
		{
		
			System.out.println("Bag Product Test case is passed");
		}
		else
		{
			System.out.println("Bag Product Test case is failed");
		}
		driver.quit();
		System.out.println("browser is closed");
		System.out.println("End of Program");
				
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
