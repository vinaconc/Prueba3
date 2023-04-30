import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Chrome.ChromeDriver;






import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

private WebDriver driver;



public class SeleniumTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "H:\\integracin continua\\chromedriver_win32");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost:8080/weblogin/")
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
