package Cross_Browser_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program_one {
	static WebDriver driver;

	@Test
	@Parameters("browser")
	public void Testcase1(String a1) {

		if (a1.equals("chrome")) {

			driver = new ChromeDriver();
		}
		if (a1.equals("edge")) {

			driver = new EdgeDriver();
		}
		if (a1.equals("firefox")) {

			driver = new FirefoxDriver();
		}

		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}
}
