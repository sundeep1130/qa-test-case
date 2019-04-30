package com.apple.definations;

import java.util.Map;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.apple.pages.BagPage;
import com.apple.pages.HomePage;
import com.apple.pages.MacProductsPage;
import com.apple.pages.MacbookProPage;
import com.common.utils.CommonUtil;
import com.test.base.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinitions extends TestBase{
	
	WebDriver driver = getDriver();
	HomePage home = getHomePage();
	MacProductsPage mac = getMacBookProducts();
	MacbookProPage macbookPro = getMacBookPro();
	BagPage bag = getBagPage();
	Map<String, String> specifations;
	
	
	private String url;
	final static Logger logger = Logger.getLogger(Stepdefinitions.class);

	@Given("^the url \"([^\"]*)\"$")
	public void the_url(String url) throws Throwable {
		logger.info("url: "+ url);
		this.url = url;
	}

	@Given("^I go to the url$")
	public void i_go_to_the_url() throws Throwable {
		logger.info("Go to url");
		driver.get(url);
	}

	@When("^I choose a MacBook Pro with the following features and accessories$")
	public void i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable dTable) throws Throwable {
		//Data table as Map
		specifations = CommonUtil.converDtToMap(dTable);
		for (Map.Entry<String, String> entry : specifations.entrySet()) {
			logger.info(entry.getKey()+" : "+entry.getValue());
		}
		
		home.navigateToMacBookPage();
		mac.navigateToMacBookPro();
		macbookPro.order(specifations.get("Screen"), specifations.get("Colour"), specifations.get("Processor"), specifations.get("Memory RAM"), specifations.get("Software"));
		

	}

	@Then("^I can place an order for it\\.$")
	public void i_can_place_an_order_for_it() throws Throwable {
		
	}

	@Given("^when I choose the following items:$")
	public void when_I_choose_the_following_items(DataTable dTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		 Map<String,String> itemsPrice = bag.getPricesForAllItems();
		 for (Map.Entry<String, String> entry : itemsPrice.entrySet()) {
			 logger.info(entry.getKey()+" : "+entry.getValue());
			}
	}
	

	@When("^I proceed to the checkout$")
	public void i_proceed_to_the_checkout() throws Throwable {
		logger.info("Checkout");
	}

	
	@Then("^a total price of \"([^\"]*)\" will be displayed$")
	public void a_total_price_of_will_be_displayed(String totalPrice) throws Throwable {
		
		 logger.info("From feature price : "+totalPrice);
		 logger.info("From UI price : "+bag.getTotalValue());

		 Assert.assertEquals(totalPrice, bag.getTotalValue());
		
	}

	@Then("^\"([^\"]*)\" will be listed for VAT\\.VAT$")
	public void will_be_listed_for_VAT_VAT(String vatPrice) throws Throwable {
		 String vatValue = bag.getTaxValue();
		 logger.info("From feature VAT : "+vatPrice);
		 logger.info("From UI VAT : "+vatValue.substring(vatValue.indexOf("£"), vatValue.length()));

		 Assert.assertEquals(vatPrice, vatValue.substring(vatValue.indexOf("£"), vatValue.length()));
		
	}
}
