package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class password_check{
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\batel\\OneDrive\\שולחן העבודה\\QA\\geckodriver-v0.35.0-win64 (1)\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
		
	@Test
	public void Test1() {
		String expected="Valid Value";
		//field 1
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Batel12");
		//לחיצה על כפתור
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test2() {
		String expected="Invalid Value";
		//field 1
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Batel1!");
		//לחיצה על כפתור
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).toString();
			assertNotEquals(result, expected);
   }
}
