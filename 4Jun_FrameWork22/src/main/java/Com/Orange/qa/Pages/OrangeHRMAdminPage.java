package Com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.base.TestBase;

public class OrangeHRMAdminPage extends TestBase {


	@FindBy(xpath="//img[@alt=\"company-branding\"]")
	WebElement img;
	
	@FindBy(xpath="//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")
	WebElement logo;
	
	public OrangeHRMAdminPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean displaypage() {
	return img.isDisplayed();
	}
	
	public boolean logoo() {
		return logo.isEnabled();
	}

}
