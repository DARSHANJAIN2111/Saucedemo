package Com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.sauceDemo.POM_Package.HomePage_POMClass;

public class TC04_VerifyAllProductsAddToCartFunctionality extends TestBaseClass {
	
	@Test
	public void verifyAllProductsAddToCart()
	{
		//all products select
		HomePage_POMClass hp = new HomePage_POMClass(driver);
		hp.clickAllProducts();
		System.out.println("All products will be get selected");
		
		//validation
		System.out.println("Apply Validation");
				
		String exepctedProductCount = "6";	
		String actualProductCount = hp.getTextOfAddToCartButton();
		System.out.println("total products selected are->"+actualProductCount);
		
		Assert.assertEquals(actualProductCount, exepctedProductCount);
		
	}

//	@Test
//	public void verifyAllProductsAddToCart()
//	{
//		//all products select
//		HomePage_POMClass hp = new HomePage_POMClass(driver);
//		hp.clickAllProducts();
//		System.out.println("All products will be get selected");
//		
//		//validation
//		System.out.println("Apply Validation");
//				
//		String exepctedProductCount = "6";	
//		String actualProductCount = hp.getTextOfAddToCartButton();
//		System.out.println("total products selected are->"+actualProductCount);
//		Assert.assertEquals(actualProductCount,exepctedProductCount);
//		
////		if(exepctedProductCount.equals(actualProductCount))
////	     {
////			System.out.println("All Product Test case is passed");
////	     }
////	    else
////	     {
////			System.out.println("All Product Test case is failed");
////		 }
//	}


}
