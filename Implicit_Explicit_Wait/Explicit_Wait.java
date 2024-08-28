package Implicit_Explicit_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import dev.failsafe.internal.util.Durations;

public class Explicit_Wait {

	WebDriver driver;

	@Test
	public void method_one() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		  WebElement w = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
				  WebElement z = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
		 
		WebElement w1 = driver.findElement(By.xpath("//a[@class=\"gb_d\"]"));
		w1.click();
		
		WebElement w2 = driver.findElement(By.linkText("YouTube"));
		w2.click();
		driver.quit();

	}
}
