package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LoginPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithPOMStepsDefn {
	WebDriver driver;
	LoginPOM loginPOM;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    driver = new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/v1/");
	    loginPOM = new LoginPOM(driver);
	    
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_id_and_password(String userName, String password) {
	   loginPOM.enterUsername(userName);
	   loginPOM.enterPassword(password);
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPOM.submitBtn();
		Thread.sleep(5000);
	}
	
	@Then("User is navigate to home page")
	public void user_is_navigate_to_home_page() {
	   Assert.assertTrue(driver.getTitle().toString().equals("Swag Labs"), "Successful Login");
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}


}
