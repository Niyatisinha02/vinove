package testcases;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import ui.pageobject.LoginPage;
import ui.pageobjects.pagehelpers.PageObjectBase;

public class TestRole extends PageObjectBase {
    @Test
    public void testLogin_EmployeeMaster() throws Exception {

        loginPage = new LoginPage();
        test.log(LogStatus.INFO, "Verify Login Credentials");
        loginPage.setLoginCredentials();
        
        Thread.sleep(10000);
        homePage = loginPage.Homepage();
        homePage.clickOnAcceptLaws();
        
        

        role = homePage.Role();
        role.EnterDataOnRole();
    }
}
