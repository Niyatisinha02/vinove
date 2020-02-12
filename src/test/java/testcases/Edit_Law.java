package testcases;

import org.testng.annotations.Test;

public class Edit_Law extends Common_Functions{
	
	@Test
	public void TestCases() throws InterruptedException {
    
	Javascroller("menu14");
	Click(1, "menu14");
	Click(3, "//ol[@_ngcontent-c7]/li[9]");
	DropDown("(//select[@_ngcontent-c9])[1]", "Banking");
	DropDown("(//select[@_ngcontent-c9])[2]", "Mortgage");
	Click(3, "(//button[@_ngcontent-c9])[3]");
	Wait(2000);
	Click(3, "(//div[@col-id='section'])[4]//a");
	selectList("//input[@type='checkbox']/following-sibling::label");
	Click(3, "//span[text()='Add Requirement']");
	DropDown("//select[@_ngcontent-c26]", "Define Requirement");
	TextField(3, "//textarea[@_ngcontent-c26]", "Test");
    Click(3, "//i[@_ngcontent-c26]");
    Click(3, "(//button[@_ngcontent-c24])[1]");
    TextField(3,"//textarea[@_ngcontent-c26]","EDIT");
    Click(3,"//button[@_ngcontent-c26])[2]");
    Click(3, "(//button[@_ngcontent-c25])[1]");
    Click(3, "(//i[@_ngcontent-c27])[1]");
    
	}

}

