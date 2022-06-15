package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreFiltersListLocators {

	@FindBy(xpath = "//div[@class='fltr-col-1 u-ib']//div[@class='stops']//span[@class='checkbox-list']//div[@class='stop-info']")
	public List<WebElement> stopsChklist;

	@FindBy(xpath = "//div[@class='result-wrpr']//div[@class='stop']")
	public List<WebElement> stopsChklistResults;

	@FindBy(xpath = "//span[@class='u-ib']//span[@class='c-switch switch-off']")
	public List<WebElement> toggleBtn;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-lower']")
	public WebElement layoverleftSlider;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-lower']//div[@class='noUi-tooltip']")
	public WebElement layoverSlideLeftTooltip;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-upper']//div[@class='noUi-tooltip']")
	public WebElement layoverSlideRightTooltip;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-upper']")
	public WebElement layoverRightSlide;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='u-ib u-rfloat']")
	public WebElement totalDuration;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='u-ib']")
	public WebElement initialDuration;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='noUi-value noUi-value-horizontal noUi-value-large']")
	public List<WebElement> total;

	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-upper']")
	public WebElement layoverSlideRight;

	@FindBy(xpath = "//div[@class='fltr layover-airport']//span[@class='checkbox-list']//div[@class='layoverCity-name']")
	public WebElement layoverAirportchklist;

	@FindBy(xpath = "//div[@class='fltr-col-1 u-ib']//span[@class='u-ib']")
	public WebElement refundableToggleBtn;

	@FindBy(xpath = "//div[@class='more-fltrs u-link']")
	public WebElement morefilterBtn;

	@FindBy(xpath = "//div[@class='less-fltrs u-link']")
	public WebElement lessfilterBtn;

	@FindBy(xpath = "//div[@class='apply-fltrs']//button")
	public WebElement applyfilterBtn;

	@FindBy(xpath = "//div[@class='fltr layover-airport']//span[@class='checkbox-list']//div[@class='layoverCity-info u-fb']")
	public List<WebElement> airports;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][1]//div[@class='tmng-btn']//div[@class='lbl']")
	public List<WebElement> departureTime;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][1]//div[@class='tmng-btn']//button")
	public List<WebElement> departureTimeBtn;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][2]//div[@class='tmng-btn']//div[@class='lbl']")
	public List<WebElement> departureTimeReturn;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][2]//div[@class='tmng-btn']//button")
	public List<WebElement> departureTimeBtnReturn;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][1]//div[@class='time-sldr']//div[@class='noUi-handle noUi-handle-lower']//div[@class='noUi-tooltip']")
	public WebElement departuretimelefttooltip;
	
	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][1]//div[@class='time-sldr']//div[@class='u-ib']//span")
	public WebElement departuretimeleft;
	
	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][1]//div[@class='time-sldr']//div[@class='noUi-handle noUi-handle-upper']//div")
	public WebElement departuretimerighttooltip;
	
	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][1]//div[@class='time-sldr']//div[@class='u-ib u-rfloat']//span")
	public WebElement departuretimeright;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][2]//div[@class='time-sldr']//div[@class='noUi-handle noUi-handle-lower']//div[@class='noUi-tooltip']")
	public WebElement departuretimelefttooltipRtn;
	
	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][2]//div[@class='time-sldr']//div[@class='u-ib']//span")
	public WebElement departuretimeleftRtn;
	
	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][2]//div[@class='time-sldr']//div[@class='noUi-handle noUi-handle-upper']//div")
	public WebElement departuretimerighttooltipRtn;
	
	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr tmng'][2]//div[@class='time-sldr']//div[@class='u-ib u-rfloat']//span")
	public WebElement departuretimerightRtn;


	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr price-fltr']//div[@class='u-ib']//span[2]")
	public WebElement priceleft;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr price-fltr']//div[@class='u-ib u-rfloat']//span[2]")
	public WebElement priceright;

	@FindBy(xpath = "//div[@class='fltr-col-2 u-ib']//div[@class='fltr price-fltr']//div[@class='noUi-handle noUi-handle-lower']")
	public WebElement pricerightSlidr;

	@FindBy(xpath = "//div[@class='fltr-col-3 u-ib']//span[@class='checkbox-list']//span[@class='label u-ib u-pos-rel u-v-align-top']//div[@class='arln-nm']")
	public List<WebElement> airlineChexbox;

	@FindBy(xpath = "//div[@class='u-ib u-layout-col-1']//div[@class='accordion-body']//div[@class='segment']/div[@class='layover']")
	public WebElement layoverDetails;

	@FindBy(xpath = "//div[@class='u-ib u-layout-col-1']//div[@class='segment'][1]//div[@class='left-wing']//div[@class='time']")
	public WebElement departureTimeDetails;

	@FindBy(xpath = "//div[@class='active-filter']")
	public WebElement filtertext;

}
