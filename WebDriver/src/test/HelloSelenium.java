package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver","/home/dd19421998gmail/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.simplilearn.com/");
		
	}

}
