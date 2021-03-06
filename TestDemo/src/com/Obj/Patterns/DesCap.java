package com.Obj.Patterns;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DesCap {
	
	//public static AndroidDriver<AndroidElement> setCapabilities(String target) throws MalformedURLException{			
		
		DesCap(AndroidDriver<AndroidElement> driver) throws MalformedURLException{
		//Setting desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		
		//Below line is used for providing path to .apk file
		cap.setCapability(MobileCapabilityType.APP, "/Users/kavitha/Documents/ApiDemos-debug.apk");
	
			//Below line is used to run scripts on emulator
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice");
				
	
		//Use the below commented line for automatically launch the emulator
		//cap.setCapability("deviceName", "AndroidEmulator");
		//cap.setCapability("avd", "MyDevice");
		
		//Appium server location
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//return driver;
	}
}
