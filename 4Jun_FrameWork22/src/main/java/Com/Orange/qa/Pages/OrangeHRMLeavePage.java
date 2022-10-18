package Com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.OrangeHRM.qa.base.TestBase;

public class OrangeHRMLeavePage extends TestBase {
	
	

	
	@FindBy(xpath="class=\"oxd-main-menu-item active\"")
	WebElement list;
	
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
	WebElement textleave;
	
	public OrangeHRMLeavePage() throws IOException{
		super();
		
	}
	
	
	public String page (String emplname) throws InterruptedException {
		
		
		list.click();
		textleave.sendKeys(emplname);
		
		return textleave.getText();
	}


	
	
}

