package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateCategories {
	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1000);
		boolean textFound = false;  
		try {
		    driver.findElement(By.xpath("//*[contains(text(),'The category you want to add already exists:')]"));
		    textFound = true;
		    System.out.println("Already exists");
		} catch (Exception e) {
		    textFound = false;
		    System.out.println("Does not exist");
		}
	}
//works
}
