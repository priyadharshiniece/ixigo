package extentlisteners;

import java.io.IOException;


import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import com.relevantcodes.extentreports.LogStatus;

import base.Page;

import utilities.TestUtil;



public class ExtentListeners extends Page implements ITestListener, ISuiteListener {




	
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = rep.startTest(result.getName().toUpperCase());
	
	}

	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, result.getName().toUpperCase() + "PASS");
	
	}

	public void onTestFailure(ITestResult result) {

		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, result.getName().toUpperCase() + " Failed with an execption" + result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		Reporter.log("Login is not sucessful");
		Reporter.log("<a target = \"_blank\" href=" + TestUtil.screenshotName + ">screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target = \"_blank\" href=" + TestUtil.screenshotName + "><img src =" + TestUtil.screenshotName
				+ " height=200, width=200></img></a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName().toUpperCase() + " Skipped as the rumode is No");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		rep.endTest(test);
		rep.flush();

	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
