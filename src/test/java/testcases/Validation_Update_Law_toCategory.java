package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Validation_Update_Law_toCategory extends Common_Functions{
	@Test
	public void Testcases() throws InterruptedException {

		
		
		Wait(3000);
		Click(1, "menu1");
		Wait(2000);
		Click(2, "Define Law Requirements");
		DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
		Wait(2000);
		DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
		Click(3,"(//div[@col-id='categoryName'])[2]/following-sibling::div[2]");
		Wait(2000);
		
		WebElement section = driver.findElement(By.xpath("(//div[@col-id=\"section\"])[3]//a"));
		String value = section.getText();
		System.out.println(value);

		 Wait(3000);
		 Javascroller("menu14");
		 Click(1, "menu14");
		 
		 Click(2,"Update Law to Category");
		 DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
		 DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
		 Click(3,"//button[@class=\"btn btn-primary\"]");
		 TextField(3,"(//input[@type=\"text\"])[1]",value);
		 Wait(2000);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
		 Wait(2000);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
		 
		 
		 WebElement sec = driver.findElement(By.xpath("(//div[@col-id='section'])[2]"));
			String value1 = sec.getText();
			System.out.println(value1);
			
			if(value1.equals(value)) {
				System.out.println("Completed Law Matched");
			}
			else {
			System.out.println("Not Available");
			}
			
		  Click(3,"//button[@class=\"btn btn-round-edge btn-line green_btn\"]");
		  
			
		}
			
		 
	}


