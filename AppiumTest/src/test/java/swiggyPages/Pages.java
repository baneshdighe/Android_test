package swiggyPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class Pages {
	
	AndroidDriver driver;
	
	public Pages(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void DeliveryLocationMsg() {
		
		
		String DeliveryLocMSG = driver.findElement(By.id("in.swiggy.android:id/nux_message")).getText();
		
		System.out.println(DeliveryLocMSG);
		
	
	}
	
	public void DeliveryLocationAccess() {
		
		//Delivery location Permission 
		WebElement loc = driver.findElement(By.xpath("//*[@text='SET DELIVERY LOCATION']"));
		loc.click();
		System.out.println("Clicked successfully on: SET DELIVERY LOCATION");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@text='While using the app']")).click();
		System.out.println("Access given to Location Fetching");
		
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='CHANGE']")).click();
		System.out.println("Clicked on Change");
		
		driver.findElement(By.id("in.swiggy.android:id/location_description")).sendKeys("Katraj - Kondhwa Road");
		System.out.println("Location entered as Katraj Kondhwa road successfully");
		
		driver.findElement(By.id("in.swiggy.android:id/google_place_search_subtitle_text")).click();
		System.out.println("Location choosen from popup");
		
		driver.manage().timeouts().implicitlyWait(28, TimeUnit.SECONDS);
		driver.findElement(By.id("in.swiggy.android:id/addressText")).getText();
		System.out.println("Location text printed");
		
		driver.findElement(By.id("in.swiggy.android:id/google_place_search_title_text1")).click();
		System.out.println("Location Confiremed as Gokul nagar successfully");
		
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		WebElement conf = driver.findElement(By.xpath("//*[@text='CONFIRM LOCATION']"));
//		conf.isEnabled();
//		conf.click(); 
//			System.out.println("Location Confiremed");
//		
//		
//		System.out.println(driver.findElement(By.id("in.swiggy.android:id/google_place_search_title_text1")).getText());
//		
//		System.out.println("Location confirmed successfully");
//		
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("in.swiggy.android:id/address_annotation_textview")).click();
//		driver.findElement(By.id("in.swiggy.android:id/location_description")).sendKeys("Katraj");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Select Ktr = new Select((WebElement) By.xpath("//*[@text='Katraj Chowk']"));
//		Ktr.selectByVisibleText("Katraj Chowk");
//		//driver.findElement(By.xpath("//*[@text='Katraj Chowk']")).click();
//		
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		WebElement conf2 = driver.findElement(By.xpath("//*[@text='CONFIRM LOCATION']"));
//		conf2.isEnabled();
//		conf2.click(); 
		
		
	}
	
	public void SleepTime() {
		
		
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
		
	


