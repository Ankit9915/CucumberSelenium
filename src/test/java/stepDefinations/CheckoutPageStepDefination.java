package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public CheckoutPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo(){
		 
		Assert.assertTrue(checkoutPage.verifyPromoButton());
		Assert.assertTrue(checkoutPage.verifyplaceOrderButton());
	}
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_checkout(String name) throws InterruptedException{
		checkoutPage.CheckoutItems();
		//Assertion to extract name from screen and compare with name
	}
	
	

}
