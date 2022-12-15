package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class toolsqatest {
  private ChromeDriver driver;

@Test
  public void launch() {
	  driver.get("https://toolsqa.com/");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/a")).click();
driver.findElement(By.id("first-name")).sendKeys("mathews");
driver.findElement(By.id("last-name")).sendKeys("sajan");
driver.findElement(By.id("email")).sendKeys("mathews@xyz.com");
driver.findElement(By.id("mobile")).sendKeys("9876543210");

Select drpcntry = new Select(driver.findElement(By.id("country")));
drpcntry.selectByVisibleText("India");
driver.findElement(By.id("city")).sendKeys("Bangalore");
driver.findElement(By.id("message")).sendKeys("this is a sample message");
} 

  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  this.driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
