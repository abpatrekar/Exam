package project2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.runtime.junit.Assertions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

public class RemoveOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		//Reminder to send keys
		WebElement sen=driver.findElement(By.cssSelector("body > div.advance-controls > input[type=text]:nth-child(1)"));
		sen.sendKeys("Tester1");
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector("body > div.advance-controls > input[type=submit]:nth-child(2)")).click();
		Thread.sleep(2000);
		WebElement k =driver.findElement(By.name("todo[0]"));
		k.click();
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		try {
			driver.findElement(By.name("todo[0]"));
			System.out.println("Doesn't work");
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Remove button Works");
		
		
		}
	}
		//works
}
