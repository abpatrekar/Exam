package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class ToggleAll {
	

	public static void main(String[] args) throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		driver.findElement(By.cssSelector("body > div.controls > input[type=checkbox]:nth-child(3)")).click();
		List<WebElement> checklist = driver.findElements(By.xpath("//*[@id=\"todos-content\"]/form/ul/li/input"));
		WebElement checkbox = driver.findElement(By.name("allbox"));
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
}{ //works
}{
	}{
}
}

