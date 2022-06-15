package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightListLocators {

	
	@FindBy(xpath = "//div[@class='result-col outr']//div[@class='duration-info']//div[@class='duration']")
	public List<WebElement> durationList;
	
	@FindBy(xpath = "//div[@class='result-col outr']//div[@class='price-group']//span[2]")
	public List<WebElement> priceList;
	
	@FindBy(xpath = "(//span[contains(text(),'QUICKEST')])[1]")
	public WebElement quickestSort;	

	@FindBy(xpath = "(//span[contains(text(),'CHEAPEST')])[1]")
	public WebElement cheapestSort;
	
	@FindBy(xpath = "//div[@class='c-flight-listing-row-v2 selected show']//button")
	public WebElement bookBtn;	
	
	@FindBy(xpath = "//button[@class='c-btn u-link enabled']")
	public WebElement logintobookBtn;
	
}
