package SetUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeSuite;

public class LoadURL 
{
	public static AndroidDriver<WebElement> app;

     @BeforeSuite(alwaysRun = true)
	public static void amazonApplication()
	{

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("Automation_Name", "UiAutomator2");
		dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");

		app = new AndroidDriver<WebElement>(dc);
        app.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
