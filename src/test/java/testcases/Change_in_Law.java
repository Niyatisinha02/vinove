package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Change_in_Law extends Common_Functions{

	@Test
	public void Execution() throws InterruptedException {
	Click(3, "(//a[@class=\"ng-star-inserted\"])[6]");
	Wait(2000);
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]", "Banking");
	Wait(1000);
	
	//DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	// if login = dev //enable below line and comment above line
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[2]","Mortgage");
	
	Click(3, "(//a[@class=\"treeDisplay ng-star-inserted\"])[2]");
	TextField(3,"//input[@type=\"text\"]","§1024.40");
	
		Wait(3000); 
		Click(3,"(//div[@col-id='section'])[2]//a"); 
		JavascriptExecutor jse = (JavascriptExecutor)driver; jse.executeScript("scroll(0,200);");
		Wait(4000);
		 Click(3,"//button[@class=\"btn btn-round-edge btn-line green_btn\"]");
		 System.out.println("Requirement Accepted from Change in Law");
		 
	
	
		
	}
}
