package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class contactUsPageTest {
  private ChromeDriver driver;
  
  @Test
  public void launch()  {
	  driver.get("https://phptravels.org/contact.php");
	  
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
	  
  }

@Test(priority=1,dependsOnMethods = {"launch"})
  public void contactPtest() {
	driver.findElement(By.id("inputName")).sendKeys("Mathews");
	driver.findElement(By.id("inputEmail")).sendKeys("xyz@abc.com");
	driver.findElement(By.id("inputSubject")).sendKeys("This is a sample subject");
	driver.findElement(By.id("inputMessage")).sendKeys("This is a sample message");
	
	
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
