package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePageTest {
  private ChromeDriver driver;

@Test
  public void launchurl() {
	driver.get("https://phptravels.com/demo/");

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	//WebElement t = driver.findElement(By.partialLinkText("Sign Up"));
	//t.click();
	
  }
@Test(priority = 1,dependsOnMethods = {"launchurl"})
public void personalinformation() {
	//driver.findElement(By.xpath("//*[@id=\"loginSignup\"]/li[2]/a")).click();
    driver.get("https://phptravels.org/register.php");
	driver.findElement(By.id("inputFirstName")).sendKeys("mathews");
	driver.findElement(By.id("inputLastName")).sendKeys("sajan");
	driver.findElement(By.id("inputEmail")).sendKeys("abc@xyz.com");
	driver.findElement(By.id("inputPhone")).sendKeys("+918564785496");
	
}
@Test(priority = 2)
public void billingAddress() {
	driver.findElement(By.id("inputCompanyName")).sendKeys("excelR");
	driver.findElement(By.id("inputAddress1")).sendKeys("sample address line 1");
	driver.findElement(By.id("inputAddress2")).sendKeys("sample address line 2");
	driver.findElement(By.id("inputCity")).sendKeys("Sample city");
	driver.findElement(By.id("inputPostcode")).sendKeys("123456");
	Select drpcntry = new Select(driver.findElement(By.id("inputCountry")));
	drpcntry.selectByVisibleText("India");
	Select drpstate = new Select(driver.findElement(By.id("stateselect")));
	drpstate.selectByVisibleText("Karnataka");

}
@Test(priority = 2)
public void additionalRequiredInformation() {
	driver.findElement(By.id("customfield2")).sendKeys("1234567890");
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
