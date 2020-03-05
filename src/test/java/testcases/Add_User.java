package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
			String val ="test12111@azimuth.com";
		
		 TextField(4, "email", val);
		 
		 TextField(4,"lastName","sinha"); TextField(4, "firstName", "niyati");
		 Click(3,"//button[@class=\"btn btn-round-edge btn-line green_btn ng-star-inserted\"]"); 
		 Click(3," //div[@id='page-content-wrapper']/app-create-user/div/div/div/div/button[2]/i"); 
			 TextField(3,"(//input[@type='text'])[8]",val);
			 Wait(2000);
			 Click(3,"(//div[@id='page-content-wrapper']/app-create-user/div/div[3]/table/tbody/tr/td/label)[1]");
			  
		  Wait(2000);
			 driver.findElement(By.name("lastName")).sendKeys(Keys.BACK_SPACE);
			 driver.findElement(By.name("firstName")).sendKeys("A");
			 TextField(4,"middleName","abc");
             TextField(4, "employeeId", "1234");
             TextField(4,"departmentName","IT");
             Click(3, "//button[@class='btn btn-round-edge btn-line green_btn ng-star-inserted']");
			
	}

}
