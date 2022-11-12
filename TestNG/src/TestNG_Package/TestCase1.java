package TestNG_Package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
public class TestCase1 {
	
		
	
	// precedance wise
	
			@BeforeSuite
    //create method 
			
			public void beforesuite() 
			{
				System.out.println("this is beforesuite annotation");
			}
			
			@BeforeTest
			public void BeforeTest()
			{
				System.out.println("this is BeforeTest annotation");
			}
			
			@BeforeClass
			public void beforeClass()
			{
				System.out.println("this is BeforeClass annotation");
			}
			@BeforeMethod
			public void BeforeMethod()
			{
				System.out.println("this is BeforeMethod annotation");
			}
			
			@Test(priority=1,enabled=true)
			public void loginTest1()
			{
				System.out.println("darshan");
			}
			
			@Test(priority=2,enabled=true)
			public void loginTest2()
			{
				System.out.println("khurpade");
			}
			@Test(priority=3,dependsOnMethods="loginTest1",timeOut=2000)
			public void loginTest3() throws InterruptedException
			{
				System.out.println("khurpade");
				Thread.sleep(3000);
			}
			
			@org.testng.annotations.AfterMethod
			public void AfterMethod()
			{
				System.out.println("this is AfterMethod annotation");
			}
			@org.testng.annotations.AfterClass
			public void AfterClass()
			{
				System.out.println("this is AfterClass annotation");
			}
			@org.testng.annotations.AfterTest
			public void AfterTest()
			{
				System.out.println("this is AfterTest annotation");
			}
			@AfterSuite
			public void AfterSuit()
			{
				System.out.println("this is AfterSuit annotation");
			}
}
//}