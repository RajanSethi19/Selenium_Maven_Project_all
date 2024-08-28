package Selenium.Selenium_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotaion_In_Single_Program {

	@BeforeSuite
	public void one() {
System.out.println("Before suit");
	}

	@BeforeTest
	public void two() {
		System.out.println("Before test");
	}

	@BeforeClass
	public void three() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void four() {
		System.out.println("Before method");
	}
	@Test
	
public void five() {
		
		System.out.println("Test");
	}
	
	@AfterSuite
	public void six() {
System.out.println("After suit");
	}

	@AfterTest
	public void seven() {
		System.out.println("After test");
	}

	@AfterClass
	public void eight() {
		System.out.println("After class");
	}

	@AfterMethod
	public void nine() {
		System.out.println("After method");
	}

}
