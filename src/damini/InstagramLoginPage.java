package damini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class InstagramLoginPage {

	@FindBy(xpath= "//div[@style='cursor: pointer;']") private  WebElement logo;
	@FindBy(xpath= "//input[@name='username']")private WebElement username;
	@FindBy(xpath= "//input[@name='password']") private WebElement password;  
	@FindBy(xpath= "//div[text()='Log in']") private WebElement loginButton;
	
	public InstagramLoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	// usage
		public void VarifyInstagramLoginPageLogo() {
			Assert.assertTrue(logo.isDisplayed(),"insta logo is not displayed");
			Reporter.log("VarifyInstagramLoginPageLogo", true);
		}
		
		public void SetInstagramLoginPageUsername(String un) {
			username.sendKeys(un);
			Reporter.log("SetInstagramLoginPageUsername", true);
		}
		
		public void SetInstagramLoginPagePassword(String pass) {
			password.sendKeys(pass);
			Reporter.log("SetInstagramLoginPagePassword", true);
		}
		
		public void ClickInstagramLoginPageloginbutton() {
			loginButton.click();
			Reporter.log("SetInstagramLoginPageLoginbtn", true);
		}
		
	
	
	
}
