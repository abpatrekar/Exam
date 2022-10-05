package project2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.runtime.junit.Assertions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoveAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		driver.findElement(By.cssSelector("body > div.controls > input[type=checkbox]:nth-child(3)")).click();
		driver.findElement(By.cssSelector("body > div.controls > input[type=submit]:nth-child(1)")).click();
		boolean textFound = false;  
		try {
		    driver.findElement(By.xpath("\"//*[@id=\\\"todos-content\\\"]/form/ul/li/input\")]"));
		    textFound = true;
		    System.out.println("Remove all does not work");
		} catch (Exception e) {
		    textFound = false;
		    System.out.println("Remove all works");
	}
		//works
}
}
