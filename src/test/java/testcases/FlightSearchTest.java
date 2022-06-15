package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Page;

import pages.actions.FlightSearchPage;
import pages.actions.MoreFilterPage;


public class FlightSearchTest {

	@BeforeTest
	public void initialization() {
		Page.initConfiguration();
	}

	// @BeforeTest
	@Test
	public void hotelsearchtest() {

		FlightSearchPage FlightSearchPage = new FlightSearchPage();
		// FlightListPage flightList = new FlightListPage();
		FlightSearchPage.fromCity("BOM - Mumbai");

		FlightSearchPage.toCity("MAA - Chennai");

		FlightSearchPage.dateSearchDeparture("November 2022", "6");
		FlightSearchPage.travellbtnClose();
		FlightSearchPage.dateSearchReturn("November 2022", "11");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	 e.printStackTrace();
	 }
			FlightSearchPage.travellersdetails("7", "0", "2");
			FlightSearchPage.search();
			FlightSearchPage.verifyFlightlistDisplayed();
		}
	

	@Test( priority = 2)
	public void verifymoreFilterStops() {
		MoreFilterPage MoreFilterPage = new MoreFilterPage();
		MoreFilterPage.verifystopsFliter("1 stop");
	}

	@Test(priority = 3)
	public void verifymoreFilterRefundable() {
		MoreFilterPage MoreFilterPage = new MoreFilterPage();
		MoreFilterPage.refundableToggle();

	}

	/*
	 * @Test(enabled = false, priority = 4) public void
	 * verifymoreFilterLayoverduration() { MoreFilterPage MoreFilterPage = new
	 * MoreFilterPage(); MoreFilterPage.layoverDuration(8, 10); }
	 * 
	 * @Test( enabled = false, priority = 5) public void
	 * verifymoreFilterLayoverAirport() { MoreFilterPage MoreFilterPage = new
	 * MoreFilterPage(); MoreFilterPage.layoverAirport("Bengaluru"); }
	 */

	@Test( priority = 6)
	public void verifymoreFilterDepartureFlightTime() {
		MoreFilterPage MoreFilterPage = new MoreFilterPage();
		MoreFilterPage.departureFlightTime("Early Morning");
	}

	@Test( priority = 7)
	public void verifymoreFilterDepartureFlightTimeReturn() {
		MoreFilterPage MoreFilterPage = new MoreFilterPage();
		MoreFilterPage.departureFlightTimeReturn("Night");
	}

	@Test( priority = 8)
	public void verifymoreFilterPrice() {
		MoreFilterPage MoreFilterPage = new MoreFilterPage();
		MoreFilterPage.price(20000);
	}

	@Test( priority = 9)
	public void verifymoreFilterAirways() {
		MoreFilterPage MoreFilterPage = new MoreFilterPage();
		MoreFilterPage.airline("IndiGo");
		MoreFilterPage.applyfilterBtn();

	}

}
