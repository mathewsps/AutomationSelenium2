package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class formclick {
  private ChromeDriver driver;

@Test
  public void launch() {
	  driver.get("https://demoqa.com/");
	  driver.findElement(By.xpath("///*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]")).click();
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
