

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.vandebron.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;

	public static int randomNumbers(int min, int max) {

		Random r = new Random();
		int Low = min;
		int High = max;
		int Result = r.nextInt(High - Low) + Low;
		return Result;

	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("AutoReport/" + System.currentTimeMillis() + ".png"));
	}

	public static void clickByJS(WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	public static String TakeSnapshot(WebDriver driver, String pictureName) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Destination = pictureName + ".png";
		File FinalDestination = new File("AutoReport/" + Destination);
		FileUtils.copyFile(src, FinalDestination);
		return Destination;

	}

	public static void getConsoleLogs(WebDriver driver1, ITestResult result) throws Throwable, Throwable {

		logs = driver1.manage().logs();
		logEntries = logs.get(LogType.BROWSER);
		writer = new PrintWriter("AutoReport/" + result.getName() + ".txt", "UTF-8");

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
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
