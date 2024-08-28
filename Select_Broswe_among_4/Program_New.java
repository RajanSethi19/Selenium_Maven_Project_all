package Select_Broswe_among_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program_New {
	WebDriver driver;

	@Test
	@Parameters("browser")

	public void Testcase1(String a1) {

		if (a1.equals("chrome")) {

			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		}
	}

	@Test
	@Parameters("browser")

	public void Testcase2(String a1) {

		if (a1.equals("firefox")) {

			driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("shoes" + Keys.ENTER);

		}

	}

	@Test
	@Parameters("browser")
	public void Testcase3(String a1) throws InterruptedException {

		if (a1.equals("firefox")) {

			driver = new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement e1 = driver.findElement(By.linkText("Men"));
			Thread.sleep(2000);
			WebElement e2 = driver.findElement(By.linkText("T-Shirts"));
			Thread.sleep(2000);
			Actions a = new Actions(driver);
			a.moveToElement(e1).moveToElement(e2).click().perform();
		}

	}

	@Test
	@Parameters("browser")
	public void Testcase4(String a1) throws InterruptedException {

		if (a1.equals("edge")) {

			driver = new EdgeDriver();
			driver.get("https://grotechminds.com/registration/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Rajan");
			// or we can use relative xpath for fname =(((//form)[3]/div)[1]//input)[1]
			
			driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Sethi");
			
			driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rajansethi19@gmail.com");
			
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Automation123");
			
			driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
			
			driver.findElement(By.xpath("//textarea[@id=\"Present-Address\"]")).sendKeys("Chandigarh");
			
			driver.findElement(By.xpath("//input[@id=\"Pincode\"]")).sendKeys("160001");
			
			driver.findElement(By.xpath("//input[@id=\"relocate\"]")).click();
		
			driver.close();
		}

	}

	@Test
	@Parameters("browser")
	public void Testcase5(String a1) {

		if (a1.equals("edge")) {

			driver = new EdgeDriver();

			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.id("email"));
			username.sendKeys("stbymkt@gmail.com");
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("JUYTRER%");
			WebElement loginbutton = driver.findElement(By.name("login"));
			// loginbutton.click();
			loginbutton.sendKeys(Keys.ENTER);

		}

	}
}
