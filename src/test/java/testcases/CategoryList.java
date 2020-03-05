package testcases;

import org.testng.annotations.Test;

public class CategoryList extends Common_Functions {
	
	@Test
public void Testcases() throws InterruptedException {
	Wait(4000);
	Javascroller("menu14");
	Click(1, "menu14");
	Wait(2000);
	Click(2,"Category List");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Wait(2000);

  Click(3,"(//section[@id='content3']/div/div/div/button/i)[1]");
  Click(3,"//span/button/i");
  Wait(2000);
  DropDown("//app-categories/div/div/app-industry-business-line/div/div/div[2]/div/select", "Consumer Banking");
  Wait(2000);
  
  Click(3,"//div[1]/label");
  Wait(1000);

  Click(3,"(//button[@class='btn btn-round-edge btn-line green_btn'])[3]");
  Click(3,"//button[@type='submit']");
  Wait(2000);
  Click(3,"(//section[@id='content3']/div/div/div/button/i)[1]");
  TextField(3,"(//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[1]","abc");
  TextField(4,"itemDesc", "test");
  Click(3,"//button[@type='submit']");
  Wait(2000);
  Click(3,"//div[@id='accordion']/div/div[1]");
  Click(3,"//section[@id='content3']/div/div/div/button[3]");
  TextField(4,"itemName","test");
  Click(3,"//button[@type='submit']");
  Wait(2000);
  Click(3,"//section[@id='content3']/div/div/div/button[2]");
  Click(3,"(//button[@class=\"btn btn-round-edge btn-line green_btn\"])[2]");
  
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