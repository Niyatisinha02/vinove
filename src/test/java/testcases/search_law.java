package testcases;

import org.testng.annotations.Test;

public class search_law extends Common_Functions{
	
	@Test(enabled=false)
	public void Quick_search() {
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"] )[1]","Banking");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Mortgage");
	Click(3,"(//button[@class=\"btn btn-primary\"])[2]");
	Click(3, "(//div[@col-id=\"section\"])[3]//a");
	}
	
	@Test(enabled=true)
	public void Advanced_search() {
		Click(2,"Advanced Search");
		DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
		DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
		TextField(3,"(//input[@type=\"text\"])[1]","1680");
		Click(3,"(//button[@class=\"btn btn-primary\"])[1]");
		Click(3,"(//div[@col-id=\"section\"])[2]");
		
	}
	
	@Test(enabled=false)
	public void Hierarchy_search() {
    Click(2,"Hierarchy Search");
    DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
    //DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
    Click(3,"//button[@class=\"btn btn-primary\"]");
    
	}

}
