package Implicit_Explicit_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Impplicit_Concept {
	WebDriver driver;
	@Test
	public void method_one() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement w1=driver.findElement(By.xpath("//a[@class=\"gb_d\"]"));
		w1.click();
		By x= By.tagName("a");
		
		WebElement w2=driver.findElement(By.linkText("YouTube"));
		w2.click();
		
		driver.quit();
		
	}
}
