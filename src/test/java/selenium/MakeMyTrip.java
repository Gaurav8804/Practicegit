package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 
import io.github.bonigarcia.wdm.WebDriverManager;


public class MakeMyTrip {
	static String date = "Sun Mar 31 2024";
	static String returnDate = "Tue Apr 02 2024";

	@Test 
	 public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//ul[contains(@class,'ext ')]/li[@data-cy='roundTrip']/span")).click();
		Actions act = new Actions(driver);
		 
 for(;;) {
			try {
				driver.findElement(By.xpath("//input[@id='fromCity']")).click();
				driver.findElement(By.xpath(" //li[contains(@id,'4')]")).click();
				driver.findElement(By.id("toCity")).click();
				driver.findElement(By.xpath("//li[contains(@id,'0-item-0')]")).click();
				driver.findElement(By.xpath(
						" //div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/descendant::div[@aria-label='"
								+ date + "']"))
						.click();
				driver.findElement(By.xpath(
						" //div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/descendant::div[@aria-label='"
								+ returnDate + "']"))
						.click();
				driver.findElement(By.xpath(" //p[@data-cy='submit']/a[text()='Search']")).click();
				break;
			 
			} catch (Exception e) {
				WebElement frame = driver.findElement(By.cssSelector("[id='webklipper-publisher-widget-container-notification-frame']"));
				driver.switchTo().frame(frame);
				driver.findElement(By.xpath("//div[@class='wrapper-outer']//a[contains(@id,'v') and @class='close' ]/i[contains(@class,'e')]")).click();
				driver.switchTo().defaultContent();
			}
		}
 driver.quit();
	}
}
