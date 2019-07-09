/*package skeleton;

import java.sql.Driver;
import java.sql.DriverAction;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	//LOGIN1 log = new LOGIN1();
	WebDriver driver;
	
	
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	     //Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chpath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\cucumber\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chpath);
		 driver = new ChromeDriver();
		driver.get(string);
		//Assert.assertTrue(driver.getCurrentUrl().contains("Login"));
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("Email")).sendKeys(string);
		
	}

	@When("uswe enters {string} as password")
	public void uswe_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("Password")).sendKeys(string);
	}

	@Then("user is  in webshop")
	public void user_is_in_webshop() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());



}
}*/
