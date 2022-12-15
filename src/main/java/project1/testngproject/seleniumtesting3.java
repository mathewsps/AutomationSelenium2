package project1.testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumtesting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		     driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement fullname = driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']"));
		fullname.sendKeys("joppu");
		WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
		email.sendKeys("abcd@xyz.com");
		WebElement phone = driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));
		phone.sendKeys("9856320147");
	email.clear();
	email.sendKeys("def@test.com");
	email.clear();
	email.sendKeys("12345");

	
	}

}
