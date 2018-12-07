package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleFrames {

	WebDriver driver;

	public void switchToFrameByElement(By by) {

		int numberOfFrames = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < numberOfFrames; i++) {
			driver.switchTo().frame(i);
			if (driver.findElements(by).size() > 0) {
				break;

			}

		}

	}

	/*
	 * In the test case we write the below:
	 * 
	 * switchToFrameByElement(By.xpath(""));
	 * 
	 * Do the Test
	 * 
	 * driver.switchTo().defaultContent();
	 * 
	 * 
	 */

}
