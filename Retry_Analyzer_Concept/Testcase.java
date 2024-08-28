package Retry_Analyzer_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase {
	
	@Test(retryAnalyzer=Retry_Analyzer_Concept.Retry_Analyzer.class)
	public void method_one() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	//WebElement inputbox=driver.findElement(By.id("APjFqb"));
	WebElement inputbox=driver.findElement(By.id("APjqb"));
	inputbox.sendKeys("India");
	Thread.sleep(3000);
	}
}
