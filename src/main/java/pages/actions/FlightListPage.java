package pages.actions;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.Page;
import pages.locators.FlightListLocators;
import pages.locators.MoreFiltersListLocators;

public class FlightListPage extends Page {

	public FlightListLocators FlightList;
	public MoreFiltersListLocators MoreFlightsList;

	public FlightListPage() {
		this.FlightList = new FlightListLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.FlightList);
	}

	public void quickestSort() {
		wait.until(ExpectedConditions.visibilityOf(FlightList.bookBtn));
		FlightList.quickestSort.click();
		ArrayList<Integer> OriginaldurationList = new ArrayList<Integer>();
		ArrayList<Integer> CopieddurationList = new ArrayList<Integer>();
		System.out.println(FlightList.durationList.size());
		for (int i = 0; i < FlightList.durationList.size(); i++) {
			String time = FlightList.durationList.get(i).getText();
			String[] array = time.split(" ");
			if (array.length > 1) { // if it has minute and hour content
				String Hour = array[0];
				String[] H = Hour.split("hr");
				String Min = array[1];
				String[] M = Min.split("min");

				int hour = Integer.parseInt(H[0]);
				int minute = Integer.parseInt(M[0]);
				int tot = hour * 60 + minute;
				System.out.println(tot);
				// System.out.println(minute);
				OriginaldurationList.add(tot);
			} else {
				String[] array1 = time.split(" ");
				String onlyHour1 = array1[0];
				String[] H = onlyHour1.split("hr");
				int hour = Integer.parseInt(H[0]);
				int tot1 = hour * 60;
				System.out.println(tot1);
				OriginaldurationList.add(tot1);
			}

		}

		System.out.println(OriginaldurationList);

		for (int j = 0; j < OriginaldurationList.size(); j++) {
			CopieddurationList.add(OriginaldurationList.get(j));
		}
		Collections.sort(CopieddurationList);
		System.out.println(CopieddurationList);
		Assert.assertTrue(OriginaldurationList.equals(CopieddurationList));
log.info("Quicksort");
	}

	public void price() {
		FlightList.cheapestSort.click();
		ArrayList<Integer> OriginalPriceList = new ArrayList<Integer>();
		ArrayList<Integer> CopiedpriceList = new ArrayList<Integer>();
		for (int i = 0; i < FlightList.priceList.size(); i++) {
			OriginalPriceList.add(Integer.parseInt((FlightList.priceList.get(i).getText())));
		}
		System.out.println(OriginalPriceList);

		for (int j = 0; j < OriginalPriceList.size(); j++) {
			CopiedpriceList.add(OriginalPriceList.get(j));
		}
		Collections.sort(CopiedpriceList);
		System.out.println(CopiedpriceList);
		Assert.assertTrue(OriginalPriceList.equals(CopiedpriceList));
		log.info("Pricesort");
	}

	public void VerifyStops(String stop) {

		for (int j = 0; j <= MoreFlightsList.stopsChklistResults.size(); j++) {

			if (stop.equalsIgnoreCase(MoreFlightsList.stopsChklist.get(0).getText())) {
				System.out.println(MoreFlightsList.stopsChklistResults.get(0).getText());
				MoreFlightsList.stopsChklistResults.get(j).getText().substring(1);
				Assert.assertTrue(MoreFlightsList.stopsChklistResults.get(j).getText().contains("non"));
				log.info("non stop");
			} else if (stop.equalsIgnoreCase(MoreFlightsList.stopsChklist.get(1).getText())) {
				String a = MoreFlightsList.stopsChklistResults.get(j).getText().substring(2);
				String b = stop.substring(2);
				Assert.assertEquals(a, b);
				log.info("1 stop");
			} else if (stop.equalsIgnoreCase(MoreFlightsList.stopsChklist.get(2).getText())) {
				String a = MoreFlightsList.stopsChklistResults.get(j).getText().substring(1);
				String b = stop.substring(2);
				Assert.assertEquals(a, b);
				log.info("1+ stops");
			}

		}

	}

	public void bookFlight() {
		wait.until(ExpectedConditions.visibilityOf(FlightList.bookBtn));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FlightList.bookBtn.click();
		wait.until(ExpectedConditions.visibilityOf(FlightList.logintobookBtn));
		Assert.assertTrue(FlightList.logintobookBtn.getText().equalsIgnoreCase("continue booking")
				|| FlightList.logintobookBtn.getText().equalsIgnoreCase("Login to proceed"));
	}
}
