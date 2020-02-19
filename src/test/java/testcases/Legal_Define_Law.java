package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Legal_Define_Law extends Common_Functions{
	
@Test
public void Testcases() throws InterruptedException {
	Wait(3000);
	Click(1, "menu1");
	Click(2, "Define Law Requirements");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	Wait(2000);
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"(//div[@col-id=\"completed\"])[2]//a");
	Wait(2000);
	TextField(3,"//input[@type=\"text\"]","§1024.40");
	Wait(1000);
	System.out.println("Completed Law :Legal Module");
}



}
