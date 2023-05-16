package stepDefinition;



import static org.testng.Assert.assertEquals;



import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	 @Given("Abrir Chrome") 
	   public void goToLocalhost() { 
		 
		  System.setProperty("webdriver.chrome.driver", "H:\\integracin continua\\chromedriver_win32\\chromedriver.exe");

	      driver = new ChromeDriver(); 
	      driver.manage().window().maximize();
	      driver.get("http://localhost:8080/weblogin/"); 
	   } 
		
	   @When("Ingresa Rut as {string}, username as {string} y password as {string}") 
	   public void ingresecredenciales(String arg1, String arg2, String arg3) {
	      driver.findElement(By.id("Rut")).sendKeys(arg1);
	      driver.findElement(By.id("username")).sendKeys(arg2);
	      driver.findElement(By.id("password")).sendKeys(arg3);
	      driver.findElement(By.id("Reg")).click(); 
	   } 
		
	   @Then("Inicia Sesión") 
	  
	   public void validatelogin() { 
			  assertEquals("Bienvenido", driver.getTitle());

	      driver.close(); 
	   } 
	   @Then("Valida vacíos") 
		  
	   public void validaVacios() { 
		   
		 
		   WebElement TextRut = driver.findElement(By.name("Rut"));
			  WebElement TextUserName = driver.findElement(By.name("username"));
			  
			  TextRut.sendKeys("");
			  TextUserName.sendKeys("");
			  
			  driver.findElement(By.name("password")).sendKeys("");
			  
			  
			  
			  String elementval = driver.findElement(By.name("Rut")).getAttribute("value");
			  String elementval2 = driver.findElement(By.name("username")).getAttribute("value");
			  String elementval3 = driver.findElement(By.name("password")).getAttribute("value");
			  
			  assertEquals("", elementval);
			  assertEquals("", elementval2);
			  assertEquals("", elementval3);
			  
	   }
	   
}
