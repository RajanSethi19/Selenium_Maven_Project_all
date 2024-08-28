package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Program_two {

	WebDriver driver;

	@Test
	public void method_one() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement w = driver.findElement(By.id("APjFqb"));
		w.sendKeys("Grotechminds" + Keys.ENTER);

		// WebDriverwait wait = WebDriver
		WebElement w1 = driver.findElement(By.xpath("//a[@class=\"gb_d\"]"));
		w1.click();
		driver.switchTo().frame("app");

		WebElement w2 = driver.findElement(By.xpath("(//span[@class=\"MrEfLc\"])[4]"));
		w2.click();
		driver.switchTo().defaultContent();

		WebElement w3 = driver.findElement(By.xpath("//form[@id=\"search-form\"]//div//input"));
		w3.sendKeys("grotechminds");
		w3.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class=\"yt-spec-touch-feedback-shape__fill\"])[10]")).click();

	}
}