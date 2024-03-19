package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZopSmart {
	@Test
	public void ZopTest() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://zopsmart.com");
	System.out.println(driver.getTitle());
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://zopsmart.com/careers");
	System.out.println(driver.getTitle());
	driver.close();
	
	}
}
