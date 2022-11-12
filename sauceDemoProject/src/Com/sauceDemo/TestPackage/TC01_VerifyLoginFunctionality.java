package Com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.sauceDemo.POM_Package.LogIn_page_POMClass;
import Com.sauceDemo.UtilityPackage.ScreenShot_UtilityClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass{
	
	@Test
	public void verifyLogin() throws IOException
	{
		//take screenshot
		ScreenShot_UtilityClass.ScreenShot1(driver, "homePage-31Oct");
		
		//validation
		System.out.println("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();	
		
		//hard assertion
		Assert.assertEquals(actaulTitle, expectedTitle);
	
//		@Test
//		public void login_01() {
//			
//		//validation Part
//		System.out.println("Apply validation");		
//		String expectedTitle = "Swag Labs";   //BA/dev		
//		String actaulTitle =driver.getTitle();	
//		if(expectedTitle.equals(actaulTitle))
//		{
//			System.out.println("Login Test is passed");
//		}
//		else
//		{
//			System.out.println("Login Test is failed");
//		}
//		
//		driver.quit();
//		System.out.println("browser is closed");
//		Assert.assertEquals(actaulTitle,expectedTitle);
		
	}

}



