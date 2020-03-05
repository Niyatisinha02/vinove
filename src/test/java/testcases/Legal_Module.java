package testcases;

import org.testng.annotations.Test;

public class Legal_Module extends Common_Functions {

	@Test
	public void TestCases() throws InterruptedException {
	Wait(3000);
		Click(1, "menu1");
		Click(2, "Map Law to Industry Category");
		Wait(2000);
		
		 DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
		 DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Mortgage");
		 //Click(3,"(//button[@_ngcontent-c9])[1]"); Regulator filter
		 //TextField(3,"//input[@_ngcontent-c17][@type='text']", "Arizona");
		 //Click(3,"//input[@id='checkArizona']/following-sibling::label");
		
         //Click(3,"//strong[@_ngcontent-c16][text()='Level 1']"); 
		 Click(3,"(//button[@class=\"btn btn-primary\"])[2]");
		 
	     //WebElement Text =driver.findElement(By.xpath("(//div[@col-id='section'])[2]//a"));
		 //Text.getText(); System.out.println(Text);
		 Wait(5000);
		 Click(3,"(//span[@class=\"ag-selection-checkbox\"])[1]/span[2]");
		 Click(3,"//button[@class=\"btn btn-round-edge btn-line green_btn\"]");
		 Click(3,"(//div[3]/button)[1]"); 
		 Wait(2000);
		 
		// MAP LAW TO CATEGORY
		Click(2, "Map Law to Category");
		DropDown("//select[@class='form-control ng-untouched ng-pristine ng-valid']", "Banking");
		DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]", "Mortgage");
		Click(3, "//button[@class='btn btn-primary']");
		Click(3,"(//span[@class=\"ag-selection-checkbox\"])[1]/span[2]");
		
		DropDown("//select[@name=\"asd\"]", "General");
		DropDown("(//select[@class=\"form-control width-50 ng-untouched ng-pristine ng-star-inserted ng-valid\"])[1]", "Both");
		DropDown("//select[@class=\"form-control width-50 ng-untouched ng-pristine ng-star-inserted ng-valid\"]", "All");
	   //WindowScroller(0, 40);
		Click(3, "//button[@class=\"btn btn-round-edge btn-line green_btn\"]");
		

	}

}
