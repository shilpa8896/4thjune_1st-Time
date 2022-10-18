package Com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.base.TestBase;

public class OrangeHRMHomepage extends TestBase{

	
//1
	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	WebElement Reports;
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	WebElement ReporterName;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement SearchButton;
	
//2	
	public OrangeHRMHomepage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
//3
	public String  Reporterpage(String Name) throws InterruptedException { 
		
		Reports.click();
		Thread.sleep(2000);
		ReporterName.sendKeys(Name);
		
		return ReporterName.getText();
	}
	
}
