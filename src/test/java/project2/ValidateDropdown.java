package project2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class ValidateDropdown {

	public static void main(String[] args)  {

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		String expectedOptions [] = {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		//Reminder to send keys
		WebElement dropDown = driver.findElement(By.name("due_month"));
		
		Select sel = new Select(dropDown);
		List<WebElement> options = sel.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			
			assertEquals(options.get(i).getText(),expectedOptions[i]);
			System.out.println("Successful");
			break;
	}

	}
}
