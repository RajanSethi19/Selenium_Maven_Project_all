package Data_Provider_Multi_Dimmensional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Username_passsword_Example {
	WebDriver driver;
	@DataProvider(name = "data")
	public Object[][] method1() {

		Object data[][] = new Object[2][2];// it means 2 rows and 2 column are there
		// First set of data username and password
		data[0][0] = "rajansethi11@gmail.com"; // right username
		data[0][1] = "999966666"; // right password

		data[1][0] = "rajan.sethi@yash.co.in"; // right username
		data[1][1] = "Testing@2023"; // wrong password

		return data;
	}
	@Test(dataProvider = "data")
	public void testcase1(String user, String pass) {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);
		WebElement loginbutton = driver.findElement(By.name("login"));
		// loginbutton.click();
		loginbutton.sendKeys(Keys.ENTER);
	}

	{

	}

	

}
