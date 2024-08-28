package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class Program_one {
	WebDriver driver;
	@Test
	public void method_one() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.id("APjFqb"));
		w.sendKeys("Grotechminds"+Keys.ENTER);
		
		
		WebElement w1=driver.findElement(By.xpath("//a[@class=\"gb_d\"]"));
		w1.click();

		WebElement w6=driver.findElement(By.xpath("(//li[@class=\"j1ei8c\"]//a)[4]"));
		w6.click();
		WebElement w8=driver.findElement(By.name("search_query"));
		w8.sendKeys("growtechminds"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class=\"yt-spec-touch-feedback-shape__fill\"])[6]")).click();
		 
		
	}

}
