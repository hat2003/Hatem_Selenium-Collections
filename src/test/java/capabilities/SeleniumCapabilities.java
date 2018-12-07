package capabilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
public class SeleniumCapabilities {

	public static void main(String[] args) {
		
		
		// https://peter.sh/experiments/chromium-command-line-switches/
		
		// Chrome Options
		ChromeOptions options = new ChromeOptions();

		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		options.addArguments("--start-fullscreen");
        options.addArguments("--incognito");
        options.addArguments("--mute-audio");
        
        
        
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://google.com");
		
		
		
		
		
//		//FireFox Options
//		FirefoxOptions options1 = new FirefoxOptions();
//		options1.setCapability("", "");
//		
//		//WebDriver driver1 = new FirefoxDriver(options1);
		
		
		

	}

}
