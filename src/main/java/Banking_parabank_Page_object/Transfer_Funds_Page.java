package Banking_parabank_Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Transfer_Funds_Page {
WebDriver driver ;
public Transfer_Funds_Page(WebDriver driver ) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(linkText="Transfer Funds")
WebElement Transfer_Funds;
@FindBy(xpath="//h1[normalize-space()='Transfer Funds']")
WebElement Transfer;
@FindBy(xpath="//input[@id='amount']")
WebElement amount;

/*
 * @FindBy(xpath="//select[@id='fromAccountId']") WebElement fromAccountId;
 * 
 * @FindBy(xpath="//select[@id='toAccountId']") WebElement toAccountId;
 */
@FindBy(xpath="//input[@value='Transfer']")
WebElement Transfer_btn;
@FindBy(xpath="//div[@id='showResult']//p[1]")
WebElement showResult1;

public void transfer() throws Exception {
	
	Thread.sleep(2000);
	Transfer_Funds.click();
	amount.sendKeys("150");
	
	/*
	 * Select trans_id = new Select(fromAccountId); trans_id.selectByValue("13455");
	 * Select trans_to = new Select(toAccountId); trans_to.selectByValue("13455");
	 */
	Transfer_btn.click();
	String text_message=showResult1.getText();
System.out.println(text_message);
}

}
