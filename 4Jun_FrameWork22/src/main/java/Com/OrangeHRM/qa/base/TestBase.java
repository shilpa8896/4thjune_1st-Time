package Com.OrangeHRM.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.OrangeHRM.qa.Util.TestUtil;
import net.bytebuddy.utility.RandomString;

public class TestBase {
  
	
	
	public static WebDriver driver;
	public static Properties props;
	
	public TestBase() throws IOException {
		
		props = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Ravi\\Desktop\\shilpa\\4Jun_FrameWork22\\src\\main\\java\\Com\\OrangeHRM\\qa\\Config\\config.properties");
		
		props.load(ip);
	}
	
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ravi\\Downloads\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			
		driver.get(props.getProperty("url"));
	}
	
	public String getScreenshotAs(String testCaseName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
				
		File source =ts.getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(5);		
		String destination = System.getProperty("user.dir")+"/reports/"+testCaseName+""+Random+".png";
		
		FileUtils.copyFile(source, new File(destination));
		
		return destination;
		
	}
	

	



	
} 