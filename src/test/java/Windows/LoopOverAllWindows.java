package Windows;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;


public class LoopOverAllWindows {
	
	WebDriver driver;
	
	public void printAllWindowsTitle() {
		
		 Set <String> urls = driver.getWindowHandles();
	    	Iterator <String> it = urls.iterator();
	    		
	    		
	        	while (it.hasNext())
	        	{
	        		
	        		driver.switchTo().window(it.next());
	        		System.out.println(driver.getCurrentUrl());
	        	
	        	
	        	}
	        
	       
		}
		
}


