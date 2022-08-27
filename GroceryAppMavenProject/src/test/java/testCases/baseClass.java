package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ScreenshotCapture;

public class baseClass {
	WebDriver driver;
	ScreenshotCapture failureScreenshot; 

	@BeforeMethod
	public void beforemethod()

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Qburst\\Downloads\\chromedriver_win32\\chromeDriver.exe");// Driver file that is created by
																						// browser

		driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void aftermethod(ITestResult iTestResult) throws IOException {
		if(iTestResult.getStatus()==ITestResult.FAILURE) {
			failureScreenshot=new ScreenshotCapture();
			failureScreenshot.captureScreenshotOnFailures(driver,iTestResult.getName());
		}
		
		
		
		driver.close();
	}

}