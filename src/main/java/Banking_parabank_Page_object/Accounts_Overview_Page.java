package Banking_parabank_Page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accounts_Overview_Page {
WebDriver driver;
	
	public Accounts_Overview_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[normalize-space()='13566']")
	WebElement account_number ;
	@FindBy(xpath="//div[@id='accountDetails']//table//td")
	List<WebElement> balance_check ;
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	@FindBy(xpath="//select[@id='transactionType']")
	WebElement transactionType;
	@FindBy(xpath="//input[@value='Go']")
	WebElement Go_btn;
	
	public void account_overview() throws Exception {
		Thread.sleep(4000);
		account_number.click();
		WebElement text=balance_check.get(0);
		System.out.println(text);
		
		Select sel = new Select(month);
		sel.selectByVisibleText("May");	
		Select sel1 = new Select(transactionType);
		sel1.selectByVisibleText("Credit");	
		Go_btn.click();
	}
	
}
