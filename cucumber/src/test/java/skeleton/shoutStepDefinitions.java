/*package skeleton;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shoutStepDefinitions {
	
	
	Person saun = new Person();
	
	@Given("saun is {int} meter away from lucia")
	public void saun_is_meter_away_from_lucia(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		saun.setDistance(int1);
	}

	@When("saun shouts {string}")
	public void saun_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		saun.setMessage(string);
	}

	@Then("lucia (listens|cannot listen) to the message")
	public void lucia_listens_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String message = saun.getMessage();
		Assert.assertEquals("free ",message);
	}

}*/
