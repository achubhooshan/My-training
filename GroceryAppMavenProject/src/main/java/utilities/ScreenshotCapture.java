package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCapture {
	
	public void captureScreenshotOnFailures(WebDriver driver,String name) throws IOException {
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//from location
		File f1=new File(System.getProperty("user.dir")+"\\Screenshots");
		  if (!f1.exists()){
			    f1.mkdirs();//to create folder
			}

		File finalDestination=new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".png");//to location
		FileHandler.copy(screenShot,finalDestination);

		
	}

}
