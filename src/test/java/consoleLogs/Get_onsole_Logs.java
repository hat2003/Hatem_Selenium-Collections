package consoleLogs;

import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.testng.ITestResult;

public class Get_onsole_Logs {
	
	
	Logs logs;
	LogEntries logEntries;
	PrintWriter writer;
	
	public void getConsoleLogs(WebDriver driver, ITestResult result) throws Throwable, Throwable {

		logs = driver.manage().logs();
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
