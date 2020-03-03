package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class Add_User extends Common_Functions{
	
	@Test
	public void testcases() throws InterruptedException {
		 Wait(4000);
			Javascroller("menu13");
			Click(1, "menu13");
			Wait(2000);
			
			Click(2, "Add User");
			String val ="test123456789@azimuth.com";
			TextField(4, "email", val);
			
			TextField(4,"lastName","sinha");
			TextField(4, "firstName", "niyati");
			wait(2000);
			Click(3,"//div[@id='page-content-wrapper']/app-create-user/div/div/form/div[4]/div/button/i");
			 Click(3," //div[@id='page-content-wrapper']/app-create-user/div/div/div/div/button[2]/i");
			 TextField(3,"(//input[@type='text'])[8]",val);
			 
			
	}

}
