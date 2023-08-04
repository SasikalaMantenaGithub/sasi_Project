package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

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
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("course"));
		Actions s = new Actions(driver);
		s.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		//popup.dismiss();
		Thread.sleep(3000);
		popup.accept();
		
		driver.close();
	}

}
