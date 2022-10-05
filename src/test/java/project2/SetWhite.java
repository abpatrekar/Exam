package project2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class SetWhite {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuff\\Selenium1\\crm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		;
		driver.findElement(By.cssSelector("#extra > button:nth-child(13)")).click();
		Thread.sleep(2000);
		WebElement B= driver.findElement(By.cssSelector("body"));
		String color=B.getCssValue("background-color");
		String hexcolor=Color.fromString(color).asHex();
		if(hexcolor.equals("#ffffff"))
			System.out.println("It is White");
		else
			System.out.println("Not White");
	}
	}