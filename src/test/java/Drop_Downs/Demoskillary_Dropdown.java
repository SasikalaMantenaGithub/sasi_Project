package Drop_Downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoskillary_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement opt = driver.findElement(By.id("cars"));
//created an object for select class
		Select s = new Select(opt);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("299");
		Thread.sleep(3000);
		//s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		//Thread.sleep(3000);
		//visible text is not working in demo skillrary app
		//s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		Thread.sleep(3000);
		s.deselectAll();
		//s.deselectByIndex(1);
		//Thread.sleep(3000);
		//s.deselectByValue("199");
		Thread.sleep(3000);
		//s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		List<WebElement> ele = s.getAllSelectedOptions();
		for (WebElement ele1 : ele) {
			System.out.println(ele1.getText());
		}
		//fetching all the values in to cosole
		List<WebElement> opts = s.getOptions();
		for(WebElement b:opts) {
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();

	}

}
