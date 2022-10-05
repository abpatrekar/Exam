package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
	}
	private static void loginTest() {
		// TODO Auto-generated method stub
		
	}
	public static void init() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\stuff\\\\Selenium1\\\\1st_Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("search")).sendKeys("food");
		driver.findElement(By.id("search-icon-legacy")).click();

	}
	public static void tearDown() {
		driver.close();

	}
	}
