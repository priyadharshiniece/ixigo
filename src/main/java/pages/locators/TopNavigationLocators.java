package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
@FindAll({
	@FindBy(xpath = "//div[normalize-space()='More travel']"),
	@FindBy(xpath ="//div[@id='gc-custom-header-tool-bar-AllTravel']//span[contains(text(),'More travel')]")})
	
	public WebElement topMenu;
@FindAll({
@FindBy(xpath = "//div[@id='gc-custom-header-tool-bar-AllTravel']//span[contains(text(),'More travel')]"),
	@FindBy(xpath = "//div[@class='uitk-menu-container uitk-menu-open uitk-menu-pos-left uitk-menu-container-autoposition']//div//div"),
	@FindBy(xpath ="//button[@class='uitk-button uitk-button-small uitk-button-tertiary gc-header-custom-menu-trigger custom-menu-active']//span[contains(text(),'More travel')]")})
	public List<WebElement> topList;

@FindAll({
	@FindBy(xpath = "//a[@href='/Hotels']"),
	@FindBy(xpath="//div[@aria-hidden='false']//a[@id='hotel']"),
	@FindBy(xpath="//div[@class='uitk-menu-container custom-menu-container uitk-menu-pos-left uitk-menu-open']//a[@id='hotel']")})
	public WebElement hotelMenu;
@FindAll({
	@FindBy(xpath = "//a[@href='/Flights']"),
	@FindBy(xpath="//div[@aria-hidden='false']//a[@id='flight']")})


	public WebElement flightMenu;

	@FindBy(xpath = "//a[@href='/Car-Rental']")
	public WebElement carMenu;

	@FindBy(xpath = "//a[@href='/Packages']")
	public WebElement packagesMenu;

	@FindBy(xpath = "//a[@href='/Activities']")
	public WebElement holidyayMenu;

	@FindBy(xpath = "//a[@href='/deals']")
	public WebElement dealsMenu;

	@FindBy(xpath = "//a[@href='https://www.hotelplanner.com/Common/Services/Expedia/?Brand=Expedia&Loc=en_GB']")
	public WebElement groupandMeetingsMenu;

	@FindBy(xpath = "//a[@href='/app']")
	public WebElement mobileMenu;

	@FindAll({
		@FindBy(xpath = "//img[@alt='www.expedia.co.in']"),
		@FindBy(xpath = "//img[@alt='expedia logo']")
	})
	public WebElement expediaLogo;

	@FindBy(xpath = "//div[@class='uitk-text uitk-type-300 uitk-text uitk-text-default-theme']")
	public WebElement englishLink;

	@FindBy(xpath = "//div[contains(text(),'Support')]")
	public WebElement supportLink;

	@FindBy(xpath = "//a[@id='itinerary']")
	public WebElement tripsLink;

	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	public WebElement signinLink;
}
