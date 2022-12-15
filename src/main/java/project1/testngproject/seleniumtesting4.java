package project1.testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumtesting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		     driver.get("https://demo.guru99.com/test/login.html");
		     driver.findElement(By.id("email")).sendKeys("abcd@xyz.com");
		     driver.findElement(By.id("passwd")).sendKeys("passcode");
		     WebElement butn = driver.findElement(By.id("SubmitLogin"));
		     butn.click();
	}

}
