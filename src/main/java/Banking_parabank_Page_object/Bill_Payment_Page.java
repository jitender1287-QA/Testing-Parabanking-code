package Banking_parabank_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bill_Payment_Page {

WebDriver driver;
	
	public Bill_Payment_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Bill Pay")
	WebElement Bill_Pay;

	@FindBy(xpath="//input[@name='payee.name']")
	WebElement payee_name;

	@FindBy(xpath="//input[@name='payee.address.street']")
	WebElement payee_address;

	@FindBy(xpath="//input[@name='payee.address.city']")
	WebElement payee_city;

	@FindBy(xpath="//input[@name='payee.address.state']")
	WebElement payee_state;

	@FindBy(xpath="//input[@name='payee.address.zipCode']")
	WebElement payee_zipcode;
	@FindBy(xpath="//input[@name='payee.phoneNumber']")
	WebElement payee_phoneNumber;

	@FindBy(xpath="//input[@name='payee.accountNumber']")
	WebElement payee_accountNumber;

	@FindBy(xpath="//input[@name='verifyAccount']")
	WebElement payee_verifayAccount;
	@FindBy(xpath="//input[@name='amount']")
	WebElement payee_amount;

	@FindBy(xpath="//input[@value='Send Payment']")
	WebElement payee_Send_Payment;
	
	public void billpay() throws Exception {
		
		Thread.sleep(2000);
		Bill_Pay.click();
		payee_name.sendKeys("jitender");
		payee_address.sendKeys("c-5/14 meet nagar delhi 110094");
		payee_city.sendKeys("delhi");
		payee_state.sendKeys("india");
		payee_zipcode.sendKeys("110094");
		payee_phoneNumber.sendKeys("9716247472");
		payee_accountNumber.sendKeys("13455");
		payee_verifayAccount.sendKeys("13455");
		payee_amount.sendKeys("20");
		
		
		payee_Send_Payment.click();
}}
	
	
	