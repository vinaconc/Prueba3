package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;

public class StepsClinic {
	
	WebDriver driver;
	
	 @Given("Abrir Chrome") 
	   public void goToLocalhost() { 
		 
		  System.setProperty("webdriver.chrome.driver", "H:\\integracin continua\\chromedriver_win32\\chromedriver.exe");

	      driver = new ChromeDriver(); 
	      driver.manage().window().maximize();
	      driver.get("http://localhost:8080/weblogin/registrar.jsp"); 
	   } 
		
	   @When("Ingresa idMascota as {int}, nMascota as {String} y rutDuenno as {int}") 
	   public void ingreseagenda(int arg1, String arg2, int arg3) {
	      driver.findElement(By.id("idMascota")).sendKeys(String.valueOf(arg1));
	      driver.findElement(By.id("username")).sendKeys(arg2);
	      driver.findElement(By.id("password")).sendKeys(String.valueOf(arg3));
	      driver.findElement(By.id("Reg")).click(); 
	   } 
		
	   @Then("Agenda hora") 
	  
	   public void validatelogin() { 
			  assertEquals("Bienvenido", driver.getTitle());

	      driver.close(); 
	   } 
	   
}
