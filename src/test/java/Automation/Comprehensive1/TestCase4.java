package Automation.Comprehensive1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
	 public static void main(String[] args) 
	 {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 //valid Url
		 driver.get("https://www.urbanladder.com/");	
		 
		 WebElement m1=driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a"));
			m1.click();
			
			 WebElement m=driver.findElement(By.xpath("//*[@id=\"help-center-search-input\"]"));
			 m.sendKeys("Warranty and Post Delivery Services");
			 m.sendKeys(Keys.ENTER);

	 }		
}
