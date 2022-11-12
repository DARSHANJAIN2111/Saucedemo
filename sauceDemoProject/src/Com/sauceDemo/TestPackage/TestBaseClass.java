package Com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.sauceDemo.POM_Package.LogIn_page_POMClass;
import Com.sauceDemo.UtilityPackage.ScreenShot_UtilityClass;

public class TestBaseClass {
     WebDriver driver;
	@Parameters("NameOfBrowser")
	@BeforeMethod
	public void setUp(String NameOfBrowser) throws IOException
	{
		if(NameOfBrowser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\software testing\\chromedriver.exe");
		
		  driver=new ChromeDriver();	
		System.out.println("Browser is opened");
		}
		else
			{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\software testing\\Jira\\geckodriver.exe");
			
			 driver =new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		System.out.println("Browser is maximzed");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url is opened");
		System.out.println("Went on LoginPage");
		
		//take screenshot
		ScreenShot_UtilityClass.ScreenShot1(driver,"HomePage-22oct");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//loginActivity
		LogIn_page_POMClass lp = new LogIn_page_POMClass(driver);
		lp.sendUsername();
		System.out.println("Username is entered");
		
		lp.sendPassword();
		System.out.println("Password is entered");
		
		lp.clickLoginButton();
		System.out.println("Clicked on login Button");
		
		//homePage
		System.out.println("Went on HomePage");
	}
	
	@AfterMethod
	public void tearDown()
	{	
		driver.quit();
		System.out.println("browser is closed");
	}

}



