package swiggyTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import swiggyPages.Pages;


public class TestCases {
AndroidDriver driver;

	@BeforeClass
	public void SetCapabilities() throws MalformedURLException {
		

		URL URL =new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "in.swiggy.android");
		capabilities.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");
		
		driver = new AndroidDriver(URL, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		System.out.println(driver.getSessionId());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test(priority = 1)
	public void TestCase1() {
		
		Pages pages = new Pages(driver);
		
		pages.DeliveryLocationMsg();
		
		pages.DeliveryLocationAccess();
	
		
		
		
	}
	
	
	
	@AfterClass
	public void Close() {
		System.out.println("All test cases executed successfully");
		
	}
	
}
