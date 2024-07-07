package Questions;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertClass {
    
    WebDriver driver;
    Alert alert;

    @BeforeTest
    public void setup() {
       
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigate to the website
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
    }
    
    @Test
    public void test() {
    	
    	//click the button to open alert
    	driver.findElement(By.id("alertBox")).click();
    	
    	 // Switch to alert
    	 alert = driver.switchTo().alert();
    	 
    	 // Print alert text
    	 System.out.println(alert.getText());
    	 
    	// Accept the alert
    	 alert.accept();
    }

    @Test
    public void test2() {
        // Click the button to open the confirmation alert
        driver.findElement(By.id("confirmBox")).click();
        
        // Switch to alert
        alert = driver.switchTo().alert();
        
        // Print alert text
        System.out.println(alert.getText());
        
        // Accept the alert
        alert.accept();
        
    }
    
    @Test
    public void test3() {
    	
    	driver.findElement(By.id("promptBox")).click();
    	alert = driver.switchTo().alert();
    	alert.sendKeys("mai hu don");
    	System.out.println(alert.getText());
    	alert.accept();
    	
    }

    @AfterTest
    public void teardown() {
        //close the browser
            driver.quit();
        
    }
}
