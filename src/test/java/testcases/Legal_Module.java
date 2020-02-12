package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Legal_Module extends Common_Functions {

	@Test
	public void TestCases() throws InterruptedException {
		Wait(2000);
		Click(1, "menu1");
		Click(2, "Map Law to Industry Category");
		Wait(2000);
		
		 DropDown("(//select[@_ngcontent-c15])[1]","Banking");
		 DropDown("(//select[@_ngcontent-c15])[2]","Mortgage");
		 Click(3,"(//button[@_ngcontent-c9])[1]");
		 TextField(3,"//input[@_ngcontent-c17][@type='text']", "Arizona");
		 Click(3,"//input[@id='checkArizona']/following-sibling::label");
		 Click(3,"(//button[@_ngcontent-c16])[2]"); Wait(3000);
         //Click(3,"//strong[@_ngcontent-c16][text()='Level 1']"); 
		 Click(3,"(//button[@_ngcontent-c9])[3]");
		 
	     //WebElement Text =driver.findElement(By.xpath("(//div[@col-id='section'])[2]//a"));
		 //Text.getText(); System.out.println(Text);
		 
		 Click(3,"(//span[@class=\"ag-selection-checkbox\"])[1]/span[2]");
		 Click(3,"(//button[@_ngcontent-c14])[3]");
		 Click(3,"(//button[@_ngcontent-c22])[2]"); Wait(2000);
		 
		// MAP LAW TO CATEGORY
		Click(2, "Map Law to Category");
		DropDown("(//select[@_ngcontent-c15])[1]", "Banking");
		DropDown("(//select[@_ngcontent-c15])[2]", "Mortgage");
		Click(3, "(//span[@class=\"ag-selection-checkbox\"])[1]/span[2]");
		DropDown("//select[@_ngcontent-c16]", "General");
		DropDown("(//select[@_ngcontent-c17])[1]", "Both");
		DropDown("(//select[@_ngcontent-c17])[2]", "All");
		WindowScroller(0, 40);
		Click(3, "//button[@_ngcontent-c16]");
		

	}

}
