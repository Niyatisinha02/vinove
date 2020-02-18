package testcases;

import org.testng.annotations.Test;

public class Edit_Law extends Common_Functions{
	
	@Test
	public void TestCases() throws InterruptedException {
    Wait(3000);
	Javascroller("menu14");
	Click(1, "menu14");
	Click(2, "Edit Law Requirement");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]", "Banking");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]", "Mortgage");
	Click(3, "(//button[@class=\"btn btn-primary\"])[2]");
	Wait(2000);
	Click(3, "(//div[@col-id='section'])[2]//a");
	selectList("//input[@type='checkbox']/following-sibling::label");
	Click(3, "//span[text()='Add Requirement']");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]", "Define Requirement");
	TextField(3, "//textarea[@class=\"form-control ng-untouched ng-pristine ng-valid\"]", "Test");
    Click(3, "(//button[@class=\"btn btn-round-edge btn-line green_btn\"])[2]");
    Wait(2000);
    Click(3, "(//button[@class=\"btn btn-primary btn-sm\"])[1]");
    TextField(3,"//textarea[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","EDIT");
    Click(3,"(//button[@class=\"btn btn-round-edge btn-line green_btn\"])[2]");
    Wait(2000);
    Click(3, "(//button[@class=\"btn btn-danger btn-sm\"])[1]");
    Click(3, "(//button[@class=\"btn btn-round-edge btn-line green_btn\"])[2]");
    Click(3, "(//button[@class=\"btn btn-round-edge btn-line green_btn\"])[1]");
    System.out.println("All Test cases passed");
   
	}

}

