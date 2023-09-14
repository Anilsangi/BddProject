package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp= new LoginPage(driver);
	    
	}

	@When("User Opens URL {string}")
	public void user_Opens_URL(String url) {
		driver.get(url);
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String psw) {
		lp.setUsername(email);
		lp.setPassword(psw);
	    
	}

	@When("click on login")
	public void click_on_login() {
		lp.clickonLogin();
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		
	    if(driver.getPageSource().contains("Login was unsuccessful."))
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	else {
		Assert.assertEquals(title, driver.getTitle());
	}
	}

	@When("user click on Logout link")
	public void user_click_on_Logout_link() throws InterruptedException {
		Thread.sleep(3000);
	    lp.clickonLogout();
	   
	}

	@Then("Close Browser")
	public void close_Browser() {
	    driver.close();
	}



}
