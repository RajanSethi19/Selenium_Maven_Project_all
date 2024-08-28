package Fb_Test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Fb_Source.HomePage_search;
import Fb_Source.Login_Facebook;

public class Testcase_searchbutton {
	
	@Test
	public void search() {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	HomePage_search hm =new HomePage_search(driver);
	
	Login_Facebook lo= new Login_Facebook(driver);
	lo.username();
	lo.password();
	lo.login_button();
	hm.search_textbox();
}
}