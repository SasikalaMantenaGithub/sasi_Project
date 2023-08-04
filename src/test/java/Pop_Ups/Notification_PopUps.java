package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_PopUps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		
		//FirefoxOptions option =  new FirefoxOptions();
		//option.addArguments("--disable-notifications");
		//WebDriver driver1 = new FirefoxDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.quikr.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

	}

}
