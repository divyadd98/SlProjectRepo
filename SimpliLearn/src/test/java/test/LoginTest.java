package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver","/home/dd19421998gmail/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,  TimeUnit.MILLISECONDS);


}
	
    @Test
	public void method1() {
    	
        WebElement lnkLogin = driver.findElement(By.className("login"));
        
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(lnkLogin));
        
        lnkLogin.click();
        
        WebElement editUsername = driver.findElement(By.name("user_login"));
        
        editUsername.sendKeys("xyz@abc.com");
        
        WebElement editPWd = driver.findElement(By.name("user_pwd"));
        
        editPWd.sendKeys("1234245");
        
        WebElement btnLogin = driver.findElement(By.name("btn_login"));
        
        
        btnLogin.click();
        
        WebElement error = driver.findElement(By.id("msg_box"));
        
      String actMsg = error.getText();
      String expMsg = "The email or password you have entered is invalid.";
      
      Assert.assertEquals(actMsg, expMsg);
      
      SoftAssert assetobj = new SoftAssert();
      
      assetobj.assertEquals(actMsg,  expMsg);
      System.out.println("After Assertion");
      
      assetobj.assertAll();

	}

    @AfterTest
	public void teardown() {

    	driver.quit();
	}

	
	
	
}
