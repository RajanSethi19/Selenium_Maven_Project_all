package Assertion_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Flipkart_Price_low_to_high {
	
ChromeDriver driver;
	@Test
	public void testcase1() throws InterruptedException {
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement w=driver.findElement(By.xpath("//a[@aria-label=\"Fashion\"]"));
	
	w.click();
	Thread.sleep(3000);
	WebElement w2= driver.findElement(By.xpath("//span[.=\"Men\"]"));
	w2.click();
	Thread.sleep(3000);
	WebElement w3=driver.findElement(By.xpath("//a[@title=\"T-Shirts\"]"));	
	w3.click();
	Thread.sleep(4000);
	
	  WebElement
	  w4=driver.findElement(By.xpath("//div[.=\"Price -- Low to High\"]"));
	  w4.click();
	 
	  
	  
	 String url= driver.getCurrentUrl();
	 
	 
	 if(url.contains("sort=price_asc")) {
		 
		 Assert.assertTrue(true,"PASSED");
	 }
	 
	 else {
		 
		 Assert.assertTrue(false,"FAILED");
		
	 }
		/*
		 * WebElement
		 * w6=driver.findElement(By.xpath("//div[.=\"Price -- High to Low\"]"));
		 * w6.click();
		 
	
	Thread.sleep(4000);
	WebElement w5=driver.findElement(By.xpath("//a[.=\"Men Printed Boat Neck Reversible Cotton Blend Navy Blue...\"]"));
	Thread.sleep(3000);
	boolean b=w5.isDisplayed();
	Assert.assertTrue(b);
	driver.quit();
	
	*/
	
	
	}
}
