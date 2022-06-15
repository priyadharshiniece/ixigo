package pages.actions;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import base.Page;
import pages.locators.MoreFiltersListLocators;

public class MoreFilterPage extends Page {

	public MoreFiltersListLocators MoreFlightsList;
	public static int filter;

	public MoreFilterPage() {
		this.MoreFlightsList = new MoreFiltersListLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 60);
		PageFactory.initElements(factory, this.MoreFlightsList);
	}

	public void verifystopsFliter(String stop) {

		filter = filter + 1;

		for (int i = 0; i < MoreFlightsList.stopsChklist.size(); i++) {
			if (MoreFlightsList.stopsChklist.get(i).getText().equalsIgnoreCase(stop)) {
				MoreFlightsList.stopsChklist.get(i).click();
				break;
			}
		}

	}

	public void refundableToggle() {
		filter = filter + 1;
		MoreFlightsList.refundableToggleBtn.click();
	}

	public void layoverDuration(int left, int right) {
		filter = filter + 1;

		//MoreFlightsList.morefilterBtn.click();
		//wait.until(ExpectedConditions.visibilityOf(MoreFlightsList.lessfilterBtn));

		int totalduration = (Integer.parseInt(MoreFlightsList.totalDuration.getText()));
		System.out.println(totalduration);
		if (left <= totalduration) {
			Point leftLocation = MoreFlightsList.layoverleftSlider.getLocation();
			Point rightLocation = MoreFlightsList.layoverRightSlide.getLocation();
			int xcordi = leftLocation.getX();
			// System.out.println("Element's Position from left side" + xcordi + "
			// pixels.");
			int ycordi = rightLocation.getX();
			// System.out.println("Element's Position from top" + ycordi + " pixels.");
			int length = ycordi - xcordi;
			Actions a = new Actions(driver);
			float d = (float) length / totalduration;
			String s = Page.df.format(d);
			System.out.println(s);
			float g = Float.parseFloat(s);
			float j = (g * left);
			System.out.println(j);
			int y = (int) j;
			float j1 = (g * right);
			System.out.println(j1);
			int y1 = (int) j1;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.dragAndDropBy(MoreFlightsList.layoverleftSlider, y, 0).release(MoreFlightsList.layoverleftSlider)
					.perform();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.dragAndDropBy(MoreFlightsList.layoverRightSlide, -(y1), 0).release(MoreFlightsList.layoverRightSlide)
					.perform();
			totalLayoverduration = Integer.parseInt(MoreFlightsList.totalDuration.getText());
			System.out.println(MoreFlightsList.layoverSlideRightTooltip.getText());
			System.out.println(MoreFlightsList.layoverSlideLeftTooltip.getText());
		} else {
			System.out.println("Input given is larger than the maximum length of the slider");
		}
	}

	public void layoverAirport(String airport) {
		filter = filter + 1;

		for (int i = 0; i < MoreFlightsList.airports.size(); i++) {
			if ((MoreFlightsList.airports.get(i).getText()).contains(airport)) {
				MoreFlightsList.airports.get(i).click();
				break;
			}
		}
	}

	public void departureFlightTime(String timing) {
		filter = filter + 1;
		MoreFlightsList.morefilterBtn.click();
		wait.until(ExpectedConditions.visibilityOf(MoreFlightsList.lessfilterBtn));
		for (int i = 0; i < MoreFlightsList.departureTime.size(); i++) {
			if (MoreFlightsList.departureTime.get(i).getText().equalsIgnoreCase(timing)) {
				MoreFlightsList.departureTimeBtn.get(i).click();

			}

		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String leftTooltip = MoreFlightsList.departuretimelefttooltip.getText();
		String rightTooltip = MoreFlightsList.departuretimerighttooltip.getText();
		String right = MoreFlightsList.departuretimeright.getText();
		String left = MoreFlightsList.departuretimeleft.getText();

		if (timing.equalsIgnoreCase("Early Morning")) {
			Assert.assertTrue(left.equalsIgnoreCase("00:00") && (rightTooltip.equalsIgnoreCase("06:00")));
		} else if (timing.equalsIgnoreCase("Morning")) {
			Assert.assertTrue(leftTooltip.equalsIgnoreCase("06:00") && (rightTooltip.equalsIgnoreCase("12:00")));
		} else if (timing.equalsIgnoreCase("Mid Day")) {
			Assert.assertTrue(leftTooltip.equalsIgnoreCase("12:00") && (rightTooltip.equalsIgnoreCase("18:00")));
		} else if (timing.equalsIgnoreCase("Night")) {
			Assert.assertTrue(leftTooltip.equalsIgnoreCase("18:00") && (right.equalsIgnoreCase("24:00")));
		}
	}

	public void departureFlightTimeReturn(String timing) {
		filter = filter + 1;
		for (int i = 0; i < MoreFlightsList.departureTimeReturn.size(); i++) {
			if (MoreFlightsList.departureTimeReturn.get(i).getText().equalsIgnoreCase(timing)) {
				MoreFlightsList.departureTimeBtnReturn.get(i).click();
			}
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String leftTooltip = MoreFlightsList.departuretimelefttooltipRtn.getText();
		String rightTooltip = MoreFlightsList.departuretimerighttooltipRtn.getText();
		String right = MoreFlightsList.departuretimerightRtn.getText();
		String left = MoreFlightsList.departuretimeleftRtn.getText();
		;
		if (timing.equalsIgnoreCase("Early Morning")) {
			Assert.assertTrue(left.equalsIgnoreCase("00:00") && (rightTooltip.equalsIgnoreCase("06:00")));
		} else if (timing.equalsIgnoreCase("Morning")) {
			Assert.assertTrue(leftTooltip.equalsIgnoreCase("06:00") && (rightTooltip.equalsIgnoreCase("12:00")));
		} else if (timing.equalsIgnoreCase("Mid Day")) {
			Assert.assertTrue(leftTooltip.equalsIgnoreCase("12:00") && (rightTooltip.equalsIgnoreCase("18:00")));
		} else if (timing.equalsIgnoreCase("Night")) {
			Assert.assertTrue(leftTooltip.equalsIgnoreCase("18:00") && (right.equalsIgnoreCase("24:00")));
		}

	}

	public void price(float price) {
		filter = filter + 1;
		float right = (Float.parseFloat(MoreFlightsList.priceright.getText()));
		float left = (Float.parseFloat(MoreFlightsList.priceleft.getText()));
		float totalduration = right - left;
		System.out.println(totalduration);
		Point leftLocation = MoreFlightsList.priceleft.getLocation();
		Point rightLocation = MoreFlightsList.priceright.getLocation();
		int xcordi = leftLocation.getX();
		System.out.println("Element's Position from left side" + xcordi + " pixels.");
		int ycordi = rightLocation.getX();
		System.out.println("Element's Position from top" + ycordi + " pixels.");
		int length = ycordi - xcordi;
		System.out.println(length);
		Actions a = new Actions(driver);
		float d = (float) totalduration / length;
		System.out.println(d);
		String s = Page.df.format(d);
		System.out.println(s);
		float g = Float.parseFloat(s);
		System.out.println(right);
		float j = (right - price);
		float j1 = j / g;
		System.out.println(j1);
		int y = (int) j1;
		a.dragAndDropBy(MoreFlightsList.pricerightSlidr, -(y), 0).release(MoreFlightsList.pricerightSlidr).perform();

	}

	public void airline(String airline) {
		filter = filter + 1;
		for (int i = 0; i < MoreFlightsList.airlineChexbox.size(); i++) {

			if (MoreFlightsList.airlineChexbox.get(i).getText().equalsIgnoreCase(airline)) {
				MoreFlightsList.airlineChexbox.get(i).click();
			}
		}

	}

	public void applyfilterBtn() {
		System.out.println("Total filters are" + filter);

		MoreFlightsList.applyfilterBtn.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(MoreFlightsList.filtertext.getText());
		Assert.assertEquals(Integer.parseInt(MoreFlightsList.filtertext.getText().substring(0, 1)), (filter));
		System.out.println(MoreFlightsList.filtertext.getText().substring(0, 1));

	}

}
