package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest4 {
  @Test(priority =1)
  public void h() {
	  System.out.println("first method");
  }
  @Test(priority =1,groups = {"Smoke"})
  
 public void g() {
	  System.out.println("second method");
	  
  }
  @BeforeClass
  public void beforecls() {
  
	  System.out.println("before method");
  }

  @AfterClass
  public void afterMethod() {
	  System.out.println("after method");
	  
  }

}
