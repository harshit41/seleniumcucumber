package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy1 {
	WebDriver driver;
	//senerio1 user = new senerio1();
	
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chpath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\cucumber\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chpath);
		 driver = new ChromeDriver();
		driver.get(string);

	}
	
	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}


	@When("user enters {string} as firstname")
	public void user_enters_as_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("firstName")).sendKeys(string);	
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("pass_confirmation")).sendKeys(string);
		
	}

	@When("user click as gender")
	public void user_click_as_gender() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("gender")).click();
	}

	@When("user enters {string} as emailid")
	public void user_enters_as_emailid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("emailAddress")).sendKeys(string);
		
	}

	@When("user enters {string} as mobilenumber")
	public void user_enters_as_mobilenumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}


	@When("user enters {string} as dob")
	public void user_enters_as_dob(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@When("user click security question")
	public void user_click_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		Select sel = new Select(driver.findElement(By.id("securityQuestion")));
		sel.selectByIndex(0); 
		
	}
	@When("user answer {string} the question")
	public void user_answer_the_question(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("answer")).sendKeys(string);

	}	

	@Then("user is  rsgister as <type>")
	public void user_is_rsgister_as_type() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Submit")).click();
	}



}
