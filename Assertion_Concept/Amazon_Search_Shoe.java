package Assertion_Concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Amazon_Search_Shoe {
	
	WebDriver driver;
@Test
public void testcase() throws InterruptedException
{
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10074976510291773204&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050531&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	
	e1.sendKeys("Shoe"+Keys.ENTER);
	List<WebElement> e2=driver.findElements(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"]"));

	
	Assert.assertEquals(e2.size(),72);
	
	
	
}}
