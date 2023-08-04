package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentiction_Popup_alert {

	public static void main(String[] args) {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.get("https://the-internet.herokuapp.com/basic_auth");
Alert alert = driver.switchTo().alert();
//alert.authenticationUsing(new userAndPassword("admin","admin"));



	}

}
