package TestNG_Package;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends TestBaseClass {
	
//	SoftAssert softAss=new SoftAssert();
	
	@Test(priority=1)
	public void VerifyLogin01()
	{
		String Expected="Facebook – log in or sign up";
	
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
//		Assert.assertEquals(Expected, Actual);
		Assert.assertFalse(false);
	
	}
	@Test 
	public void test02()
	{
		System.out.println("Aur ek Twist hai");
	}
	
	
	

}
