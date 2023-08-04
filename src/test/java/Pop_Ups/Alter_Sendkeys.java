package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Sendkeys {

	public static void main(String[] args) throws Throwable {
		//take care of driver executables
				WebDriverManager.chromedriver().setup();
				// opens empty browser
				WebDriver driver = new ChromeDriver();
				// maximizes the browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// enters the url
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				//address of the js prompy
				driver.findElement(By.xpath(("//button[text()='Click for JS Prompt']"))).click();
				
				Thread.sleep(3000);
				//shift control to pop up
				 driver.switchTo().alert().sendKeys("sasi");
				
				
				//al.sendKeys("sasi");
				
			

	}

}
