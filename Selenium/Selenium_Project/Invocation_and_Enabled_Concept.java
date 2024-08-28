package Selenium.Selenium_Project;

import org.testng.annotations.Test;

public class Invocation_and_Enabled_Concept {

	@Test(invocationCount = 5 )

	public void add() {
		System.out.println("adding");
	

	}

	@Test(invocationCount = 2, enabled = false)

	public void sub() {
		System.out.println("subtracting");

	}

}
