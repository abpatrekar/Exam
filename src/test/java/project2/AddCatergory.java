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

public class AddCatergory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		//Reminder to send keys
		WebElement added=driver.findElement(By.name("categorydata"));
		added.sendKeys("CategoryBill1");
		driver.findElement(By.cssSelector("#extra > input[type=submit]:nth-child(8)")).click();
		boolean textFound = false;  
		try {
		    driver.findElement(By.xpath("//*[contains(text(),'CategoryBill1')]"));
		    textFound = true;
		    System.out.println("Category added");
		} catch (Exception e) {
		    textFound = false;
		    System.out.println("Category not added");
		}
	}
//works
}
