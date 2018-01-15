import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class KeyEventsDemo extends BaseProj {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = setCapabilities("Device");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getContext());
		System.out.println(driver.currentActivity());
		System.out.println(driver.getOrientation());
		System.out.println(driver.getCurrentPackage());
		System.out.println(driver.isLocked());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
	}

}
