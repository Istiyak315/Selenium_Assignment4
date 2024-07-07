package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframes {
	
	WebDriver driver;
	@BeforeTest
	
	public void bt() {
		
		driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		driver.switchTo().frame("courses-iframe");
		
		WebElement clk =driver.findElement(By.linkText("Mentorship"));
		clk.click();
		
		driver.switchTo().defaultContent();
		driver.navigate().back();
	}
	
	@AfterTest
	public void at() {
		driver.quit();
	}

}
