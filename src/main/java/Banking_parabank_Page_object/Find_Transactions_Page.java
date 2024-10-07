package Banking_parabank_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Find_Transactions_Page {
WebDriver driver;
	
	public Find_Transactions_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Find Transactions")
	WebElement Find_Transactions ;
	@FindBy(xpath="//input[@id='transactionId']")
	WebElement transactionId ;
	@FindBy(xpath="//button[@id='findById']")
	WebElement findById_btn;
	//find by date
	@FindBy(linkText="Find Transactions")
	WebElement Find_Transactions1;
	@FindBy(xpath="//input[@id='transactionDate']")
	WebElement transactionDate;
	@FindBy(xpath="//button[@id='findByDate']")
	WebElement findByDate;
	//find by date range 
	@FindBy(linkText="Find Transactions")
	WebElement Find_Transactions2;
	@FindBy(xpath="//input[@id='fromDate']")
	WebElement fromDate;
	@FindBy(xpath="//input[@id='toDate']")
	WebElement toDate;
	@FindBy(xpath="//button[@id='findByDateRange']")
	WebElement findByDateRange_btn;
	// find by money
	@FindBy(linkText="Find Transactions")
	WebElement Find_Transactions3;
	@FindBy(xpath="//input[@id='amount']")
	WebElement amount;
	@FindBy(xpath="//button[@id='findByAmount']")
	WebElement findByAmount;
	public void transactionId_01() throws Exception {
		
		Thread.sleep(2000);
		Find_Transactions.click();
		transactionId.sendKeys("13788");
		findById_btn.click();
		Thread.sleep(1000);
		Find_Transactions1.click();
		transactionDate.sendKeys("15-05-2024");
		Thread.sleep(1000);
		findByDate.click();
		
		Thread.sleep(1000);
		Find_Transactions2.click();
		fromDate.sendKeys("15-05-2024");
		toDate.sendKeys("15-05-2024");
		findByDateRange_btn.click();
		Thread.sleep(1000);
		Find_Transactions3.click();
		amount.sendKeys("50");
		Thread.sleep(1000);
		findByAmount.click();
	}
	
}
