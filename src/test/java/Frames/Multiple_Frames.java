package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Frames {
	public static void main(String[] args) throws Throwable {

	// take care of driver executables
	WebDriverManager.chromedriver().setup();
	// opens empty browser
	WebDriver driver = new ChromeDriver();
	// maximizes the browser
	driver.manage().window().maximize();
	// implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// enters the url
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
	//switching to the 1st frame w.r.t.name
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(30000);
	
	
	//switching to the 1st frame w.r.t.name
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		
		//switching to the 1st frame w.r.t.name
				driver.switchTo().frame("classFrame");
				driver.findElement(By.xpath("//a[text()='Help']")).click();
				driver.switchTo().defaultContent();
		
}
	
	

}
