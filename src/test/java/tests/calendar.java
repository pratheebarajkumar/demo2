package tests;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class calendar {
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
			
			
			DesiredCapabilities caps= new DesiredCapabilities();
			caps.setCapability("platformName", "ANDROID");
			caps.setCapability("platformVersion", "10.0(R)");
			caps.setCapability("devicename", "sdk_gphone");
			caps.setCapability("udid", "emulator-5554");
			caps.setCapability("automationName", "UiAutomator2");
			
		
			
			caps.setCapability("appPackage", "com.google.android.calendar");
			caps.setCapability("appActivity", "com.android.calendar.LaunchActivity");
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver=new AppiumDriver<MobileElement>(url,caps);
			System.out.println("Application has started");
		/*
		 * //WebElement
		 * arrow=driver.findElement(By.id("com.google.android.calendar:id/right_arrow"))
		 * ; //arrow.click(); //arrow.click(); //arrow.click(); Thread.sleep(2000);
		 * driver.findElement(By.id(
		 * "com.google.android.calendar:id/floating_action_button")).click();
		 * Thread.sleep(2000); driver.findElement(By.id(
		 * "com.google.android.calendar:id/speed_dial_groove_container")).click();
		 * Thread.sleep(2000); driver.findElement(By.
		 * xpath("//android.widget.LinearLayout[@content-desc=\"Exercise category, examples: Run, do yoga, get your body moving, button.\"]"
		 * )).click(); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[4]"
		 * )).click(); Thread.sleep(2000);
		 * driver.findElement(By.id("com.google.android.calendar:id/weekly_every_day")).
		 * click(); Thread.sleep(2000); driver.findElement(By.id(
		 * "com.google.android.calendar:id/weekly_duration_30_mins")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("com.google.android.calendar:id/morning")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("com.google.android.calendar:id/no_button")).click()
		 * ; Thread.sleep(2000);
		 */
			
	}

}
