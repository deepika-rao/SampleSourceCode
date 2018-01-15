import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UIAutomatorTests extends BaseProj{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = setCapabilities("Device");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Syntax
		//("attribute(\"value\")")
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Verify attribute
	     System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().enabled(true)").size());

	     //Get all the text values of enabled properties
	     
	     
	}

}