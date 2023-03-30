package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	
	private  static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	public static WebDriver intializeDriver(String browser)
	{
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			 ChromeOptions opt = new ChromeOptions();
			 opt.addArguments("--remote-allow-origins=*");
		        driver = new ChromeDriver(opt);
		        
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
					}
		else
		{
			throw new IllegalStateException("Invalid browser argument use only Edge or Chrome");
		}
		
	        driver.manage().window().maximize();
	      DriverFactory.driver.set(driver);
	        		
	        return driver;
		
	}
	
	public  static WebDriver getDriver()
	{
		return driver.get();
	}

}
