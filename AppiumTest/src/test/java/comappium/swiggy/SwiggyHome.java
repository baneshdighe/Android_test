package comappium.swiggy;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class SwiggyHome {




	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		URL URL =new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "in.swiggy.android");
		capabilities.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");
		
		AndroidDriver driver = new AndroidDriver(URL, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		System.out.println(driver.getSessionId());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	
	
//		System.out.println("going to sleep");
//		
//	try {
//			for (int cnt =0; cnt<30; cnt++) {
//			Thread.sleep(10000);
//		}
//		}catch (InterruptedException e) {
//			
//			// TODO: handle exception
//		e.printStackTrace();
//		}
		
		String DeliveryLocMSG = driver.findElement(By.id("in.swiggy.android:id/nux_message")).getText();
		
		System.out.println(DeliveryLocMSG);
		
		//Delivery location Permission 
		WebElement loc = driver.findElement(By.xpath("//*[@text='SET DELIVERY LOCATION']"));
		loc.click();
		System.out.println("Clicked successfully on: SET DELIVERY LOCATION");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@text='While using the app']")).click();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement conf = driver.findElement(By.xpath("//*[@text='CONFIRM LOCATION']"));
		conf.isEnabled();
		conf.click(); 
			
		
		
		System.out.println(driver.findElement(By.id("in.swiggy.android:id/google_place_search_title_text1")).getText());
		
		System.out.println("Location confirmed successfully");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("in.swiggy.android:id/address_annotation_textview")).click();
		driver.findElement(By.id("in.swiggy.android:id/location_description")).sendKeys("Katraj");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select Ktr = new Select((WebElement) By.xpath("//*[@text='Katraj Chowk']"));
		Ktr.selectByVisibleText("Katraj Chowk");
		//driver.findElement(By.xpath("//*[@text='Katraj Chowk']")).click();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement conf2 = driver.findElement(By.xpath("//*[@text='CONFIRM LOCATION']"));
		conf2.isEnabled();
		conf2.click(); 
		
		System.out.println("going to sleep");
		
	try {
			for (int cnt =0; cnt<30; cnt++) {
			Thread.sleep(10000);
		}
		}catch (InterruptedException e) {
			
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}

	
	
	}

