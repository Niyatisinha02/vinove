package testcases;

import org.testng.annotations.Test;

public class Business_Module extends Common_Functions{
	
@Test
public void Testcases_WorkQueue() throws InterruptedException {
 Wait(5000);
double_Click("menu3");
 Wait(2000);
 Click(2,"Work Queue");
 Wait(1000);
 DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
 Wait(2000);
 DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]", "Mortgage");
 TextField(3,"(//input[@type=\"text\"])[1]","§1024.40");
 
}

}
