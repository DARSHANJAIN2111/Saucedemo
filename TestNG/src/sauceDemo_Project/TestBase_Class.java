package sauceDemo_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase_Class {

    WebDriver driver;
    
 @BeforeMethod

public void SetUp()
{
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\software testing\\chromedriver.exe");
	
	  driver=new ChromeDriver();
	
   
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\software testing\\gecko\\geckodriver.exe");
//	
//	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	
	
  String s=driver.getTitle();
  System.out.println(s);
	
	WebElement var=driver.findElement(By.id("user-name"));
	var.sendKeys("standard_user");
	
	WebElement var2=driver.findElement(By.id("password"));
	var2.sendKeys("secret_sauce");
	
	WebElement var3=driver.findElement(By.id("login-button"));


}
 
 @AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	    
	}

}
