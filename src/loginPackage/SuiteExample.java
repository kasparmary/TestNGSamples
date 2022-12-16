package loginPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long sTime;
	long eTime;
	long totTime;

	@BeforeSuite
	public void launchBrowser() {
		sTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		eTime = System.currentTimeMillis();
		totTime = eTime - sTime;
		System.out.println("Total time take" + totTime);
	}

	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");	
	}
	
	@Test
	public void openBing() {
		driver.get("http://www.bing.com");
	}

	@Test
	public void openYahoo() {
		driver.get("http://www.yahoo.com");
	}
}
