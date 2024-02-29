package automationsample;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browselaunch {
	  WebDriver driver;


	
	@BeforeMethod
	public void lauchdriver()
	
    {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
		

    }
	
	@Test
	public void Test1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("The title is" + driver.getTitle());
	}
	
	
	@AfterMethod
	public void closeThebrowser()
	{
		driver.quit();
	}
	
}
