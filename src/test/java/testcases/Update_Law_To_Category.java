package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Update_Law_To_Category extends Common_Functions {
@Test
public void TestCases() throws Exception {
	Wait(2000);
	Javascroller("menu14");
	Click(1, "menu14");
	Wait(2000);
	Click(2,"Update Law to Category");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
	DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"//button[@class=\"btn btn-primary\"]");
	Click(3,"(//span[@class=\"ag-selection-checkbox\"])[1]/span[2]");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0,200);");
	

	TextField(3, "//input[@class=\"form-control srch-input ng-untouched ng-pristine ng-valid\"]", "Appraisal");
	Wait(2000);
	Click(3,"//input[@id='check0']/following-sibling::label");
	Click(3,"//button[@class=\"btn btn-danger ng-star-inserted\"]");
	
	Click(3,"//i[@class=\"fa fa-arrow-circle-up\"]");
	jse.executeScript("scroll(200,0);");
	
		/*
		 * Wait(1000); Click(3,"(//span[@class=\"ag-selection-checkbox\"])[1]/span[2]");
		 * jse.executeScript("scroll(0,200);");
		 */
		

	
}
}
