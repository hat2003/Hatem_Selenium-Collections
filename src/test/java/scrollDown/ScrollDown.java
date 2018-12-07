package scrollDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollDown {

	WebDriver driver;
	
	
	public void scrollDown () {
		// TODO Auto-generated method stub
		
		//Scroll to a point
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//Scroll to an Element
		WebElement Element = driver.findElement(By.linkText("Linux"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		//Scroll to the end of the page
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		 
		

	}

}
