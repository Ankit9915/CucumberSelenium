package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	public  WebDriver webDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties pop = new Properties();
		pop.load(fis);
		String url=pop.getProperty("url");
		if(driver==null) {
			if(pop.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
		return driver;
	}
}
