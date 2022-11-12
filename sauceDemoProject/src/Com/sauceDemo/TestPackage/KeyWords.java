package Com.sauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyWords {

	@Test(priority=-4)
	public void testA()
	{
		System.out.println("Test-1");
	}
	
	@Test(priority=3)
	public void testB()
	{
		System.out.println("Test-2");
	}
	
	@Test(priority=2)
	public void testC()
	{
		System.out.println("Test-3");
	}
	
	@Test(priority=1)
	public void testD()
	{
		System.out.println("Test-4");
	}
	@Test
	public void loginTest()
	{
		System.out.println("loginTest");
		
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void bagTest()
	{
		System.out.println("bagTest");
	}
	
	@Test(priority=1,invocationCount=5)
	public void testAA()
	{
		System.out.println("Test-A");
	}
	
	@Test(priority=2,invocationCount=2)
	public void testBB()
	{
		System.out.println("Test-B");
	}
	
	@Test(priority=0,invocationCount=-1)
	public void testCC()
	{
		System.out.println("Test-C");
	}
	
	@Test(priority=0,invocationCount=0)
	public void testDD()
	{
		System.out.println("Test-D");
	}
	
	@Test(priority=-1,enabled=false)
	public void testZZ()
	{
		System.out.println("Test-B");
	}
	@Test
	public void testAZ()
	{
		System.out.println("Test-A");
	}
	
	@Test(timeOut=2000)
	public void testxx() throws InterruptedException
	{
		System.out.println("Test-B");
		Thread.sleep(5000);
	}


}
