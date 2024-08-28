package Before_After_Method_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_case_1 extends Launch_and_Quit {

	@Test

	public void shoes() throws InterruptedException {

		Thread.sleep(3000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

		search.sendKeys("Shoes" + Keys.ENTER);
	}


}
