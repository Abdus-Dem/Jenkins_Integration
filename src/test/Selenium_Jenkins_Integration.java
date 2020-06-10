package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_Jenkins_Integration {

	
		
		WebDriver driver;
		
		
		@BeforeMethod
		public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/user1/Documents/selenium_dependencies/drivers/chromedriver");
		
		 driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		}
		
		
		@Test
		public void test() {
			
			
			WebElement searchBox = driver.findElement(By.name("q"));
			
			searchBox.sendKeys("porsche" + Keys.ENTER);
			
			Assert.assertTrue(driver.getTitle().contains("porsche"));
			
			
			
			
		}
		
		
		@AfterMethod
		public void tearDown() {
			
			driver.quit();
			
		}
		
		

	}


