package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Twitter {
	static AndroidDriver<WebElement> driver;
	public static void main(String[] args) {
		try {
			open();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
	}
	public static AndroidDriver<WebElement> open() throws Exception{
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("platformVersion", "10.0(R)");
		caps.setCapability("devicename", "sdk_gphone");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("automationName", "UiAutomator2");
		
	
		
		caps.setCapability("browserName", "chrome");
		caps.setCapability("chromedriverExecutable", "C:\\Users\\admin\\node_modules\\appium\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe");
		

		 driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
			driver.get("http://twitter.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@bounds='[539,1971][1045,2054]']")).click();
		return driver;

	}

}
