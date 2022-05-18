package Automation.Comprehensive1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	 public static void main(String[] args) 
	 {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 //valid Url
		 driver.get("https://www.urbanladder.com/");	
		 
		 //verify the functionality of search bar
		 
		 WebElement m=driver.findElement(By.id("search"));
		 m.sendKeys("Study Chairs");
		 m.sendKeys(Keys.ENTER);
		 
		WebElement m1=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a"));
		m1.click();
	 }
}


