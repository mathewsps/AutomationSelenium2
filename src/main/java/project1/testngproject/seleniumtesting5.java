package project1.testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumtesting5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 
			     driver.get("https://demo.guru99.com/test/radio.html");
			     
			     WebElement rb1 = driver.findElement(By.id("vfb-7-1"));
			     rb1.click();
			     rb1.click();
			     WebElement cb1 = driver.findElement(By.id("vfb-6-0"));
			     cb1.click();
			    
			     
	}

}
