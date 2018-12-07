package keyBoard;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class KeyBoardActions {
	
	WebDriver driver;
	
	@Test
	public void keyboard() {
		
		String newTap = Keys.chord(Keys.COMMAND,Keys.SHIFT,Keys.ENTER);
		driver.findElement(By.xpath("")).sendKeys(newTap);
		
	}
		
	
	// This is very helpful to open in new tab, do any shortcuts in browser using keyboard
	
	
}

