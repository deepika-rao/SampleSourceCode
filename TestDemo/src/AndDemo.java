

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.Obj.Patterns.HomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

// This program to demo different ways to locate an object.
public class AndDemo extends BaseProj {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = setCapabilities("NonDevice");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Syntax
		//tagName[@attribute=‘value’]

		//HomePage hp = new HomePage(driver);
		
		//to refer to the page object pattern elements, refer to obj.element.action
		
		 //hp.Preference.click();
	    
		driver.findElementById("android:id/text1").click();
		/*
		 driver.findElementByXPath(("//android.widget.TextView[@text='Preference']")).click();
		 driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	     driver.findElementById("android:id/checkbox").click();
	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
	     driver.findElementsByClassName("android.widget.Button").get(1).click();
	     */
	    
		
	}

}
