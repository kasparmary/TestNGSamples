package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPOI {
	static List<String> uNameList = new ArrayList<String>();
	static List<String> pWordList = new ArrayList<String>();
	
	public void readExcel() throws IOException {
		FileInputStream excel = new FileInputStream("/data/selenium/LoginData2.xlsx");
		Workbook workbook = new XSSFWorkbook(excel);
		//Sheet sheet = workbook.getSheet("Sheetname";)
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		
		while(rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			Iterator<Cell> columnIterator = rowValue.iterator();
			int i=2;
			while(columnIterator.hasNext()) {
				if(i%2 == 0) {
					//uNameList.add(columnIterator.next().toString());
					uNameList.add(columnIterator.next().getStringCellValue());	
				} else {
					pWordList.add(columnIterator.next().getStringCellValue());
				}
				i++;
			}
		}
	}

	public void executeTest() {
		for(int i=0; i < uNameList.size(); i++) {
			login(uNameList.get(i), pWordList.get(i));
		}
	}

	public void login(String uName, String pWord) {
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
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDrivenUsingPOI usingPOI = new DataDrivenUsingPOI();
		usingPOI.readExcel();
		System.out.println("Username List" + uNameList);
		System.out.println("Password List" + pWordList);
		usingPOI.executeTest();
	}

}
