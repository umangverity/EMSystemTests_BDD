package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class Steps {
	
	WebDriver driver;
	
	@Given("^Headless browser is opened and Expense Manager app is launched$")
	public void headless_browser_is_opened_and_Expense_Manager_app_is_launched() throws Throwable {
		
		driver = new HtmlUnitDriver();
		driver.get("http://localhost:8089/ExpenseApp-1/login.jsp");	
	    
	}

	@When("^I Enter correct Username and Password$")
	public void i_Enter_correct_Username_and_Password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^it shows home page$")
	public void it_shows_home_page() throws Throwable {
				//Buggy Code
				//String expectedTitle = "Hello Page";
				
				//Correct Code
				String expectedTitle = "Home page";
				
				String actualTitle = driver.getTitle();
				assertEquals(expectedTitle, actualTitle);
		        System.out.println(actualTitle);
	}
	
	


}
