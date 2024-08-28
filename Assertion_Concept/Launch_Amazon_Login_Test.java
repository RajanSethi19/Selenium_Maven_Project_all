package Assertion_Concept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Launch_Amazon_Login_Test {
	
	WebDriver driver;

	@Test
	public void testcase1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement w1= driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	WebElement w2=driver.findElement(By.xpath("//span[.=\"Sign in\"]"));
	Actions a= new Actions(driver);
	a.moveToElement(w1).moveToElement(w2).click().perform();
	WebElement w3= driver.findElement(By.xpath("//input[@type=\"email\"]"));
	w3.sendKeys("9996464204");
	driver.findElement(By.id("continue")).click();
	Thread.sleep(2000);
	WebElement w4=driver.findElement(By.id("ap_password"));
	Thread.sleep(2000);
	w4.sendKeys("Rajan@1991");
	driver.findElement(By.id("signInSubmit")).click();
	WebElement w5=driver.findElement(By.id("twotabsearchtextbox"));
	boolean b=w5.isEnabled();
	Assert.assertTrue(b);
	
	
}
}