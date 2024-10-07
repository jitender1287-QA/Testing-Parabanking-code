package Banking_parabank_Page_object;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Account_Page {

	
	WebDriver driver;
	
	public Register_Account_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText="Register")
	WebElement Register1 ;
	@FindBy(xpath="//h1[1]")
	WebElement message ;
	@FindBy(xpath="//input[@id='customer.firstName']")
	WebElement customer_firstName ;
	@FindBy(xpath="//input[@id='customer.lastName']")
	WebElement customer_lastName ;
	@FindBy(xpath="//input[@id='customer.address.street']")
	WebElement customer_address_street;
	@FindBy(xpath="//input[@id='customer.address.city']")
	WebElement customer_address_city;
	@FindBy(xpath="//input[@id='customer.address.state']")
	WebElement customer_address_state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	WebElement customer_address_zipCode;
	
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	WebElement phoneNumber ;
	@FindBy(xpath="//input[@id='customer.ssn']")
	WebElement customer_ssn;
	@FindBy(xpath="//input[@id='customer.username']")
	WebElement customer_username;
	@FindBy(xpath="//input[@id='customer.password']")
	WebElement customer_password;
	@FindBy(xpath="//input[@id='repeatedPassword']")
	WebElement repeatedPassword;
	@FindBy(xpath="//input[@value='Register']")
	WebElement Register_btn;
	public void register_detail() {
		Register1.click();
		
		String text=message.getText();
		System.out.println(text);
		customer_firstName.sendKeys("jitender");
		customer_lastName.sendKeys("chauhan");
		customer_address_street.sendKeys("c-5/14 meet nagar delhi 110094");
		customer_address_city.sendKeys("Delh");
		customer_address_state.sendKeys("india");
		customer_address_zipCode.sendKeys("110094");
		phoneNumber.sendKeys("9716247472");
		customer_ssn.sendKeys("Sh1287");
		/*
		 * Date new1 = new Date();
		 * customer_username.sendKeys(new1.toString().replace(" "," ").replace(" ", " ")
		 * + "jitender");
		 */
		
	
		customer_username.sendKeys("jitender13");
		customer_password.sendKeys("Chauhan@9868");
		repeatedPassword.sendKeys("Chauhan@9868");
		Register_btn.click();
		
	}
	
}
