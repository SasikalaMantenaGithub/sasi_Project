package ScrollBar_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Skillrary_Carrers {

@Parameters({"browsername"})
@Test
public void Demo1(String browser) throws Throwable
{
	WebDriver driver ;
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		Point ele = career.getLocation();
		int x = ele.getX();
		int y = ele.getY();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		
		Thread.sleep(5000);
		career.click();

		Thread.sleep(5000);
		driver.close();

	}

}
