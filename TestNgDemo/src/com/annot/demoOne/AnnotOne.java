package com.annot.demoOne;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotOne {
	
	@BeforeTest
	public void BeforeTestSetup(){
		System.out.println("This is Before test called only once at the beginning - fresh setup");
	}
	
	@AfterTest
	public void AfterTestTearDown(){
		System.out.println("This is After test method used to tear down the setup and is called only once after all testcase are executed");
	}
	
	@BeforeMethod
	public void BaseSetup(){
		//hit the url and login ()
		System.out.println("This is before method used for pre setup - ex. delete cookies, Login, create user etc.");
		//Asserts - 
	}
	
	
	@AfterMethod
	public void ClearSetup(){
		System.out.println("This is after method called after every testcase - ex. delete session or release a port or device or delete user");
	}
	
	
	@Test
	public void AnnotDemoOne(){
	
		System.out.println("This is testcase one");
		
	}
	
	@Test
	public void AnnotDemoTwo(){
		System.out.println("This is testcase two");	
	}
	
	

}
