package Broken_Link_Concept;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_link_Mkt {
	static ChromeDriver driver;

	@Test
	static void broken_link() throws IOException {

		driver = new ChromeDriver();

		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		int x = l1.size();
		System.out.println("Total links are presnt here:-" + x);

		for (WebElement w1 : l1) {

			String url = w1.getAttribute("href");
			System.out.println(url);
			verify_each_link(url);
		}

	}

	static void verify_each_link(String url) throws IOException,ClassCastException {
try {
		URL u1 = new URL(url);
		try {
		HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();

		if (h1.getResponseCode() == 200) {

			System.out.println("VALID link " + " "+ h1.getResponseMessage()+" "+ h1.getResponseCode());
		}

		else {

			System.out.println("INVALID link " +" "+ h1.getResponseMessage()+" "+ h1.getResponseCode());
		}
		
		}
		catch(ClassCastException c) {
			
		}
}
catch(MalformedURLException m){
	
	
}
	}

}
