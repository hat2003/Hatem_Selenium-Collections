package extentReport;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.Configurations;

public class Extent_Report extends Configurations {

	// First we need to define before and after test --> Check testConfig class
	// inside config package


	@Test
	public void Testcase1() {

		logger = extent.startTest("Test case name that will appear in the report");

	}

	@AfterMethod(alwaysRun = true)
	public void closeDriver(ITestResult result) throws Throwable {

		if (result.getStatus() == ITestResult.FAILURE) {

			// logger.log(LogStatus.FAIL, "The testcase is failed because of " +
			// result.getThrowable());
			// String picturePath = TakeSnapshot(driver, result.getName());
			// logger.log(LogStatus.FAIL, logger.addScreenCapture(picturePath));
			// logger.log(LogStatus.FAIL, "<a href='"+result.getName()+".mov" + "'><span
			// class='lable info'>Download Video</span></a>");
			// logger.log(LogStatus.FAIL, "<a href='"+ result.getName()+".txt" +"'
			// download><span class='lable info'>Console Logs</span></a>");

		} else if (result.getStatus() == ITestResult.SKIP) {
			// logger.log(LogStatus.SKIP, "Test case Skipped is "+ result.getName());

		} else {

			// String picturePath = TakeSnapshot(driver, result.getName());
			// logger.log(LogStatus.PASS, logger.addScreenCapture(picturePath));
			// logger.log(LogStatus.PASS, "<a href='"+result.getName()+".mov" + "'
			// download><span class='lable info'>Download Video</span></a>");
			// logger.log(LogStatus.PASS, "<a href='"+ result.getName()+".txt" +"'
			// download><span class='lable info'>Console Logs</span></a>");

		}

		// extent.endTest(logger);
		// driver.quit();

	}

}
