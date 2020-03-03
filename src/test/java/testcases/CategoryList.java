package testcases;

import org.testng.annotations.Test;

public class CategoryList extends Common_Functions {
	
	@Test
public void Testcases() throws InterruptedException {
	Wait(4000);
	Javascroller("menu14");
	Click(1, "menu14");
	Click(2,"Category List");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");

  Click(3,"//i[@ class=\"fa fa-plus\"]");
		//Click(3,"//div[@class=\"panel-body ng-star-inserted\"]//div[1]");
		  //Click(3,"(//button[@class=\"btn btn-round-edge btn-line gray_btn\"])[1]");
		//  Click(3,"(//button[@class=\"btn btn-round-edge btn-line gray_btn\"])[3]");
		 //Click(3,"//button[@class=\"btn btn-round-edge btn-line blue_btn\"]");
		 
	//TextField(3,"//input[@name=\"itemName\"]","test");
	//TextField(3,"(//input[@type=\"text\"])[2]","test");
   // Click(3,"//button[@type='submit']");
	//Click(3,"(//button[@class=\"btn btn-round-edge btn-line gray_btn\"])[3]");
		

}
}