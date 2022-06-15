package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.Page;
import pages.locators.FlightSearchLocators;

public class FlightSearchPage extends Page {
	public FlightSearchLocators Flightsearch;

	public FlightSearchPage() {
		this.Flightsearch = new FlightSearchLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.Flightsearch);
	}

	public void departureSearch() {
		Flightsearch.depature.click();
		log.info("From city is clicked");
	}

	public void returnSearch() {
		Flightsearch.returnOn.click();
log.debug("return city is clicked");
	}

	public void dateSearchDeparture(String month, String date) {
		Flightsearch.depature.click();
		while (!((Flightsearch.firstmonthName.getText().equalsIgnoreCase(month))
				|| (Flightsearch.secondmonthName.getText().equalsIgnoreCase(month)))) {
			Flightsearch.nextPagebtn.click();
		}

		if (Flightsearch.firstmonthName.getText().equalsIgnoreCase(month)) {
			System.out.println(Flightsearch.firstmonthName.getText());
			for (int i = 0; i < Flightsearch.previousdates.size(); i++) {

				System.out.println(Flightsearch.previousdates.get(i).getText());

				if (Flightsearch.previousdates.get(i).getText().equalsIgnoreCase(date)) {

					System.out.println(Flightsearch.previousdates.get(i).getText());
					Flightsearch.previousdates.get(i).click();

				}
			}
		}

		else if (Flightsearch.secondmonthName.getText().equalsIgnoreCase(month)) {
			for (int j = 0; j < Flightsearch.nextDates.size(); j++) {
				if (Flightsearch.nextDates.get(j).getText().equalsIgnoreCase(date)) {
					Flightsearch.nextDates.get(j).click();
				}

			}

		}

	}

	public void travellersdetails(String adult1, String child1, String infant1) {
		int adult = Integer.parseInt(adult1);
		int child = Integer.parseInt(child1);
		int infant = Integer.parseInt(infant1);
		Flightsearch.passenger.click();
		wait.until(ExpectedConditions.visibilityOf(Flightsearch.travellersText));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Flightsearch.adult.size());

		for (int i = 0; i <= Flightsearch.adult.size() - 1; i++) {

			int a = (Integer.parseInt(Flightsearch.adult.get(i).getText()));
			System.out.println("adult " + a);
			if (adult == 0) {
				System.out.println("Cannot enter adult as zero!!!");
				break;
			} else if (a == adult) {

				Flightsearch.adult.get(i).click();
				break;
			}
		}

		for (int j = 0; j <= (9 - (adult)); j++) {
			int c = (Integer.parseInt(Flightsearch.child.get(j).getText()));
			System.out.println("childrebb " + c);
			if (c == child) {
				Flightsearch.child.get(j).click();
			} else if ((adult == 9) || ((adult + child) > 9)) {
				Flightsearch.child.get(9).click();
				Assert.assertEquals(Flightsearch.travellerserrorMsg.getText(),
						"You can only book for upto 9 travellers at one go");
			}
		}

		for (int k = 0; k <= (9 - (adult + child)); k++) {
			int infnt = (Integer.parseInt(Flightsearch.infant.get(k).getText()));
			System.out.println("infant " + infnt);
			if (infnt == infant) {
				Flightsearch.infant.get(k).click();
			} else if ((adult == 9) || ((adult + child + infant) > 9)) {
				Flightsearch.infant.get(9).click();
				Assert.assertEquals(Flightsearch.travellerserrorMsg.getText(),
						"No. of infants cannot exceed no. of adults");
			}
		}
		Flightsearch.travellerDonebtn.click();
	}

	public void travellbtnClose() {
		Flightsearch.travellerDonebtn.click();
	}

	public void dateSearchReturn(String month, String date) {
		Flightsearch.returnOn.click();
		while (!((Flightsearch.firstmonthNameRtn.getText().equalsIgnoreCase(month))
				|| (Flightsearch.secondmonthNameRtn.getText().equalsIgnoreCase(month)))) {
			Flightsearch.nextPagebtnRtn.click();
		}

		if (Flightsearch.firstmonthNameRtn.getText().equalsIgnoreCase(month)) {
			System.out.println(Flightsearch.firstmonthNameRtn.getText());
			for (int i = 0; i < Flightsearch.previousdatesRtn.size(); i++) {

				System.out.println(Flightsearch.previousdatesRtn.get(i).getText());

				if (Flightsearch.previousdatesRtn.get(i).getText().equalsIgnoreCase(date)) {

					System.out.println(Flightsearch.previousdatesRtn.get(i).getText());
					Flightsearch.previousdatesRtn.get(i).click();

				}
			}
		}

		else if (Flightsearch.secondmonthNameRtn.getText().equalsIgnoreCase(month)) {
			for (int j = 0; j < Flightsearch.nextDatesRtn.size(); j++) {
				if (Flightsearch.nextDatesRtn.get(j).getText().equalsIgnoreCase(date)) {
					Flightsearch.nextDatesRtn.get(j).click();
				}

			}

		}

	}

	public void fromCity(String cityName) {

		Actions a = new Actions(driver);
		Flightsearch.fromCity.click();
		Flightsearch.fromCity.sendKeys(Keys.chord(Keys.CONTROL, Keys.DELETE));
		Flightsearch.fromCity.click();
		wait.until(ExpectedConditions.textToBePresentInElement(Flightsearch.autolistHeading, "Popular Airports"));
		Flightsearch.fromCity.sendKeys(cityName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < Flightsearch.citySelected.size(); i++) {
			if (Flightsearch.citySelected.get(i).getText().contains(cityName)) {
				System.out.println(Flightsearch.citySelected.get(i).getText());
				a.sendKeys(Keys.ENTER).perform();

			}
		}
	}

	public void toCity(String cityName) {

		Actions a = new Actions(driver);
		Flightsearch.toCity.click();
		Flightsearch.toCity.sendKeys(Keys.chord(Keys.CONTROL, Keys.DELETE));
		Flightsearch.toCity.click();
		wait.until(ExpectedConditions.textToBePresentInElement(Flightsearch.dstnautolistHeading, "Popular Airports"));
		Flightsearch.toCity.sendKeys(cityName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < Flightsearch.dstncitySelected.size(); i++) {
			if (Flightsearch.dstncitySelected.get(i).getText().contains(cityName)) {
				System.out.println(Flightsearch.dstncitySelected.get(i).getText());
				a.sendKeys(Keys.ENTER).perform();

			}
		}
	}

	public void verifyNoFlightlistDisplayed() {

		wait.until(ExpectedConditions.visibilityOf(Flightsearch.noFlights));
		Assert.assertEquals(Flightsearch.noFlights.getText(), "Oops! No flights available for this date");
		System.out.println(Flightsearch.noFlights.getText());
	}

	public void verifyFlightlistDisplayed() {

		wait.until(ExpectedConditions.visibilityOf(Flightsearch.bookFlightBtn));
		Assert.assertEquals(Flightsearch.bookFlightBtn.getText(), "BOOK");
		System.out.println(Flightsearch.bookFlightBtn.getText());
	}

	public MoreFilterPage search() {

		Flightsearch.searchBtn.click();
		return new MoreFilterPage();

	}

}