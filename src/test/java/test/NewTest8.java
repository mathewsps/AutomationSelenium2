package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest8 {
	private ChromeDriver driver;

	//Xpath functions
	//     //tagname[@attribute=value]
	
	//contains - syntax:  //div[contains(text(),'paste')]
	//   //a[contains(text(),'Integrations')]            here "a" -> any tag 
	
	//starts-with - syntax:    //div[starts-with(text(),'paste')]
	\//   //div[starts-with(@id(),'testabc')]
	
	//
	
	
	
	
	//use in every code
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage.timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//driver.manage().maximize();
  @Test
  public void launchlink() {
	  driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//  driver.manage().window().maximize();
  }

	

@Test
  public void p() {
	  //System.out.println("sdasd");
  
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
