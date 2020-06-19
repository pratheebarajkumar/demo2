package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Photos {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("platformVersion", "10.0(Q)");
		caps.setCapability("devicename", "Android SDK built");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("automationName", "UiAutomator1");
		
	
		
		caps.setCapability("appPackage", "com.google.android.apps.photos");
		caps.setCapability("appActivity", "com.google.android.apps.photos.home.HomeActivity");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,caps);
		System.out.println("Application has started");


	}

}
