package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	WebDriver driver;
	
  @Test(priority =1)
  public void orangeorange() throws InterruptedException {
	    driver.findElement(By.id("Form_getForm_FullName")).sendKeys("joppu kurian");
		
 
        Select drpcntry = new Select(driver.findElement(By.id("Form_getForm_Country")));
		drpcntry.selectByVisibleText("India");

        Select drpemp = new Select(driver.findElement(By.id("Form_getForm_NoOfEmployees")));
		drpemp.selectByVisibleText("76 - 100");
		
		
		
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("Automation Tester");
		driver.findElement(By.id("Form_getForm_Comment")).sendKeys("Sample input text");
  }
  
  @Test(groups = {"Smoke"})
  
  public void orange1()
  {
	  driver.findElement(By.id("Form_getForm_Email")).sendKeys("joppuk13@gmail.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("7559000371");
  
  
  
  
  }
  
 
  @BeforeClass
  public void orangeopen() {
	  WebDriverManager.chromedriver().setup();
	  this.driver = new ChromeDriver();
	 
         driver.get("https://www.orangehrm.com/contact-sales/");
		
  }

  @AfterClass
  public void orangeclose() {
	  driver.close();
  }

}
