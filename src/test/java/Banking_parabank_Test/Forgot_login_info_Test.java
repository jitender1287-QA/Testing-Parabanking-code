package Banking_parabank_Test;

import org.testng.annotations.Test;

import Banking_parabank.parasoft.com.Banking_parabank.parasoft.com.BaseClass;
import Banking_parabank_Page_object.Forgot_login_info_Page;


public class Forgot_login_info_Test extends BaseClass{
@Test(priority=1)
	
	public void launch_Url() {
		Launch_App_Test lanuch_url1= new Launch_App_Test();
		lanuch_url1.WebBrowser();
	}
	
	

@Test(priority=2)
public void Test_Forget_account() throws Exception {
	Forgot_login_info_Page Forget_login= new Forgot_login_info_Page(driver);
	Forget_login.Find_my_account_detail();
}

}
