package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	String [][] data = {
		{"test", "bbb"},
		{"testa", "bbbb"},
		{"test", "bbbbb"},
		{"testaa", "bbb"},
	};
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}
	

	@Test(dataProvider = "loginData")
	public void loginWithBothCorrect(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.com");
		WebElement userName =  driver.findElement(By.id("login_username"));
		userName.sendKeys(uName);
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys(pWord);
		WebElement loginBtn = driver.findElement(By.name("sub_btn"));
		loginBtn.click();
		driver.quit();
	}
}
