package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy2steps {
	WebDriver driver;
	@Before
	public void init() {
		driver = new ChromeDriver();
		PageFactory.initElements(driver,globalElement.class);
		
	}
	@After
	public void destroy() {
		driver.close();
	}
	@Given("url of testmeApp {string}")
	public void url_of_testmeApp(String string) {
	     //Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chpath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\cucumber\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chpath);
		// driver = new ChromeDriver();
		driver.get(string);
		//Assert.assertTrue(driver.getCurrentUrl().contains("Login"));
	}
	
	
	@When("enters {string} as username")
	public void enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		globalElement.username.sendKeys(string);
	}

	@When("enters {string} as password")
	public void enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		globalElement.password.sendKeys(string);
	}

	@Then("click on  login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}



}
