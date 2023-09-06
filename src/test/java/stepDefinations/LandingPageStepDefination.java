package stepDefinations;

import java.util.Iterator;
import java.util.Set;
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

public class LandingPageStepDefination {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	 LandingPage landingPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
		//Chrome for testing
	//	System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver-win32");
		
		Assert.assertTrue(landingPage.getLandingPageTitle().contains("GreenKart"));
	}
	@When("^User searched With sortname (.+) and extract actual name of product$")
	public void user_searched_with_sortname_and_extract_actual_name_of_product(String shortName) throws InterruptedException {
		
		landingPage.searchItem(shortName);
	//	testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	   Thread.sleep(2000);
	   testContextSetup.landingPageproductName = landingPage.getProductName().split("-")[0].trim();
	   System.out.println(landingPageproductName);
	}
	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity) {
		landingPage.getclickAdd(Integer.parseInt(quantity));
		landingPage.getAddtoCart();
	}
	
	

}
