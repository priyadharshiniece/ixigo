package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightReviewListLocators {	
	
	//one way details

	@FindBy(xpath ="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='u-lfloat']")
	public WebElement flightdetails;
	
	@FindBy(xpath="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='leg-summary']//div[@class='date']")
	public WebElement flightDatedetails;
	
	@FindBy(xpath="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='leg-summary']//div[@class='time']")
	public WebElement flightTotaltimedetails;

	@FindBy(xpath ="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='accordion-body']//div[@class='info']")
	public List<WebElement> airlinedetails;
	
	@FindBy(xpath ="//div[@class='fare-dtl']//div[@class='fare-hdr']//span[2]")
	public WebElement travellerDetails;
	
	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='segment'][1]//div[@class='left-wing']//div[@class='time']")
	public WebElement FlightstaringTimedetails;
	
	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='middle']//div[@class='duration']")
	public WebElement FlightdurationSplit;
	
	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='layover']")
	public List<WebElement> layoverDetails;
	

	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][1]//div[@class='layover']")
	public WebElement layoverDetailsnot;
	
	@FindBy(xpath = "//div[@class='fltr layover-duration']//div[@class='u-ib u-rfloat']")
	public WebElement totalDuration;
	
	@FindBy(xpath = "//div[normalize-space()='Partially Refundable']")
	public WebElement refundable;
	
	
	//Return trip  details
	

	@FindBy(xpath ="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='u-lfloat']")
	public WebElement flightdetailsRtn;
	
	@FindBy(xpath="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='leg-summary']//div[@class='date']")
	public WebElement flightDatedetailsRtn;
	
	@FindBy(xpath="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='leg-summary']//div[@class='time']")
	public WebElement flightTotaltimedetailsRtn;

	@FindBy(xpath ="//div[@class='c-flight-segment-detail']//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='accordion-body']//div[@class='info']")
	public List<WebElement> airlinedetailsRtn;

	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='segment'][1]//div[@class='left-wing']//div[@class='time']")
	public WebElement FlightstaringTimedetailsRtn;
	
	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='middle']//div[@class='duration']")
	public WebElement FlightdurationSplitRtn;
	
	@FindBy(xpath ="//div[@class=' c-accordion-item u-box expanded'][2]//div[@class='layover']")
	public List<WebElement> layoverDetailsRtn;
	
}
