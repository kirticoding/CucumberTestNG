package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	WebDriver driver;
	By username = By.xpath("//*[@id='user-name']");
	By password = By.xpath("//*[@id='password']");
	By submitBtn = By.xpath("//*[@id='login-button']");
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	
	public void enterPassword(String passWord) {
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void submitBtn() {
		driver.findElement(submitBtn).click();
	}
	
	

}
