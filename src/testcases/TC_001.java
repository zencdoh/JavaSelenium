package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//updated by bala
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//
public class TC_001a {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
        	options.addArguments("headless");
        	options.addArguments("window-size=1200x600");
        	WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
	
	
}
