package testcases;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Common_Functions {
	public  static WebDriver driver;
	int Login;
	
	@BeforeTest
	public void Login(){
		System.setProperty("webdriver.chrome.driver","src\\\\test\\\\resources\\\\drivers\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(Login==1) {
		driver.get("https://dev-lineage.azimuthgrc.com/#/login");
		driver.findElement(By.id("user_name")).sendKeys("mohd.zeeshan@mail.vinove.com");;
		driver.findElement(By.id("Password")).sendKeys("Qwerty@123");;
		driver.findElement(By.id("termsConditions")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();}
		else {
			driver.get("https://qa-lineage.azimuthgrc.com/#/login");
			driver.findElement(By.id("user_name")).sendKeys("mohd.zeeshan@mail.vinove.com");;
			driver.findElement(By.id("Password")).sendKeys("Abc@1234");;
			driver.findElement(By.id("termsConditions")).click();
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			
		}
		Assert.assertEquals(driver.findElement(By.xpath("(//*[text()='Search Laws'])[2]")).getText(), "Search Laws");
	}
	
	public void DropDown(String path, String value){
		Select sel = new Select(driver.findElement(By.xpath(path)));
		sel.selectByVisibleText(value);

      }
	/*
	 * public void DropDown(String path, int value){ Select sel = new
	 * Select(driver.findElement(By.xpath(path))); sel.selectByIndex(value);
	 * 
	 * 
	 * }
	 */
	
	public void TextField(int type,String path, String value) {
		if(type==1) {
		driver.findElement(By.id(path)).sendKeys(value);}
		else if(type==2) {
		driver.findElement(By.linkText(path)).sendKeys(value);}
		else {
		driver.findElement(By.xpath(path)).sendKeys(value); }
		}
	
	public void Click(int type, String path) {
		if(type==1) {
			driver.findElement(By.id(path)).click();}
		else if(type==2) {
			driver.findElement(By.linkText(path)).click();}
		else {
			driver.findElement(By.xpath(path)).click();}
	   }
	
	public String getFirstSelectedTxt(String Path){
		Select sel = new Select(driver.findElement(By.xpath(Path)));
		return sel.getFirstSelectedOption().getText();
	}
	
	public void Wait(int a) throws InterruptedException {
		Thread.sleep(a); 
		}
	
	public void explicitWait(int type, String path){
   // Create object of WebDriverWait class
  WebDriverWait wait=new WebDriverWait(driver,20);
  // Wait till the element is not visible
  if(type==1) {
 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("path")));
  }else if(type==2) {
WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("path")));
  }else {
WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("path")));}
}
	
	public void Javascroller(String path) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement ele =driver.findElement(By.id(path));
		jse.executeScript("return arguments[0].scrollIntoView(true)",ele);
		 }
	
	public void WindowScroller(int a, int b) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(a,b);");
	    }
	
	public void selectList(String path) {
		List<WebElement> elements = driver.findElements(By.xpath(path));    
        System.out.println(elements.size());
        for(WebElement ele : elements){
            //ele.sendKeys("hexbyes");
        	JavascriptExecutor jse = (JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();",ele );
         System.out.println(ele.getText());}}
        
}
