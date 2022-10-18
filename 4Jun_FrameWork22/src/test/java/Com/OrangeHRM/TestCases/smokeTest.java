package Com.OrangeHRM.TestCases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Com.Orange.qa.Pages.OrangeHRMAdminPage;
import Com.Orange.qa.Pages.OrangeHRMLoginpage;
import Com.OrangeHRM.qa.base.TestBase;

public class smokeTest extends TestBase{
	
	OrangeHRMLoginpage Loginpage;
	OrangeHRMAdminPage smoke;
	public smokeTest() throws IOException {
		super();
	
	}

	@AfterMethod
	public void setup() throws IOException {
		initialization();
		
		 Loginpage = new OrangeHRMLoginpage();
		 smoke= new OrangeHRMAdminPage();
	}
	
	@Test
	public void smoke() throws InterruptedException {
		
		 Loginpage.Validateusername(props.getProperty("Username"), props.getProperty("Password"));
		 Thread.sleep(5000);
		 smoke.displaypage();
		 smoke.logoo();
	}
	
	@AfterMethod
	public void teaedown() {
		driver.quit();
	}
	

}
