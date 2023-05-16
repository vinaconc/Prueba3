package SeleniumTestClinica;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class TestRegistroClinica {
	

	private WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  WebElement idMascota = driver.findElement(By.name("idMascota"));
	  WebElement nombreMascota = driver.findElement(By.name("nombreMascota"));
	  WebElement rutDuenno = driver.findElement(By.name("rutDuenno"));
	  idMascota.sendKeys("124");
	  nombreMascota.sendKeys("Simona");
	  rutDuenno.sendKeys("127163812");
	  
	 
	  
	  driver.findElement(By.name("Reg")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("document.title = 'Clinica';");

	  
	  assertEquals("Clinica", driver.getTitle());
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "H:\\integracin continua\\chromedriver_win32\\chromedriver.exe");
	  

	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("http://localhost:8080/weblogin/registrar.jsp");
	  
	  
  
}
  @AfterTest
  public void afterTest() {

	driver.quit();
  }

}
