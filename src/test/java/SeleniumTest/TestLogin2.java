package SeleniumTest;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class TestLogin2 {
	

	private WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  
	  WebElement TextRut = driver.findElement(By.name("Rut"));
	  WebElement TextUserName = driver.findElement(By.name("username"));
	  
	  TextRut.sendKeys("127163812");
	  TextUserName.sendKeys("admin");
	  
	  driver.findElement(By.name("password")).sendKeys("12345");
	  
	  driver.findElement(By.name("signin")).click();
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  try {
		assertEquals("Bienvenido", driver.getTitle());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
