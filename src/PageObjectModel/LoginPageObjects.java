package PageObjectModel;

import org.openqa.selenium.By;

public class LoginPageObjects {
	//username, password, submit btn
	public void userName() {
		driver.findElement(By.id("login_username"));
	}
	
	public void password() {
		driver.findElement(By.id("login_password"));
	}
	
	public void loginButton() {
		driver.findElement(By.name("submit_btn"));
	}
}
