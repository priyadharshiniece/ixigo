package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import base.Page;
import pages.locators.FlightReviewListLocators;

public class FlightReviewPage extends Page {

	public FlightReviewListLocators FlightReview;

	public FlightReviewPage() {
		this.FlightReview = new FlightReviewListLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.FlightReview);
	}

	public void flightDetails(String fromcityName, String toCityname) {

		String[] flightname = FlightReview.flightdetails.getText().split("to");
		Assert.assertTrue(fromcityName.contains(flightname[0].trim()));
		Assert.assertTrue(toCityname.contains(flightname[1].trim()));

	}

	public void travellerDetails(int adult, int child, int infant) {

		int tot = adult + child + infant;
		String[] x = FlightReview.travellerDetails.getText().split(" ");
		System.out.println(x[0].substring(1));
		int travellerDetails = Integer.parseInt(x[0].substring(1));
		Assert.assertTrue(travellerDetails == tot);
		log.info("Number of passengers travelling");

	}

	public void layoverDuration(int min, int max) {
		int min1 = min * 60;
		int max1 = (totalLayoverduration - max) * 60;
		/*
		 * int finalduration = 0; int tot = 0; int tot1 = 0;
		 */

		System.out.println(max1 + " " + min1);

		if (FlightReview.layoverDetails.size() == 1) {
			System.out.println(FlightReview.layoverDetails.get(0).getText());
			String[] data = FlightReview.layoverDetails.get(0).getText().split(",");
			String airport = data[0];
			String[] dur = data[1].split("of");
			String durlatest = dur[1].trim();
			System.out.println(durlatest);
			System.out.println(airport);
			/*
			 * String[] array = durlatest.split(" "); if (array.length > 1) { // if it has
			 * minute and hour content String Hour = array[0]; String[] H =
			 * Hour.split("hr"); String Min = array[1]; String[] M = Min.split("min");
			 * 
			 * int hour = Integer.parseInt(H[0]); int minute = Integer.parseInt(M[0]); tot =
			 * hour * 60 + minute; System.out.println(tot); } else { String[] array1 =
			 * durlatest.split(" "); String onlyHour1 = array1[0]; String[] H =
			 * onlyHour1.split("hr"); int hour = Integer.parseInt(H[0]); tot1 = hour * 60;
			 * System.out.println(tot1); } finalduration = tot + tot1;
			 */
			Page.splitTime(durlatest);
			Assert.assertTrue(finalduration > min1 && finalduration < max1);
		} else {

			for (int i = 0; i < FlightReview.layoverDetails.size(); i++) {
				System.out.println(FlightReview.layoverDetails.get(i).getText());

				System.out.println(FlightReview.layoverDetails.get(i).getText());
				String[] data = FlightReview.layoverDetails.get(i).getText().split(",");
				String airport = data[0];
				String[] dur = data[1].split("of");
				String durlatest = dur[1].trim();
				System.out.println(durlatest);
				System.out.println(airport);
				/*
				 * String[] array = durlatest.split(" "); if (array.length > 1) { // if it has
				 * minute and hour content String Hour = array[0]; String[] H =
				 * Hour.split("hr"); String Min = array[1]; String[] M = Min.split("min");
				 * 
				 * int hour = Integer.parseInt(H[0]); int minute = Integer.parseInt(M[0]); tot =
				 * hour * 60 + minute; System.out.println(tot); } else { String[] array1 =
				 * durlatest.split(" "); String onlyHour1 = array1[0]; String[] H =
				 * onlyHour1.split("hr"); int hour = Integer.parseInt(H[0]); tot1 = hour * 60;
				 * System.out.println(tot1);
				 * 
				 * } finalduration = finalduration + (tot + tot1);
				 */
				//System.out.println(finalduration);

			}
			Assert.assertTrue(finalduration > min1 && finalduration < max1);
		}

	}

	public void departureDate(String month, String date) {
		Assert.assertTrue(FlightReview.flightDatedetails.getText().contains(month)
				&& FlightReview.flightDatedetails.getText().contains(date));
	}

	public void returnDate(String month, String date) {
		Assert.assertTrue(FlightReview.flightDatedetailsRtn.getText().contains(month)
				&& FlightReview.flightDatedetailsRtn.getText().contains(date));
	}

	public void layoverAirport(String airport, String airport2) {
		for (int i = 0; i < FlightReview.layoverDetails.size(); i++) {
			String[] data = FlightReview.layoverDetails.get(i).getText().split(",");
			String[] airport1 = data[0].split("at");
			String airpotlatest = airport1[1].trim();
			System.out.println(airpotlatest);
			Assert.assertTrue((FlightReview.layoverDetails.get(i).getText().contains(airport))
					|| (FlightReview.layoverDetails.get(i).getText().contains(airport2)));
			// break;
		}

	}

	public void flightTime(String timimg) {

		System.out.println(FlightReview.FlightstaringTimedetails.getText());
		String[] time = FlightReview.FlightstaringTimedetails.getText().split(":");
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		if (timimg.equalsIgnoreCase("Morning")) {
			Assert.assertTrue(hour == 06 | hour < 12 || hour <= 12 && min == 00 || min < 59 || min <= 59);
		} else if (timimg.equalsIgnoreCase("Early Morning")) {
			Assert.assertTrue(hour == 00 || hour < 06 || hour <= 06 && min == 00 || min < 59 || min <= 59);
		} else if (timimg.equalsIgnoreCase("Mid Day")) {
			Assert.assertTrue(hour == 12 || hour < 12 || hour <= 18 && min == 00 || min < 59 || min <= 59);
		} else if (timimg.equalsIgnoreCase("Night")) {
			Assert.assertTrue(hour == 18 || hour < 18 || hour <= 24 && min == 00 || min < 59 || min <= 59);
		}
	}

	public void flightTimeRtn(String timimg) {

		System.out.println(FlightReview.FlightstaringTimedetailsRtn.getText());
		String[] time = FlightReview.FlightstaringTimedetailsRtn.getText().split(":");
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		if (timimg.equalsIgnoreCase("Morning")) {
			Assert.assertTrue(hour == 06 | hour < 12 || hour <= 12 && min == 00 || min < 59 || min <= 59);
		} else if (timimg.equalsIgnoreCase("Early Morning")) {
			Assert.assertTrue(hour == 00 || hour < 06 || hour <= 06 && min == 00 || min < 59 || min <= 59);
		} else if (timimg.equalsIgnoreCase("Mid Day")) {
			Assert.assertTrue(hour == 12 || hour < 12 || hour <= 18 && min == 00 || min < 59 || min <= 59);
		} else if (timimg.equalsIgnoreCase("Night")) {
			Assert.assertTrue(hour == 18 || hour < 18 || hour <= 24 && min == 00 || min < 59 || min <= 59);
		}
	}

	public void airways(String airways) {
		for (int i = 0; i < FlightReview.airlinedetails.size(); i++) {
			Assert.assertTrue(FlightReview.airlinedetails.get(i).getText().contains(airways));
		}

	}

	public void refundable() {
		Assert.assertTrue(FlightReview.refundable.getText().contains("Refundable"));
	}

	public void stops(String stop) {
		if (stop.equalsIgnoreCase("1 stop")) {
			Assert.assertTrue(FlightReview.layoverDetails.size() == 1);
		} else if (stop.contains("stops")) {
			Assert.assertTrue(FlightReview.layoverDetails.size() > 1);		
		}
	}
}
