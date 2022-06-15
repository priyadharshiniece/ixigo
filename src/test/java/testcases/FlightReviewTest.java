package testcases;

import org.testng.annotations.Test;

import pages.actions.FlightReviewPage;

public class FlightReviewTest {

	@Test(priority=1)
	public void FlightReviewFlightdetails() {
		FlightReviewPage flightReview = new FlightReviewPage();
		flightReview.flightDetails("BOM - Mumbai", "MAA - Chennai");
		}
	@Test(priority=2)
	public void FlightReviewTravellerdetails() {
		FlightReviewPage flightReview = new FlightReviewPage();
			flightReview.travellerDetails(7, 0, 2);
		}
	@Test(priority=3,enabled=false)
	public void FlightReviewLayoverduration() {
		FlightReviewPage flightReview = new FlightReviewPage();
		flightReview.layoverDuration(8, 10);
		}
	
	@Test(priority=4)
	public void FlightReviewdepartureDate() {
		FlightReviewPage flightReview = new FlightReviewPage();
		flightReview.departureDate("Nov", "06");
		flightReview.returnDate("Nov", "11");
	}
	@Test(priority=5,enabled=false)
	public void FlightReviewLayoverAirport() {
		FlightReviewPage flightReview = new FlightReviewPage();
		 flightReview.layoverAirport("Bengaluru","Bengaluru");
	}
	@Test(priority=6)
	public void FlightReviewFlighttime() {
		FlightReviewPage flightReview = new FlightReviewPage();
		 flightReview.flightTime("Early Morning");
		 flightReview.flightTimeRtn("Night");
	}
	@Test(priority=7)
	public void FlightReviewAirways() {
		FlightReviewPage flightReview = new FlightReviewPage();
		flightReview.airways("IndiGo");
	}
	@Test(priority=8)
	public void FlightReviewRefundable() {
		FlightReviewPage flightReview = new FlightReviewPage();
		 flightReview.refundable();
	}
	@Test(priority=9)
	public void FlightReviewStops() {
		FlightReviewPage flightReview = new FlightReviewPage();
		flightReview.stops("1 stop");
	}
		
	
	}



