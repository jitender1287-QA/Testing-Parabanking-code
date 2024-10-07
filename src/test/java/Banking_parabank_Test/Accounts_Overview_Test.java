package Banking_parabank_Test;

import org.testng.annotations.Test;

import Banking_parabank.parasoft.com.Banking_parabank.parasoft.com.BaseClass;
import Banking_parabank_Page_object.Account_Login_Page;
import Banking_parabank_Page_object.Accounts_Overview_Page;
import Banking_parabank_Page_object.Register_Account_Page;

public class Accounts_Overview_Test extends BaseClass{

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
public void Test_Account_oerview() throws Exception {
	Accounts_Overview_Page Account_rivew= new Accounts_Overview_Page(driver);
	Account_rivew.account_overview();
}
}

