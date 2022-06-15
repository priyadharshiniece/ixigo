package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchLocators {
	

	@FindBy(xpath="//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input")
	public WebElement fromCity;
	
	@FindBy(xpath="//div[@class='orgn u-ib u-v-align-bottom u-text-left']//div[@class='u-box-header'][normalize-space()='Popular Airports']")
	public WebElement autolistHeading;

	@FindBy(xpath="//div[@class='dstn u-ib u-v-align-bottom u-text-left']//div[@class='u-box-header'][normalize-space()='Popular Airports']")
	public WebElement dstnautolistHeading;
	
	@FindBy(xpath="	//div[@class='flight-origin-fliter']//div[@class='clear-input ixi-icon-cross']")
	public WebElement fromCityClearBtn;

	@FindBy(xpath="//div[@class='orgn u-ib u-v-align-bottom u-text-left']//div[@class='autocompleter-scroll-cntr']//div[@class='city']")
	public List<WebElement> citySelected;

	@FindBy(xpath="//div[@class='dstn u-ib u-v-align-bottom u-text-left']//div[@class='autocompleter-scroll-cntr']//div[@class='city']")
	public List<WebElement> dstncitySelected;

	@FindBy(xpath=	"//div[@class='result-row flight-airport u-box-result selected]")
	public WebElement link;

	
	@FindBy(xpath="//div[@class='u-ib swap-icon ixi-icon-swap u-v-align-middle")
	public List<WebElement> swapBtn;
	
	@FindBy(xpath="//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']")
	public WebElement toCity;
	
	@FindBy(xpath = "//input[@placeholder='Return']")
	public WebElement returnOn;
	
	@FindBy(xpath = "//input[@placeholder='Depart']")
	public WebElement depature;


	@FindBy(xpath = "//div[@class='passanger-class-input u-pos-rel']//input[@type='text']")
	public WebElement travellersDetails;
	
	@FindBy(xpath="//div[@class='close-btn u-pos-abs ixi-icon-cross']")
	public WebElement travellerDonebtn;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//div[@class='rd-date']//div[@class='rd-month'][1]//div[@class='rd-month-label']")
	public WebElement firstmonthName;
	
	@FindBy(xpath="//div[@class='rd-date']//div[@class='rd-month'][2]//div[@class='rd-month-label']")
	public WebElement secondmonthName;

	
	@FindBy(xpath="//div[@class='rd-date']//div[@class='rd-month'][2]//button")
	public WebElement nextPagebtn;
	
	@FindBy(xpath="//div[@class='rd-date']//div[@class='rd-month'][1]//button")
	public WebElement previousPageBtn;
	
	
	@FindBy(xpath="//div[@class='rd-date']//div[@class='rd-month'][1]//table[@class='rd-days']//tbody//tr//td//div[@class='day has-info']")
	public List<WebElement> previousdates;
	
	@FindBy(xpath="//div[@class='rd-date']//div[@class='rd-month'][2]//table[@class='rd-days']//tbody//tr//td//div[@class='day has-info']")
	public List<WebElement> nextDates;
	
	@FindBy(xpath="	//div[@class='rd-container flight-ret-cal extra-bottom rd-container-attachment']//div[@class='rd-date']//div[@class='rd-month'][1]//div[@class='rd-month-label']")
	public WebElement firstmonthNameRtn;
	
	@FindBy(xpath="	//div[@class='rd-container flight-ret-cal extra-bottom rd-container-attachment']//div[@class='rd-date']//div[@class='rd-month'][2]//div[@class='rd-month-label']")
	public WebElement secondmonthNameRtn;

	
	@FindBy(xpath="//div[@class='rd-container flight-ret-cal extra-bottom rd-container-attachment']//div[@class='rd-date']//div[@class='rd-month'][2]//button")
	public WebElement nextPagebtnRtn;
	
	@FindBy(xpath="//div[@class='rd-container flight-ret-cal extra-bottom rd-container-attachment']//div[@class='rd-date']//div[@class='rd-month'][1]//button")
	public WebElement previousPageBtnRtn;
	
	
	@FindBy(xpath="//div[@class='rd-container flight-ret-cal extra-bottom rd-container-attachment']//div[@class='rd-date']//div[@class='rd-month'][1]//table[@class='rd-days']//tbody//tr//td//div[@class='day has-info']")
	public List<WebElement> previousdatesRtn;
	
	@FindBy(xpath="//div[@class='rd-container flight-ret-cal extra-bottom rd-container-attachment']//div[@class='rd-date']//div[@class='rd-month'][2]//table[@class='rd-days']//tbody//tr//td//div[@class='day has-info']")
	public List<WebElement> nextDatesRtn;

	@FindBy(xpath ="//div[@class='u-box-result'][1]//div[@class='number-counter'][1]//div[@class='u-ib items u-v-align-middle']//span")
	public List<WebElement> adult;

	@FindBy(xpath ="//div[@class='u-box-result'][1]//div[@class='number-counter'][2]//div[@class='u-ib items u-v-align-middle']//span")
	public List<WebElement> child;

	@FindBy(xpath ="//div[@class='u-box-result'][1]//div[@class='number-counter'][3]//div[@class='u-ib items u-v-align-middle']//span")
	public List<WebElement> infant;
	
	@FindBy(xpath="//div[@class='passanger-class-input u-pos-rel']//input[@type='text']")
	public WebElement passenger;
	
	@FindBy(xpath="//div[@class='u-box-header'][normalize-space()='Travellers']")
	public WebElement travellersText;
	
	
	@FindBy(xpath="//span[@class='err-msg']")
	public WebElement travellerserrorMsg;
	
	@FindBy(xpath="//div[@class='heading']")
	public WebElement noFlights;
		
	@FindBy(xpath="//div[@class='book-cta']//button[@class='c-btn u-link enabled']")
	public WebElement bookFlightBtn;
	
	
	
}
