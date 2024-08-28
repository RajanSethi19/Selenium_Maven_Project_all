package Fb_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_search {
	ChromeDriver driver;
	@FindBy(xpath = "//input[@placeholder=\"Search Facebook\"]")
	WebElement search_tf;
	
	public void search_textbox() {
		search_tf.sendKeys("vivek" + Keys.ENTER);

	}
	public HomePage_search (ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
