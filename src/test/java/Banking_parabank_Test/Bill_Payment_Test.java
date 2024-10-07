package Banking_parabank_Test;

import org.testng.annotations.Test;

import Banking_parabank.parasoft.com.Banking_parabank.parasoft.com.BaseClass;
import Banking_parabank_Page_object.Account_Login_Page;
import Banking_parabank_Page_object.Bill_Payment_Page;
import Banking_parabank_Page_object.Register_Account_Page;

public class Bill_Payment_Test extends BaseClass{

	@Test(priority=1)
	
	public void launch_Url() {
		Launch_App_Test lanuch_url1= new Launch_App_Test();
		lanuch_url1.WebBrowser();
	}
	
	@Test(priority=2 ,enabled=false)
	
	public void Test_Register_account() {
		Register_Account_Page registeraccount= new Register_Account_Page(driver);
		registeraccount.register_detail();
	}
@Test(priority=3)
	
	public void Test_Account_Login() {
	Account_Login_Page Accountpage_login= new Account_Login_Page(driver);
	Accountpage_login.Account_loginpage();
}
@Test(priority=4)

public void Test_Bill_payment_Payee() throws Exception {
	Bill_Payment_Page Bill_payemnet_payeee = new Bill_Payment_Page(driver);
	Bill_payemnet_payeee.billpay();
}
}
