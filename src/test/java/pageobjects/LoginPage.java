package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CacheLookup
	WebElement LogoutBtn;
	
	
	public void setUsername(String uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}
	
	public void setPassword(String psw)
	{
		passWord.clear();
		passWord.sendKeys(psw);
		
	}
	public void clickonLogin()
	{
		LoginBtn.click();
	}
	
	public void clickonLogout()
	{
		LogoutBtn.click();
	}
	
}