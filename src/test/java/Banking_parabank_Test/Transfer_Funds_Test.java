package Banking_parabank_Test;

import org.testng.annotations.Test;

import Banking_parabank.parasoft.com.Banking_parabank.parasoft.com.BaseClass;
import Banking_parabank_Page_object.Account_Login_Page;
import Banking_parabank_Page_object.Register_Account_Page;
import Banking_parabank_Page_object.Transfer_Funds_Page;

public class Transfer_Funds_Test extends BaseClass{


	@Test(priority=1)
	
	public void launch_Url() {
		Launch_App_Test lanuch_url1= new Launch_App_Test();
		lanuch_url1.WebBrowser();
	}
	
	
@Test(priority=2)
	
	public void Test_Account_Login() {
	Account_Login_Page Accountpage_login= new Account_Login_Page(driver);
	Accountpage_login.Account_loginpage();
}
@Test(priority=3)

public void Test_Transfer_funds() throws Exception {
	Transfer_Funds_Page transfer_funds1= new Transfer_Funds_Page(driver);
	transfer_funds1.transfer();
}
}
