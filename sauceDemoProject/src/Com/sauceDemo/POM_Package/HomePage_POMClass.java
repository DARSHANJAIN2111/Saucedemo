package Com.sauceDemo.POM_Package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POMClass {
	
	
		
	  	WebDriver driver;
		 
		//menuBtn
		@FindBy(xpath ="//button[@id='react-burger-menu-btn']")
		private WebElement menuButton;
		
		public void clickOnMenuButton()
		{
			menuButton.click();
		}

		//logOutBtn
		@FindBy(id ="//a[@id='logout_sidebar_link']")
		private WebElement logOutButton;
		
		public void clickOnLogOutButton()
		{
			logOutButton.click();
		}
		@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement AddToCartBagButton;
		public void clickAddToCartBagButton()
		{
			AddToCartBagButton.getText();
			AddToCartBagButton.click();
		}
		@FindBy(xpath ="//a[@class='shopping_cart_link']")
		private WebElement addToCartLink1;
		
		
		@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagProduct;
		
		public void clickAddToCartBagButton1()
		{
			bagProduct.click();;
		}
		
		//add to cart ele
		@FindBy(xpath ="//a[@class='shopping_cart_link']")
		private WebElement addToCartLink;
		
		public String getTextOfAddToCartButton()
		{
			String actualCount= addToCartLink1.getText();
			return actualCount;
		}

		@FindBy(xpath ="//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		
		public void clickAllProducts()
		{
		  
			
//			for(int i=0; i<allProducts.size();i++)
//			{
//				allProducts.get(i).click();
//			}		
//		}
			
			
		    //assignment
			//use for each loop
		for(WebElement d : allProducts) {
		
			int list1 = 0;    // initialisation
			
			allProducts.get(list1).click();
		}
		
		
		}
		

	    public HomePage_POMClass(WebDriver driver)
	    {
	    	this.driver = driver;
	    	PageFactory.initElements(driver, this);
	    }
		
	    
	}





