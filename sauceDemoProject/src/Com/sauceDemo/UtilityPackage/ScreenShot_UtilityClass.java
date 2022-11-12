package Com.sauceDemo.UtilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_UtilityClass {
	
	public static void ScreenShot1(WebDriver driver,String Darshan) throws IOException
	{
        TakesScreenshot prasad=(TakesScreenshot)driver;
		
		File sourcefile =prasad.getScreenshotAs(OutputType.FILE);
		
		File Destfile=new File("C:\\Users\\user\\Desktop\\software testing\\Automation Testing\\Screenshot\\"+Darshan+".jpg");
		
		FileHandler.copy(sourcefile, Destfile);
	
	}
	
}
