package ui.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.LogStatus;

import ui.pageobjects.pagehelpers.FunctionalLibrary;
import ui.pageobjects.pagehelpers.PageObjectBase;

public class LoginPage extends PageObjectBase{
		
	@FindBy(id = "user_name")
	public static WebElement USERNAME;
	
	@FindBy(id = "Password")
	public static WebElement PASSWORD;
	
	@FindBy(id = "termsConditions")
	public static WebElement Terms;
	
	@FindBy(xpath = "//button[text()='Login']")
	public static WebElement Login;
	
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
		
      }

	public void clickonLOGIN_Button()throws Exception{
		helper.highlighter(driver,Login);
		helper.Click(driver, test,Login,"Login");
		helper.wait(driver,Terms,30);
	}
	
	public void setLoginCredentials() throws Exception {
		
		USERNAME.sendKeys(prop.getProperty("username_test"));
		PASSWORD.sendKeys(prop.getProperty("password_test"));
		Terms.click();
		helper.highlighter(driver, Login);
		Login.click();
		
	}
			

	public HomePage Homepage() throws InterruptedException {

		return new HomePage();
	}

	

}
