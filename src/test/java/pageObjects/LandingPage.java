package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By addButton = By.cssSelector("a.increment");
	By addtoCart  = By.cssSelector(".product-action button");
	
	public void searchItem(String name) {
	driver.findElement(search).sendKeys(name);
	}
	public String getProductName() {
		 return driver.findElement(productName).getText();
	}
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	public void getclickAdd(int quant) {
		int value = quant-1;
		while(value>0) {
			driver.findElement(addButton).click();
			value--;
		}
		
	}
	public void getAddtoCart() {
		driver.findElement(addtoCart).click();
	}
}
