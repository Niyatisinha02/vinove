package testcases;

import org.testng.annotations.Test;

public class Industry_List extends Common_Functions{

@Test
public void Testcases() throws InterruptedException {
	  Wait(3000);
		Javascroller("menu14");
		Click(1, "menu14");
		Wait(2000);
		Click(2,"Industry List");
		//Click(3, "//div[@id='page-content-wrapper']/app-industry-list/div/div");
		Wait(2000);
		Click(3,"(//section[@id='content3']/div/div/div/button/i)[1]");
		TextField(4,"itemName","airline");
		TextField(4,"itemDesc","test");
		Click(3,"//button[@type='submit']");
		
		Click(3,"(//div[@class='drag ng-star-inserted'])[5]");
		Click(3,"(//section[@id='content3']/div/div/div/button/i)[3]");
	    TextField(4,"itemName","testtt");
	    Click(3,"//button[@type='submit']");
		Click(3,"(//section[@id='content3']/div/div/div/button/i)[2]");
		
		Click(3,"(//button[@class='btn btn-round-edge btn-line green_btn'])[2]");
		
}
	}
