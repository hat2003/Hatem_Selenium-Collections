package config;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import base.Configurations;

public class testConfig extends Configurations {

	@BeforeSuite(groups = { "Group1", "Group1"})
	public void setExtent() {
		
		// Location of the report
		extent = new ExtentReports("Snapshots/index.html", true);
		extent.addSystemInfo("Host Name", "Hatem Mac");
		extent.addSystemInfo("User Name", "Hatem Automation");
		extent.addSystemInfo("Enviroment", "QA Department");

	}

	@AfterSuite(groups = { "Regression", "Signup", "E2E", "Pricing" })
	public void endReport() {

		extent.flush();

	}

}
