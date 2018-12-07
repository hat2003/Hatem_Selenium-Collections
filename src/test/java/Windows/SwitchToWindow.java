package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchToWindow {
	
WebDriver driver;
	

	public void switchWindow() {
		
		 Set <String> urls = driver.getWindowHandles();
	    	Iterator <String> it = urls.iterator();
	    	String parentWindowID = it.next();
	    	String childWindowID = it.next();
	    	
	    	//To switch to child window
	    	driver.switchTo().window(childWindowID);
	    	
	    	// To switch back to parent ID after complete the test
	    	driver.switchTo().window(parentWindowID);
	       
		}

}
