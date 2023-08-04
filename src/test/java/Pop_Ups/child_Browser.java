package Pop_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child_Browser {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String d:child)
		{
			driver.switchTo().window(d);
		}
		
		driver.findElement(By.id("mytext")).sendKeys("Sasikala");
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
