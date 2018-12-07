package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sleep {
	

	WebDriver driver;
	
	public void sleepTypes() throws InterruptedException {
		
		// Thread sleep: Stop all the execution for a specific amount of time in mil Seconds
		Thread.sleep(3000);
		
		/*
		 * The implicit wait will tell to the web driver to wait for certain amount of time before it throws a "No Such Element Exception".
		 * The default setting is 0. Once we set the time, web driver will wait for that time before throwing an exception.
		 * In the below example we have declared an implicit wait with the time frame of 10 seconds.
		 * It means that if the element is not located on the web page within that time frame, it will throw an exception.
		 */
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		/*
		 * The explicit wait is used to tell the Web Driver to wait for certain conditions (Expected Conditions)
		 * or the maximum time exceeded before throwing an "ElementNotVisibleException" exception.
		 * The explicit wait is an intelligent kind of wait, but it can be applied only for specified elements.
		 */
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "Xpath")));
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "Xpath")));
		
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath( "Xpath")));
			
		wait.until(ExpectedConditions.urlToBe(""));
		
		WebElement element = driver.findElement(By.xpath(""));
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, "Click me"));
		
		
		
		
		
		
	}

}
