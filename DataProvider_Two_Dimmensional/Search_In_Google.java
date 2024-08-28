package DataProvider_Two_Dimmensional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Search_In_Google {
	static WebDriver driver;
	@DataProvider(name = "data")
	public Object[][] method1(){
		
		return new Object [][] {{"INDIA"},{"LATSET NEWS"},{"OLYMPICS 2024"},{"AUTOMATION TESTING"},
			{"TOP 10 IT MNC COMPANY LIST"},{"DATA PROVIDER IN TESTNG"},
			{"NARENDRA MODI"},{"YOGI"},{"ABOUT CHANDIGARH"},{"AMAZON"}};
	}
	
	@Test(dataProvider="data")
		
		public void testcase1(String input) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement w=driver.findElement(By.name("q"));
		
		w.sendKeys(input+Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	
		
			
		}
}
