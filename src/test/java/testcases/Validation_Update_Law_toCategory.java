package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Validation_Update_Law_toCategory extends Common_Functions{
	
	@Test(priority=1)
	public void Testcase1() throws InterruptedException {
    Wait(3000);
	Click(1, "menu1");
	Wait(2000);
	Click(2, "Define Law Requirements");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	Wait(2000);
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"(//div[@col-id='categoryName'])[2]/following-sibling::div[2]");
	
	Wait(2000);
		
		
    WebElement section = driver.findElement(By.xpath("(//div[@col-id=\"section\"])[5]//a"));
	String value = section.getText();
	System.out.println("Comleted Law of Legal Module  :"+value);

	Wait(3000);
	Javascroller("menu14");
	Click(1, "menu14");
		 
	Click(2,"Update Law to Category");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
	DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"//button[@class=\"btn btn-primary\"]");
	Wait(3000);
	TextField(3,"(//input[@type=\"text\"])[1]",value);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
		 
		 
	WebElement sec = driver.findElement(By.xpath("(//div[@col-id='section'])[2]"));
	String value1 = sec.getText();
	System.out.println("Law in Update_Law_To_Category" +value1);
			
	if(value1.equals(value)) {
		System.out.println("Law Matched");}
			else {
			System.out.println("Not Available");}
	}
			
	
	
	@Test(enabled=false)
	public void Testcase2() throws InterruptedException {
	Javascroller("menu1");
	Click(1, "menu1");
	Wait(3000);
	Click(2, "Define Law Requirements");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	Wait(2000);
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"(//div[@col-id='categoryName'])[2]/following-sibling::div[3]");
	Wait(2000);
				
				
	WebElement section = driver.findElement(By.xpath("(//div[@col-id=\"section\"])[3]//a"));
	String value = section.getText();
	System.out.println("\n\nSubmit for Approval law of Legal_Module :"+value);

	Wait(3000);
	Javascroller("menu14");
	Click(1, "menu14");
				 
	Click(2,"Update Law to Category");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
	DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"//button[@class=\"btn btn-primary\"]");
	Wait(3000);
	TextField(3,"(//input[@type=\"text\"])[1]",value);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
				 
				 
	WebElement sec = driver.findElement(By.xpath("(//div[@col-id='section'])[2]"));
	String value1 = sec.getText();
	System.out.println("Law in Update_Law_To_Category :" +value1);
					
	  if(value1.equals(value)) {
		System.out.println("Law Matched");}
		else {
		System.out.println("Not Available");
		}
	}
	
	
	@Test(priority=3)
	public void Testcase3() throws InterruptedException {
	Javascroller("menu1");
	Click(1, "menu1");
	Wait(2000);
	Click(2, "Define Law Requirements");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	Wait(2000);
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"(//div[@col-id='categoryName'])[2]/following-sibling::div[4]");
	Wait(2000);
	
	WebElement section = driver.findElement(By.xpath("(//div[@col-id=\"section\"])[3]//a"));
	String value = section.getText();
    System.out.println("\n\nOpen_Law of Legal_Module :"+value);

    Wait(3000);
    Javascroller("menu14");
    Click(1, "menu14");
    Click(2,"Update Law to Category");
    DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
    DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
    Click(3,"//button[@class=\"btn btn-primary\"]");
	Wait(3000);
	TextField(3,"(//input[@type=\"text\"])[1]",value);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
				 
	WebElement sec = driver.findElement(By.xpath("(//div[@col-id='section'])[2]"));
	String value1 = sec.getText();
	System.out.println("Law in Update_Law_To_Category  :" +value1);
					
	if(value1.equals(value)) {
	System.out.println("Law Matched");}
	else {
	System.out.println("Not Available");}
	}
		
	
	@Test(priority=4)
	public void Testcase4() throws InterruptedException {
	Wait(2000);
	Javascroller("menu1");
	Click(1, "menu1");
	Wait(3000);
	Click(2, "Define Law Requirements");
	DropDown("(//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"])[1]","Banking");
	Wait(2000);
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"(//div[@col-id='categoryName'])[2]/following-sibling::div[5]");
	Wait(2000);
				
				
	WebElement section = driver.findElement(By.xpath("(//div[@col-id=\"section\"])[3]//a"));
	String value = section.getText();
	System.out.println("\n\nDrafts_Law of Legal_Module :"+value);

	Wait(3000);
	Javascroller("menu14");
	Click(1, "menu14");
				 
	Click(2,"Update Law to Category");
	DropDown("//select[@class=\"form-control ng-untouched ng-pristine ng-valid\"]","Banking");
	DropDown("//select[@class=\"form-group form-control ng-untouched ng-pristine ng-valid\"]","Mortgage");
	Click(3,"//button[@class=\"btn btn-primary\"]");
	Wait(3000);
	TextField(3,"(//input[@type=\"text\"])[1]",value);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
	Wait(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.BACK_SPACE);
				 
				 
	WebElement sec = driver.findElement(By.xpath("(//div[@col-id='section'])[2]"));
	String value1 = sec.getText();
	System.out.println("Law in Update_Law_To_Category :" +value1);
					
	  if(value1.equals(value)) {
		System.out.println("Law Matched");}
		else {
		System.out.println("Not Available");}
		}
	











}

			
		 
	


