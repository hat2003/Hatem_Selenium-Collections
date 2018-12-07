package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String ParentWindow = it.next();
		String childWindow= it.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("emailid")).sendKeys("hatem@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().window(ParentWindow);
		
		
		

	}

}
