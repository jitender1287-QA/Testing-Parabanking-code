package Banking_parabank_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_login_info_Page {

	WebDriver driver;
	
	public Forgot_login_info_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Forgot login info?")
	WebElement Forgot_login_info;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath="//input[@id='address.street']")
	WebElement street;

	@FindBy(xpath="//input[@id='address.city']")
	WebElement city;

	@FindBy(xpath="//input[@id='address.state']")
	WebElement state;
	@FindBy(xpath="//input[@id='address.zipCode']")
	WebElement zipCode;

	@FindBy(xpath="//input[@id='ssn']")
	WebElement ssn;

	@FindBy(xpath="//input[@value=\"Find My Login Info\"]")
	WebElement Login_Info;
	
	public void Find_my_account_detail() throws Exception {
		Thread.sleep(2000);
		Forgot_login_info.click();
		firstName.sendKeys("jitender12871");
		lastName.sendKeys("chauhan");
		street.sendKeys("c-5/14 meet nagar delhi 110094");
		city.sendKeys("Delh");
		state.sendKeys("india");
		zipCode.sendKeys("110094");
		ssn.sendKeys("Sh1287");
		Login_Info.click();
		
	}
}
