package Banking_parabank.parasoft.com.Banking_parabank.parasoft.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 public static WebDriver driver =null;

		@BeforeTest
			public void setupbrowser()  {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				
			}
			@AfterTest
			public void teardown() {
				//driver.close();
			}
}


