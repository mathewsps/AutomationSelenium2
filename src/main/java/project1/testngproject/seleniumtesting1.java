package project1.testngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//xpath 
//absolute xpath not at all used .
//relative xpath is only used
public class seleniumtesting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
	         driver.get("https://www.orangehrm.com/contact-sales/");
	         driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("joppu");
	         driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abcd@xyz.com");
	         driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']")).sendKeys("9856320147");
	}

}
