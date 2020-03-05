package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Edit_Law extends Common_Functions {
	
	@Test(enabled=true)
	public void TestCases_Add_update_Delete() throws InterruptedException {
    Wait(4000);
	Javascroller("menu14");
	Click(1, "menu14");
	Click(2, "Edit Law Requirement");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]", "Banking");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[2]", "Mortgage");
	Click(3, "(//button[@class=\"btn btn-primary\"])[2]");
	Wait(2000);
	Click(3, "(//div[@col-id='section'])[3]//a");
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
	
	
	
    @Test(enabled=false)
    public void update() throws InterruptedException {
    Wait(3000);
    Javascroller("menu14");
    Click(1, "menu14");
    Click(2, "Edit Law Requirement");
    DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]", "Banking");
	//DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]", "Mortgage");
	//if(Login=\dev) { enable below line and comment above line
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[2]","Mortgage");
	
	
	Click(3, "(//button[@class=\"btn btn-primary\"])[2]");
	Wait(2000);
	TextField(3,"//input[@type=\"text\"]","§1024.40");
	Click(3,"(//div[@col-id=\"section\"])[2]//a");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0,500);");
	Click(3,"(//button[@class=\"btn btn-primary btn-sm\"])[2]");
    TextField(3,"//textarea[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","..UPDATE");
    Click(3,"(//button[@class=\"btn btn-round-edge btn-line green_btn\"])[2]");
    System.out.println("Reuirement Updated from Edit Law Requirement");
    
    }
    
  
    }
   
	


