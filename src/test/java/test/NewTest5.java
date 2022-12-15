package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest5 {
  @Test(priority=2)
  public void d() {
	  System.out.println("Third");
  }
  @Test(priority=4)
  public void e() {
	  System.out.println("fourth");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
