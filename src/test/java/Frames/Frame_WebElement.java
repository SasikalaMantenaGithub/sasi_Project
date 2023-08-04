package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_WebElement {

	public static void main(String[] args) throws Throwable {
		// manages chrome driver
				WebDriverManager.chromedriver().setup();
				// opens the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.snapdeal.com/");

				WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
				Actions a = new Actions(driver);
				a.moveToElement(signIn).perform();
				driver.findElement(By.xpath("//a[text()='login']")).click();
		          //address of frame 
				WebElement ele = driver.findElement(By.xpath("//iframe[@id='loginIframe']"));
				//switching to frame
				driver.switchTo().frame(ele);

				driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("1234");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='close-pop']")).click();
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("123");

	}

}
