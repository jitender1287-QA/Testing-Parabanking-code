package Banking_parabank_Test;

import org.testng.annotations.Test;

import Banking_parabank.parasoft.com.Banking_parabank.parasoft.com.BaseClass;

public class Launch_App_Test extends BaseClass {

	
	
	@Test
	public void WebBrowser() {
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	
}
