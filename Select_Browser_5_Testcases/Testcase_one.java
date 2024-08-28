package Select_Browser_5_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase_one {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		/*
		 * WebElement e3=driver.findElement(By.xpath("(//span[.=\"English\"])[3]"));
		 * 
		 * WebElement
		 * e4=driver.findElement(By.xpath("//a[@href=\"#switch-lang=te_IN\"]")); Actions
		 * a1 = new Actions(driver);
		 * a1.moveToElement(e3).moveToElement(e4).click().perform(); driver.close();
		 */
		
		  Thread.sleep(2000);
		  WebElement e1 = driver.findElement(By.xpath("(//a[@aria-label=\"Choose a language for shopping.\"])[1]"));
		  Thread.sleep(2000);
		  WebElement e2 = driver .findElement(By.xpath( "//div[@id='nav-flyout-icp']//span[@dir='ltr'][contains(text(),'తెలుగు')]"));
		  Thread.sleep(2000); 
		  Actions a = new Actions(driver);
		  a.moveToElement(e1).moveToElement(e2).click().perform(); 
		  driver.close();
		 

	}

}
