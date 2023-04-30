package SeleniumTest;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class TestLogin3 {
	

	private WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  WebElement TextRut = driver.findElement(By.name("Rut"));
	  WebElement TextUserName = driver.findElement(By.name("username"));
	  
	  TextRut.sendKeys("");
	  TextUserName.sendKeys("");
	  
	  driver.findElement(By.name("password")).sendKeys("");
	  
	  driver.findElement(By.name("signin")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  String elementval = driver.findElement(By.name("Rut")).getAttribute("value");
	  String elementval2 = driver.findElement(By.name("username")).getAttribute("value");
	  String elementval3 = driver.findElement(By.name("password")).getAttribute("value");
	  
	  assertEquals("", elementval);
	  assertEquals("", elementval2);
	  assertEquals("", elementval3);
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "H:\\integracin continua\\chromedriver_win32\\chromedriver.exe");
	  

	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("http://localhost:8080/weblogin/");
	  
	  
  
}
  @AfterTest
  public void afterTest() {
	driver.quit();
  }

}
