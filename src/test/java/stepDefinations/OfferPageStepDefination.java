package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
public class OfferPageStepDefination {
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
	
	@Then("^user searched for (.+) shortname in offers page to check if product exist with same name$")
	public void user_searched_for_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String shortName) throws InterruptedException {

		OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
		offersPage.getdeals();
	//	testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
		testContextSetup.genericUtils.switchWindowToChild();
		offersPage.getsearchOff(shortName);
	//	testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		 Thread.sleep(2000);
		  offerPageProductName = offersPage.getproductNameOffer();
		  Assert.assertEquals(offerPageProductName,testContextSetup.landingPageproductName);
	}
	

}
