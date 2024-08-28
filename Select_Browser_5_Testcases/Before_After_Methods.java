package Select_Browser_5_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Before_After_Methods {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launch(String a1) {

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

	}

	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
