package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class SubscribeStartUp {
  private ChromeDriver driver;

@Test()
  public void launching() {
	driver.get("https://phptravels.com/demo/");
	driver.findElement(By.linkText("Pricing")).click();
	//driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/div/div[2]/a")).click();
driver.get("https://store.payproglobal.com/checkout?products[1][id]=70568");  
	driver.findElement(By.id("firstname")).sendKeys("mathews");
	
}
@Test(priority = 2,dependsOnMethods = {"launching"})
public void billingInformation() {
	driver.findElement(By.id("firstname")).sendKeys("mathews");
	driver.findElement(By.id("lastname")).sendKeys("sajan");
	driver.findElement(By.id("email")).sendKeys("sample@abc.com");
	driver.findElement(By.id("address")).sendKeys("sample address");
	driver.findElement(By.id("city")).sendKeys("sample city");
	driver.findElement(By.id("zip")).sendKeys("123456");
	driver.findElement(By.id("phone")).sendKeys("9876543210");
	//Select drpcounrty = ((WebElement) new Select(driver.findElement(By.id("s2id_country")))).click();
	//WebElement drpcntry = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]"));
	//drpcntry.click();
	
}
@Test(priority = 2)
public void selectPaymentMethod() {
	
	driver.findElement(By.id("cardnum")).sendKeys("12343234243");
	driver.findElement(By.id("secnum")).sendKeys("1234");
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
