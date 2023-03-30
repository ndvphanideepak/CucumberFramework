package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	private WebDriver driver;
	
	@Before
	public void before()
	{
		
		driver = DriverFactory.intializeDriver(System.getProperty("browser","chrome"));
	}
	
	@After
	public void after()
	{
		driver.quit();
	}

}
