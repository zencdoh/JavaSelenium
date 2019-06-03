package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
iimport org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
//updated by bala
//
public class TC_001 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);		
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
	
	
	
}



