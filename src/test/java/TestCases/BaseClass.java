package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	public WebDriver driver;
	@BeforeClass
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
