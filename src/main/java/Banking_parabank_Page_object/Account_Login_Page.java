package Banking_parabank_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Login_Page {

	WebDriver driver;
	
	public Account_Login_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement Login_username ;
	@FindBy(xpath="//input[@name='password']")
	WebElement Login_password ;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement Log_In;
	
	public void Account_loginpage() {
		Login_username.sendKeys("jitender13");
		Login_password.sendKeys("Chauhan@9868");
		Log_In.click();
	}
}
