package testcases;

import org.testng.annotations.Test;

public class Accept_LAws extends Common_Functions {

	@Test
public void Testcases() throws InterruptedException {
Click(2,"Accept Laws");
Wait(2000);
DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
Wait(2000);
Click(3,"(//td[@class=\"undefined ng-star-inserted\"])[2]");
TextField(3,"//input[@type=\"text\"]","22164");
Click(3, "(//div[@col-id=\"section\"])[2]");
//driver.close();
	}

	
}
