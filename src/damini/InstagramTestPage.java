package damini;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.BrowserLaunch;

public class InstagramTestPage extends BrowserLaunch{
	

	
	@BeforeClass
	public void setup() {
		BrowserLaunch.brw("chrome");
	}

	@Test
	public void InstagramLoginPageTest() {
		InstagramLoginPage ip = new InstagramLoginPage(driver);
		ip.VarifyInstagramLoginPageLogo();
		ip.SetInstagramLoginPageUsername("ade");
		ip.SetInstagramLoginPagePassword("245dg");
		ip.ClickInstagramLoginPageloginbutton();
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}
