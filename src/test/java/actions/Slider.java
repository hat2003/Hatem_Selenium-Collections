package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().fullscreen();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		for (int i = 1 ; i< size ; i++) {
			
			driver.switchTo().frame(i);
			System.out.println(driver.findElements(By.id("gallery")).size());
			
		}
		
		
		
		

	}

}
