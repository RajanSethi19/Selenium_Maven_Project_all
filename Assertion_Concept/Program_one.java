package Assertion_Concept;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program_one {
	ChromeDriver driver;

	@Test
	public void testcase1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement w = driver.findElement(By.name("q"));
		w.sendKeys("India" + Keys.ENTER);

	
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "India - Google Search");

	}
}