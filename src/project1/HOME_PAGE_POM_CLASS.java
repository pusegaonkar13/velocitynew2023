package project1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HOME_PAGE_POM_CLASS
{
//1. WebDriver declared
	 WebDriver driver;
	 private Select s;
	
//2. Find WebElements
//3. Element Action Perform
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
 WebElement settingbtn;
	
	public void clicksettingbtn()
	{
		settingbtn.click();
		
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	 WebElement logoutbtn;
	
	public void clicklogoutbtn()
	{
		logoutbtn.click();
		
	}
	
// bagproduct 
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 WebElement bagproduct;
	
	public void  clickbagproduct()
	{
		bagproduct.click();
	
	}
	
// Add to cart
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	 WebElement addToCartBtn;
	
	public String getTextFromAddToCartBtn()
	{
		String totalProductSelected = addToCartBtn.getText();
		return totalProductSelected;
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	  List <WebElement> AllProduct;
	
	public void clickallproduct()
	{
//		for(int i=0;i<AllProduct.size();i++)
//		{
//			AllProduct.get(i).click();
//		}
		
// Use For each loop for select all product
		
		for(WebElement item:AllProduct)
		{
			item.click();
		}
	}
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		 WebElement clickedOnCartLink;	
		
		public void cartlink()
		{
			clickedOnCartLink.click();
		}
	
	
// Filter Drop down 	
	@FindBy(xpath="//select[@class='product_sort_container']")
	 WebElement filterDropDown;
	
	public void clickonFilterDrop()
	{
		filterDropDown.click();
		s.selectByValue("Price (low to high)");
		
		
	}
	//4. constructor declare
	
	public HOME_PAGE_POM_CLASS(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		s = new Select(filterDropDown);
		
	}
	
	


}


















