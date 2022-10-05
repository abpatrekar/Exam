package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class toggle {
	

	public static void main(String[] args) throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		//Reminder to send keys
		driver.findElement(By.name("data")).click();

		driver.findElement(By.name("allbox")).click();
		Thread.sleep(2000);
		boolean isElementSelected = driver.findElement(By.name("allbox")).isSelected();
		assertTrue("Element is not selected by default", isElementSelected);
		
		boolean isElementNotSelected = driver.findElement(By.name("allbox")).isSelected();
		assertFalse("It should be selected", isElementNotSelected);
	}
}
		
