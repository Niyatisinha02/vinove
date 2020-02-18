package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestLogin {

	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://dev-lineage.azimuthgrc.com/#/login");
	}
	
	
	@Test(priority=1)
	public void Login() throws InterruptedException{
		
		driver.findElement(By.id("user_name")).sendKeys("mohd.zeeshan@mail.vinove.com");;
		driver.findElement(By.id("Password")).sendKeys("Qwerty@123");;
		driver.findElement(By.id("termsConditions")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//*[text()='Search Laws'])[2]")).getText(), "Search Laws");
		

	}
	
	/*@Test(priority=2)
	public void Accept_Laws(){
		driver.findElement(By.xpath("//a/label[contains(text(),'Accept Laws')]")).click();
		
		Select sel= new Select(driver.findElement(By.xpath("(//select[@ng-reflect-model='[object Object]'])[1]")));
		sel.selectByVisibleText("Banking");
	}*/
	public void Select(String Path, String Value){
		Select sel = new Select(driver.findElement(By.xpath(Path)));
		sel.selectByVisibleText(Value);
		
		
	}
	public String getFirstSelectedTxt(String Path){
		Select sel = new Select(driver.findElement(By.xpath(Path)));
		return sel.getFirstSelectedOption().getText();
	}
	
	public int countOptions(String path){
		Select sel = new Select(driver.findElement(By.xpath(path)));
		List<WebElement> l = sel.getOptions();
		return l.size();
		
	}
	public void Select(String Path, int Value){
		Select sel = new Select(driver.findElement(By.xpath(Path)));
		sel.selectByIndex(Value);
		
		
	}
	public int random(int range){
	      int rand = (int)(Math.random() * range) ; 
	      if(rand==0){
	    	  rand = (int)(Math.random() * range) ;
	      }
	      System.out.println(rand);
	      return rand;
	}
	
	
	
	
	@Test(priority=2)
		public void Azimuth_maintenance() throws InterruptedException{
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("return arguments[0].scrollIntoView(true)", driver.findElement(By.id("menu14")));
		Thread.sleep(2);
		driver.findElement(By.id("menu14")).click();
		driver.findElement(By.xpath("//ol[@_ngcontent-c7]/li[9]")).click();
		Select("(//select[@_ngcontent-c9])[1]", "Banking");
		Select("(//select[@_ngcontent-c9])[2]","Mortgage");
		driver.findElement(By.xpath("(//button[@_ngcontent-c9])[3]")).click();
		driver.findElement(By.xpath("(//div[@col-id='section'])[4]//a")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@type='checkbox']/following-sibling::label")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@type='checkbox']/following-sibling::label")) );
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));    
        System.out.println( elements.size());

        for(WebElement ele : elements){
            //ele.sendKeys("hexbyes");
    		jse.executeScript("arguments[0].click();",ele );

            System.out.println(ele.getText());
		}
        driver.findElement(By.xpath("//span[text()='Add Requirement']")).click();
        int noOfEle =countOptions("//select[@_ngcontent-c26]");
        
       int listIndex = random(noOfEle);
     Select("//select[@_ngcontent-c26]", "Define Requirement");
     //if(getFirstSelectedTxt("//select[@_ngcontent-c26]").equals("Define Requirement"))
    // {
    	 driver.findElement(By.xpath("//textarea[@_ngcontent-c26]")).sendKeys("test");
    // }
     driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	}

	@AfterMethod
	public void afterTest(){
		//driver.close();
	}
	
	
	
}
