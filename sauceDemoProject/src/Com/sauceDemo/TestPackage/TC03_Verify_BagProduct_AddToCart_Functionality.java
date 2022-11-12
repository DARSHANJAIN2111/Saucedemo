package Com.sauceDemo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.sauceDemo.POM_Package.HomePage_POMClass;
import Com.sauceDemo.POM_Package.LogIn_page_POMClass;

public class TC03_Verify_BagProduct_AddToCart_Functionality extends TestBaseClass{
	
	@Test
	public void verifyBagProductAddToCart() 
	{
		HomePage_POMClass hp = new HomePage_POMClass(driver);
		hp.clickAddToCartBagButton();
		System.out.println("Bag Product is selected");
		
		//validation
		System.out.println("Apply Validation");
		
		String exepctedProductCount = "1";	
		String actualProductCount = hp.getTextOfAddToCartButton();
	
	    Assert.assertEquals(actualProductCount, exepctedProductCount);
	
	}
//
//			@Test
//			public void verifyBagProductAddToCart() 
//			{
//				HomePage_POMClass hp = new HomePage_POMClass(driver);
//				hp.clickAddToCartBagButton();
//				System.out.println("Bag Product is selected");
//				
//				//validation
//				System.out.println("Apply Validation");
//				
//				String exepctedProductCount = "1";	
//				String actualProductCount = hp.getTextOfAddToCartButton();
//				
//			    Assert.assertEquals(actualProductCount, exepctedProductCount);
////			    if(exepctedProductCount.equals(actualProductCount))
////			    {
////			    	System.out.println("Bag Product Test case is passed");
////			    }
////			    else
////			    {
////			    	System.out.println("Bag Product Test case is failed");
////			    }
//			
//			}

}