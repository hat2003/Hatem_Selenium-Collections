package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Configurations {

	public static ExtentReports extent;
	public static ExtentTest logger;
	public static Logger log = LogManager.getLogger(Configurations.class.getName());
	Logs logs;
	LogEntries logEntries;
	PrintWriter writer;

	public WebDriver launchWebsite(String url, String Browser) throws InterruptedException {
		WebDriver driver = null;

		if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
			driver = new FirefoxDriver();

		} else if (Browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);

		boolean condition = driver.findElements(By.xpath("//a[@id='cookies_accept']")).get(0).isDisplayed();
		if (condition) {
			driver.findElements(By.xpath("//a[@id='cookies_accept']")).get(0).click();

		}

		return driver;

	}

	public Properties getProp() throws Exception {

		Properties prop = new Properties();
		InputStream stream = new FileInputStream("src/main/java/pageObject/object.properties");
		prop.load(stream);
		return prop;

	}

	public String TakeSnapshot(WebDriver driver, String pictureName) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Destination = pictureName + ".png";
		File FinalDestination = new File("Snapshots/" + Destination);
		FileUtils.copyFile(src, FinalDestination);
		return Destination;

	}

	public int randomNumbers(int min, int max) {

		Random r = new Random();
		int Low = min;
		int High = max;
		int Result = r.nextInt(High - Low) + Low;
		return Result;

	}

	public void getConsoleLogs(WebDriver driver1, ITestResult result) throws Throwable, Throwable {

		logs = driver1.manage().logs();
		logEntries = logs.get(LogType.BROWSER);
		writer = new PrintWriter("Snapshots/" + result.getName() + ".txt", "UTF-8");

		for (LogEntry logEntry : logEntries) {
			writer.println("Console log found in Test- " + result.getName());

			writer.println("__________________________________________________________");

			if (logEntry.getMessage().toLowerCase().contains("error")) {
				writer.println("Error Message in Console:" + logEntry.getMessage());

			} else if (logEntry.getMessage().toLowerCase().contains("warning")) {
				writer.println("Warning Message in Console:" + logEntry.getMessage());

			} else {
				writer.println("Information Message in Console:" + logEntry.getMessage());
			}
		}
		writer.close();
	}

}
