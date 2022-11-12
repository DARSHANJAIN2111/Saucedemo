package sauceDemo_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBase_Class{
	
	@Test(priority=1)
	
	public void VerifyLogin01()
	{
		String Expected="saucedemo";
	
		String Actual = driver.getTitle();
		
//		if(Expected.equals(Actual))
//		{
//			System.out.println("TC passed");
//		}
//		else
//		{
//			System.out.println("TC failed");
//		}
//		softAss.assertEquals(Actual, Expected,"test failed");
//		softAss.assertAll();
		Assert.assertEquals(Actual,Expected);
//		Assert.assertFalse(false);
	
	}

}
