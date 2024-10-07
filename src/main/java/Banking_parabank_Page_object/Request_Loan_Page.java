package Banking_parabank_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request_Loan_Page {
WebDriver driver;
	
	public Request_Loan_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[normalize-space()='Request Loan']")
	WebElement Request_Loan;
	@FindBy(xpath="//input[@id='amount']")
	WebElement amount ;
	@FindBy(xpath="//input[@id='downPayment']")
	WebElement downPayment;
	@FindBy(xpath="//input[@value='Apply Now']")
	WebElement Apply_Now;
	
	public void loan() throws Exception {
		
		Thread.sleep(2000);
		Request_Loan.click();
		amount.sendKeys("50");
		Thread.sleep(2000);
		downPayment.sendKeys("5");
		Thread.sleep(2000);
		
		Apply_Now.click();
	}
}
