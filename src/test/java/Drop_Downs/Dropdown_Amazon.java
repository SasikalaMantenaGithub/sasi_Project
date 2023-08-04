package Drop_Downs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement opt = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s = new Select(opt);
		//selecting by index
	s.selectByIndex(1);
	//selecting by value
	s.selectByValue("search-alias=alexa-skills");
	//select by text
		s.selectByVisibleText("Amazon Fashion");
		Thread.sleep(3000);
		//printing all the options
		List<WebElement> allOptions = s.getOptions();
		for(WebElement b:allOptions) {
			System.out.println(b.getText());
		}
		System.out.println(s.isMultiple());
		
		
		
	}

}
