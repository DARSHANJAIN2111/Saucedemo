package Com.sauceDemo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.sauceDemo.POM_Package.HomePage_POMClass;
import Com.sauceDemo.POM_Package.LogIn_page_POMClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass{
	@Test
	public void verifyLogOut()
	{
		HomePage_POMClass hp = new HomePage_POMClass(driver);
		hp.clickOnMenuButton();
		System.out.println("Clicked on menu Button");
		
		hp.clickOnLogOutButton();
		System.out.println("Clicked on logOut Button");
		
		//loginPage
		System.out.println("Went on LoginPage");
		
		//validation
		System.out.println("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();	
		
		Assert.assertEquals(actaulTitle, expectedTitle);

//	@Test 
//	public void LogOut_02() 
//	{
//		
//		
//		
//			HomePage_POMClass hp = new HomePage_POMClass(driver);
//			hp.clickOnMenuButton();
//			System.out.println("Clicked on menu Button");
//			
//			hp.clickOnLogOutButton();
//			System.out.println("Clicked on logOut Button");
//			
//			//loginPage
//			System.out.println("Went on LoginPage");
//			
//			//validation
//			System.out.println("Apply validation");		
//			String expectedTitle = "Swag Labs";   //BA/dev		
//			String actaulTitle =driver.getTitle();	
////			if(expectedTitle.equals(actaulTitle))
////			{
////				System.out.println("LogOut Test is passed");
////			}
////			else
////			{
////				System.out.println("LogOut Test is failed");
////			}
//			
//			Assert.assertEquals(actaulTitle, expectedTitle);
//					
		}

	

}



