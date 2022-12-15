package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest7 {
  private ChromeDriver driver;
  
  @Test(groups ={"Smoke"})
  public void launchurl() {
	  driver.get("https://toolsqa.com/");
  }

@Test(priority=1,dependsOnMethods= {"launchurl"})
  public void Seltrain() {
	WebElement selenium = driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[2]/a"));
	selenium.click();
			
  }
@Test(dependsOnMethods= {"Seltrain"})
public void chkt() {
	if(driver.getTitle().equals("Tools QA - Selenium Training"))
	{
	
		System.out.println("pass");
	
	}
	else {
		System.out.println("fail");
	}
}
  @BeforeClass(groups ={"Smoke"})
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  this.driver = new ChromeDriver();
		 
		 
	        
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
