import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class BufferStepDefinitions {
	
	private Buffer b;
	
	
	@Given("a Buffer from {string}")
	public void a_buffer_from(String string) {
		b = new Buffer(string);
	}

	@When("I append {string} to the Buffer")
	public void i_append_to_the_buffer(String string) {
	    b.append(string);
	}

	@Then("the Buffer contains {string}")
	public void the_buffer_contains(String string) {
	   assertEquals(b.toString(), string);
	}

}
