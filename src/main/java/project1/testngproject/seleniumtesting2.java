package project1.testngproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumtesting2 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
	         driver.get("https://www.orangehrm.com/contact-sales/");
	         
	         List<WebElement>listLinks = driver.findElements(By.tagName("a"));
	         System.out.println(listLinks.size());
	
	         for(int i=0; i<listLinks.size();i++);
	         {
	        	 System.out.println(listLinks.get(i).getText());
	         }
	}

}
