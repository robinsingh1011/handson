package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class steps {
String username;
String password;
	
	WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost8083/TestMeApp");
		driver.manage().window().maximize();
		
	
	
		driver.findElement(By.id("SignIn")).click();
	}
    @When("User is on login page")
    public void user_is_on_login_page()
    {
    	
    }
    @When("User enter {string} and {string}")
    public void user_enter_and(String username,String password)
    {
    	driver.findElement(By.id("username")).sendKeys(username);
    	driver.findElement(By.id("password")).sendKeys(password);
    	driver.findElement(By.id("Login")).click();
    }
    
    @Then("User should successfully login")
    public void user_should_successfully_login()
    { 
    	Assert.assertTrue(driver.findElement(By.id("SignOut")).isDisplayed());
    	
    }
    @Given("user successfully login")
    public void user_successfully_login()
    {
    	
    }
    @When("User have to select the category")
    public void user_have_to_select_the_category()
    {
    	driver.findElement(By.linkText("All_Category")).click();
    }
    @When("user will select {string} and {string}")
    public void user_will_select_and(String category,String subcategory)
    {
    	driver.findElement(By.name(category)).click();
    	driver.findElement(By.name(subcategory)).click();
    }
    @Then("user successfully and the product")
    public void usre_successfully_add_the_product()
    {
    }
}
