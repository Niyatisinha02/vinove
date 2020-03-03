package testcases;

import org.testng.annotations.Test;

public class Industry_List extends Common_Functions{

@Test
public void Testcases() throws InterruptedException {
	  Wait(3000);
		Javascroller("menu14");
		Click(1, "menu14");
		Click(2,"Industry List");
		
}
	}
