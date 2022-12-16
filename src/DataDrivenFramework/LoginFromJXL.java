package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginFromJXL {
	WebDriver driver;
	String [][] data = null;
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("/data/selenium/LoginData.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int columncount = sheet.getColumns();
		String testData[][] = new String[rowCount-1][columncount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<columncount; j++) {
				testData[i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
		
	}

	@Test(dataProvider = "loginData")
	public void loginWithBothCorrect(String uName, String pWord) {
		launchBrowser();
		driver.get("https://demo.com");
		WebElement userName =  driver.findElement(By.id("login_username"));
		userName.sendKeys(uName);
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys(pWord);
		WebElement loginBtn = driver.findElement(By.name("sub_btn"));
		loginBtn.click();
		closeBrowser();
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
