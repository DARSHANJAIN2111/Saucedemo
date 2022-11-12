package TestNG_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class TestBaseClass {
    	
    
         WebDriver driver;
         
      @BeforeMethod
	
	public void SetUp()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\software testing\\chromedriver.exe");
		
		  driver=new ChromeDriver();
		
        
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\software testing\\gecko\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
	   String s=driver.getTitle();
	   System.out.println(s);
	   
	   WebElement username=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
	   username.sendKeys("darshankhurpade21@gmail.com");
	   
	   WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'pass')]")); //id
	   pass.sendKeys("Prasad@123");
	   
	   WebElement clicklogin=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));   //u_0_c_n8
	   clicklogin.click();
	
	
	}
      
      @AfterMethod
  	public void tearDown()
  	{
  		
  		driver.quit();
  	    
  	}
	
}
