package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest {
  private ChromeDriver driver;

@Test(priority =4)
  public void first() {
	driver.findElement(By.id("Form_getForm_FullName")).sendKeys("joppu kurian");
	
	
  }
@Test(priority =2)
public void second() {
	 driver.findElement(By.id("Form_getForm_Email")).sendKeys("joppuk13@gmail.com");
}
@Test(priority =2)
public void third() {
	Select drpcntry = new Select(driver.findElement(By.id("Form_getForm_Country")));
	drpcntry.selectByVisibleText("India");
}
@Test(priority =1)
public void fourth() {
	driver.findElement(By.id("Form_getForm_Contact")).sendKeys("7559000371");
}
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  this.driver = new ChromeDriver();
	 
	 
         driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }

}
