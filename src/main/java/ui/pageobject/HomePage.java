package ui.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ui.pageobjects.pagehelpers.PageObjectBase;

public class HomePage extends PageObjectBase {


	@FindBy(xpath = "//label[contains(text(),'Accept Laws')]")
	public WebElement Accept_laws;

	@FindBy(xpath = "//span[contains(text(),'Switch Role')]")
	public WebElement SwitchRole;
	
	@FindBy(xpath = ".//div/ul/li[2]/a/span[2]/span[contains(text(),'Central Admin')]")
	public WebElement CentralAdmin;
	
	@FindBy(xpath = "//span[text()='Employee Master']")
	public WebElement EmployeeMaster;

	@FindBy(xpath = "//span[text()='Role']")
	public WebElement Role;

	@FindBy(xpath = "//span[text()='Activity']")
	public WebElement Activity;

	@FindBy(xpath = "//span[text()='Employee Role Mapping']")
	public WebElement EmployeeRoleMapping;




	
	
	public HomePage() {

		PageFactory.initElements(driver, this);
		
    }
	
	public void clickOnAcceptLaws() throws Exception {

		helper.highlighter(driver,Accept_laws);
		Accept_laws.click();
		
	}
	

	//PAGES
	public EmployesMaster employesMaster() throws InterruptedException {

		return new EmployesMaster();
	}

	public Role Role() throws InterruptedException {

		return new Role();
	}

	public Activity Activity() throws InterruptedException {

		return new Activity();
	}

	public EmployeeRoleMapping employeeRoleMapping() throws InterruptedException {

		return new EmployeeRoleMapping();
	}
}

