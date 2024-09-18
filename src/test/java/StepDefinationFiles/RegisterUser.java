package StepDefinationFiles;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUser {
	WebDriver driver;
	Boolean Adminlogo;
	
	@Given("Chrome Browser should be available")
	public void chrome_browser_should_be_available() {
		System.out.println("Chrome Browser available");
	}

	@When("Open chrome Browser")
	public void open_chrome_browser() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();

	}

	@When("Enter Valid URL {string}")
	public void enter_valid_url(String string) {
	    driver.get(string);
	}

	@When("Redirect to the Homepage")
	public void redirect_to_the_homepage() {
	    // Get the page title
	    String HomepageTitle = driver.getTitle();
	    
	    // Print the title for debugging
	    System.out.println(HomepageTitle);
	    
	    // Assert that the homepage title is as expected
	    Assert.assertEquals(HomepageTitle, "Automation Exercise", "Page title does not match!");
	}

	
	@Then("Logo should be displayed")
	public void logo_should_be_displayed() throws InterruptedException {
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//div[@class='logo pull-left']"));
		Adminlogo=logo.isDisplayed();
		
	    
	}


}
