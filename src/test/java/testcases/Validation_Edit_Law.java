package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Validation_Edit_Law extends Common_Functions{


@Test(enabled=true)
public void get_Law() throws InterruptedException {
	Click(1, "menu1");
	Click(2, "Define Law Requirements");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	Wait(2000);
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"(//div[@col-id=\"completed\"])[2]//a");
	Wait(2000);
	
	WebElement section = driver.findElement(By.xpath("(//div[@col-id=\"section\"])[3]//a"));
	String value = section.getText();
	System.out.println(value);

	    Wait(3000);
	    Javascroller("menu14");
	    Click(1, "menu14");
	    Click(2, "Edit Law Requirement");
	    DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]", "Banking");
		DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]", "Mortgage");
		Click(3, "(//button[@class=\"btn btn-primary\"])[2]");
		Wait(2000);
		TextField(3,"//input[@type=\"text\"]",value);
		
		
		WebElement sec = driver.findElement(By.xpath("(//div[@col-id='section'])[2]//a"));
		String value1 = sec.getText();
		
		//Comparision
		if(value1.equals(value)) {
			System.out.println("Completed Law Matched");
		}
		
		else {
			System.out.println("Not available");
		}
	    
	    
	

}


}
