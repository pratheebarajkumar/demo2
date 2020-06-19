package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Clock {

	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("platformVersion", "10.0(R)");
		caps.setCapability("devicename", "sdk_gphone");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("automationName", "UiAutomator2");
		
	
		
		caps.setCapability("appPackage", "com.google.android.deskclock");
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,caps);
		System.out.println("Application has started");
		driver.findElement(By.xpath("//rk[@content-desc=\"Alarm\"]")).click();
		driver.findElement(By.xpath("	\r\n" + "(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[1]")).click();
		Thread.sleep(2000);

	}

}
