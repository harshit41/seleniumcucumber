/*package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	@Before
	public void init() {
		driver = new ChromeDriver();
		PageFactory.initElements(driver,LoginPage.class);
		
	}
	@After
	public void destroy() {
		driver.close();
	}
	
	
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	     //Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chpath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\cucumber\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chpath);
		// driver = new ChromeDriver();
		driver.get(string);
		//Assert.assertTrue(driver.getCurrentUrl().contains("Login"));
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//driver.findElement(By.id("Email")).sendKeys(string);
		LoginPage.email.sendKeys(string);
	}

	@When("uswe enters {string} as password")
	public void uswe_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		LoginPage.password.sendKeys(string);
		//driver.findElement(By.id("Password")).sendKeys(string);
	}

	@Then("user is  in webshop as {word}")
	public void user_is_in_webshop(String type) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		LoginPage.signin.click();
		//Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
		Assert.assertTrue(LoginPage.signout.isDisplayed());
	}
	
	    
	    @Given("Admin of the test me app enters")
	    public void admin_of_the_test_me_app_enters(io.cucumber.datatable.DataTable dataTable) {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	       // throw new cucumber.api.PendingException();
	    	List<List<String>> list =dataTable.asLists();
	    	for(List<String> strings:list) {
	    		for(String s:strings) {
	    			System.out.println(s+ "\t");
	    		}
	    		System.out.println("");
	    	}


	}
	

}*/
