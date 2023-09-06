package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By deals = By.linkText("Top Deals");
	By searchOff = By.xpath("//input[@type='search']");
	By productNameOffer = By.cssSelector("tr td:nth-child(1)");
	
	
	public void getdeals() {
		driver.findElement(deals).click();;
	}
	public void getsearchOff(String name) {
		driver.findElement(searchOff).sendKeys(name);
	}
	public String getproductNameOffer() {
		return driver.findElement(productNameOffer).getText();
	}

}
