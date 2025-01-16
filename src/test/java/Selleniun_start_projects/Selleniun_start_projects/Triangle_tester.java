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

public class Triangle_tester{
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\batel\\OneDrive\\שולחן העבודה\\QA\\geckodriver-v0.35.0-win64 (1)\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
		
	@Test
	public void Test1() {
		String expected="not a triangle";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("3");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("1");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("1");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test2() {
		String expected="not a triangle";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("1");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("6");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test3() {
		String expected="not a triangle";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("7");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test4() {
		String expected="Equilateral";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("3");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test5() {
		String expected="isosceles";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("5");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("5");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("6");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test6() {
		String expected="isosceles";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("5");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("6");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("5");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test7() {
		String expected="isosceles";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("6");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("5");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("5");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }
	@Test
	public void Test8() {
		String expected="scalene";
		//field 1
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("5");
		//field 2
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("6");
		//field 3
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("7");
		//לחיצה על כפתור
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();
			assertNotEquals(result, expected);
   }

}