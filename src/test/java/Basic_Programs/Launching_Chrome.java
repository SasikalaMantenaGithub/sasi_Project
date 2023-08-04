package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Chrome {

	public static void main(String[] args) {
		//take care of driver executables
		WebDriverManager.chromedriver().setup();
		// opens empty browser in minimize mode
		WebDriver driver = new ChromeDriver();
		// maximizes the browser
		//driver.manage().window().maximize();
		//minimize
		///driver.manage().window().fullscreen();
		

}
}
