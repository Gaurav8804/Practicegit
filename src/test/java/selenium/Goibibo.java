package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {
	static String Dep_Date="Sun Mar 31 2024";
	static String Ret_Date="Thu Apr 18 2024";
	@Test
	public void scenarioIbibo() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights");
//		Actions act=new Actions(driver);
//		act.doubleClick();
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		driver.findElement(By.xpath(" //ul[contains(@class,'OeX')]/li[contains(@class,'sc-12foipm-82 kEVACM')]/p[text()='Round-trip']")).click();
		driver.findElement(By.xpath("//div[@class='sc-12foipm-35 kdxZzw']/descendant::p[text()='Enter city or airport']")).click();
		//Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Bangalore");
		driver.findElement(By.xpath("//span[@class=\"autoCompleteTitle \" and text()='Bengaluru, India']")).click();
        driver.findElement(By.xpath("//span[text()='To']/following-sibling::input[@type=\"text\"]")).sendKeys("NewDelhi");
        driver.findElement(By.xpath(" //div[contains(@class,'sc-12foipm-45 gfqMUQ')]/p/span[text()='New Delhi, India']")).click();
        driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/descendant::div[@aria-label='"+Dep_Date+"']")).click();
        driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/descendant::div[@aria-label='"+Ret_Date+"']")).click();
        driver.findElement(By.xpath("//span[text()='Done']")).click();
//        Thread.sleep(10000);
        driver.findElement(By.xpath(" //span[text()='SEARCH FLIGHTS']")).click();
        driver.quit();
       
        
        
		
		
		
	}

}
