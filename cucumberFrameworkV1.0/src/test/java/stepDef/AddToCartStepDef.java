package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import constants.EndPoint;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.StorePage;
import utils.ConfigLoader;

public class AddToCartStepDef {
	private  WebDriver driver;
	@Given("I'm on store page")
	public void i_m_on_store_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = DriverFactory.getDriver();
		new StorePage(driver).load(EndPoint.STORE.url);
	        //driver.get("https://askomdch.com/store/");
	}

	@When("I add {string} to the cart")
	public void i_add_to_the_cart(String productName) {
	new StorePage(driver).addToCart(productName);
	
	    
	}

	@Then("I should see {int} {string} in the cart")
	public void i_should_see_in_the_cart(int Qty, String productName) {
	    CartPage cartpage = new CartPage(driver);
	   Assert.assertEquals(Qty, cartpage.getProductQuantity());
	   Assert.assertEquals(productName, cartpage.getProductName());
	   
	    
	}

}
