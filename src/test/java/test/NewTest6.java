package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest6 {
  @Test(priority=0,enabled = false)//enabled=false is used for skipping the execution.
  public void f() {
	  System.out.println("first");
  }
  @Test(priority=3,groups ={"Smoke"})
  public void g() {
	  System.out.println("second");
  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
