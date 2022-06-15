package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Page;
import pages.actions.FlightListPage;

public class FlightsListTest {


	@Test(priority=2)
	public void FlightListQuickSort() {
	FlightListPage flightList = new FlightListPage();
	flightList.quickestSort();
	}
	
	@Test(priority=1)
	public void FlightStop() {
	FlightListPage flightList = new FlightListPage();
	flightList.quickestSort();
	}
	@Test(priority=3)
	public void FlightListPricesort() {
	FlightListPage flightList = new FlightListPage();
	//FlightReviewPage flightReview = new FlightReviewPage();
	flightList.price();
	flightList.bookFlight();
	}

	}

