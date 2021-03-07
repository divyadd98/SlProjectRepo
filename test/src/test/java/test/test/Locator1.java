package test.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","/home/dd19421998gmail/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,  TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.linkText("Log in"));
        element.click();
        
        WebElement userid = driver.findElement(By.cssSelector("input.email"));
        userid.sendKeys("abc@xyz.com");
        WebElement pwd = driver.findElement(By.cssSelector("input#password"));
        pwd.sendKeys("1234");

        WebElement button = driver.findElement(By.cssSelector("input[name=btn_login]"));
        button.click();
        
		
		
		
		
	}

}
