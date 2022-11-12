package Com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTESTNG {
	SoftAssert soft = new SoftAssert();   // only for soft Assert
//	Hard Assert
	@Test
	public void testA()
	{
		String expectedTitle ="Swag Labs";    //BA/dev
		
		String actualTitle = " Labs";    //after execution
		
		//Assert class
		//static method
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	
	
//	Soft Assert
	@Test
	public void testAA()
	{
		String expectedTitle ="Swag Labs";    //BA/dev
		
		String actualTitle = " Labs";    //after execution
		
		//SoftAssert class
		//object create
		//object-method
		//non static
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		
		//to get the extact result always use
		//assertAll method
		
		soft.assertAll();
	}
	
	@Test
	public void testC()
	{
		String expectedTitle ="Swag Labs";    //BA/dev		
		String actualTitle = " Labs";    //after execution
		soft.assertEquals(actualTitle, expectedTitle);
	
	   String expectedURl = "www.sauceDemo.com";
	   String actualURl   = "www.sauceDemo.com";
	   soft.assertEquals(actualURl, expectedURl);
	   
	   soft.assertAll();		
	}
	
	@Test
	public void testB()
	{
		System.out.println("Hello");
	}



}
