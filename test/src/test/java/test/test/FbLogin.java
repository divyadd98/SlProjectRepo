package test.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/dd19421998gmail/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,  TimeUnit.MILLISECONDS);
		
		WebElement pwd = driver.findElement(By.xpath("input[@type='password']"));
		pwd.sendKeys("1234");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select ddMonth = new Select(month);
		ddMonth.selectByValue("1");
		
		ddMonth.selectByVisibleText("Jan");

		ddMonth.selectByIndex(0);

	}

}
