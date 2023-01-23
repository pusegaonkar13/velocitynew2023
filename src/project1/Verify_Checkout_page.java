package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Checkout_page 
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
		hp.clickallproduct();
		System.out.println("clicked on All products");
		
		hp.cartlink();
		System.out.println("Clicked on add to cart link");
		
		//Check out Page
		Description_Page_POM_Class ck = new Description_Page_POM_Class(driver);
		ck.checkoutbtn();
		
		System.out.println("clicked on checkoutbutton");
		
		//---- Validation--//
		System.out.println("Apply the validation");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if(givenTitle.equals(actualTitle))
		{
			System.out.println("Logoin Test case is passed");
		}
		else
		{
			System.out.println("Logoin Test case is Failed");
		}
		driver.quit();		
		System.out.println("Browser is closed");
		System.out.println("End of the program");
		
		
	}

}
