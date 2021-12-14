package singletonPatternTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

	WebDriver driver;
	WebDriver driver1;
	@BeforeMethod
	
	public void setup()
	{
		DriverInit instancDriver =DriverInit.getInstance();
		driver= instancDriver.openBrowser();
		 
	}
	
	@Test
	
	public void testMethod1()
	{
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void teeardown()
	{
		driver1.quit();
	}
	
}
