package Com.OrangeHRM.TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Orange.qa.Pages.OrangeHRMHomepage;
import Com.Orange.qa.Pages.OrangeHRMLoginpage;
import Com.OrangeHRM.qa.base.TestBase;

public class HomepageTest extends TestBase{

	OrangeHRMLoginpage Loginpage;
	OrangeHRMHomepage  Homepage;
	
	public HomepageTest() throws IOException {
		super();
		
	}
  
	@BeforeMethod
	public void Setup() throws IOException {
	
		initialization();
		Loginpage =new OrangeHRMLoginpage();
		Homepage = new OrangeHRMHomepage();
	}
	
	@Test
	public void EmployeeName() throws InterruptedException {
		 
		Loginpage.Validateusername(props.getProperty("Username"), props.getProperty("Password")); 
		Thread.sleep(3000);
		Homepage.Reporterpage(props.getProperty("Name"));
		
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
