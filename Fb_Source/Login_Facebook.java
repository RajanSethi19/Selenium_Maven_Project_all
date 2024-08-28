package Fb_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Facebook {
	@FindBy(id = "email")
	WebElement email_user;

	@FindBy(name = "pass")
	WebElement pwd;

	@FindBy(xpath = "//button[@name=\"login\"]")
	WebElement login_bu;

	
	public void username() {
		email_user.sendKeys("rajansethi19@gmail.com");
		;
	}

	public void password() {

		pwd.sendKeys("rajanlovemapa");
	}

	public void login_button() {

		login_bu.click();
	}

	
	public Login_Facebook(ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
