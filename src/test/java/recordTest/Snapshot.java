package recordTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshot {
	
	WebDriver driver;
	
	public String TakeSnapshot(WebDriver driver, String pictureName) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Destination = pictureName + ".png";
		File FinalDestination = new File("Location" + Destination);
		FileUtils.copyFile(src, FinalDestination);
		
		//To use in Extends report
		return Destination;

	}

}
