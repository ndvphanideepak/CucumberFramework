package stepDef;

import org.openqa.selenium.WebDriver;

import constants.EndPoint;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.StorePage;

public class NewPageStepDef {
	private  WebDriver driver;
	@Given("I'm on new page")
	public void i_m_on_new_page() {
		driver = DriverFactory.getDriver();
		new StorePage(driver).load(EndPoint.ACCOUNT.url);
	}

}
