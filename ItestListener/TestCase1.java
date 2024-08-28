package ItestListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListener.Program_one.class)
public class TestCase1 extends Program_one
{

	@Test
	public void amazon_Launch() throws EncryptedDocumentException, IOException
	{
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes" + Keys.ENTER);
	WebElement shoe_45 = driver
			.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[45]"));
	shoe_45.click();
	Set<String> s1 = driver.getWindowHandles();
	Iterator<String> ids = s1.iterator();
	String parent_id = ids.next();
	String child_id = ids.next();
	driver.switchTo().window(child_id);
	WebElement buy_now = driver.findElement(By.id("buy-now-button"));
	buy_now.click();
	FileInputStream f1 = new FileInputStream(
			"C:\\Users\\hp\\eclipse -workspace\\Selenium_Maven_Project\\DDT_01\\rajan_id_pass.xlsx");
	Workbook w1 = WorkbookFactory.create(f1);
	String ph = NumberToTextConverter.toText(w1.getSheet("login").getRow(0).getCell(0).getNumericCellValue());
	String pass = w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
	WebElement ph_no = driver.findElement(By.id("ap_email_login"));
	ph_no.sendKeys(ph);
	WebElement cont_inue = driver.findElement(By.className("a-button-input"));
	cont_inue.click();
	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys(pass);
	driver.findElement(By.id("signInSubmit")).click();
	//driver.findElement(By.className("a-button-input")).click();
	
}
}