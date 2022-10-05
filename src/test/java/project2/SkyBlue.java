package project2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class SkyBlue {

public static void main(String[] args) throws InterruptedException  {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/test/101/");
	;
	driver.findElement(By.cssSelector("#extra > button:nth-child(12)")).click();
	Thread.sleep(2000);
	WebElement B= driver.findElement(By.cssSelector("body"));
	String color=B.getCssValue("background-color");
	System.out.println(color);
	String hexcolor=Color.fromString(color).asHex();
	
	if(hexcolor.equals("#87ceeb"))
		System.out.println("It is Sky blue");
	else
		System.out.println("Not Sky Blue");
}
}