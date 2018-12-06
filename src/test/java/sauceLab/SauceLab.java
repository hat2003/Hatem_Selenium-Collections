package sauceLab;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

public class SauceLab {

	public static final String USERNAME = "";
	public static final String ACCESS_KEY = "";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	WebDriver driver;

	@Test
	public void testWizardOnEdge() throws MalformedURLException, InterruptedException {

		// https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/

		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "49.0");

		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("URL");

	}

}
