package Com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionProgram {
	@Test
	public void testA()
	{
		//1
		String expected="darshan";
		String actual="darshan";
		
		Assert.assertEquals(actual, expected);
		
		//2. 
		int exp = 10;
		int act = 12;
		
		Assert.assertEquals(act, exp);
	}
	
	//-------------------------
	
	@Test
	public void testB()
	{
		Assert.assertTrue(true);
//		Assert.assertTrue(false);
		
//		Assert.assertFalse(false);
//		Assert.assertFalse(true);
	}
	
	
	//----------------
	@Test
	public void testC()
	{
		//1
		String expectedTitle="darshan";
		String actualTitle="khurpade";
		
		Assert.assertEquals(actualTitle, expectedTitle,"Failure Message-Titles are not matching" );
	}
	




}
