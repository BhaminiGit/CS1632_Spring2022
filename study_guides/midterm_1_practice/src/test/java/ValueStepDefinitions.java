import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	private Value v;
	private int ans;
	
	@Given("a Value")
	public void aValue() {
		v = new Value();
	}
	
	@When("I get the value")
	public void iGetValue() {
		ans = v.getVal();
	}
	
	@When("I increase the value")
	public void iIncreaseValue(){
		v.incVal();
	}
	
	
	@Then("the value is {int}")
	public void theValueIs(int val) {
		assertEquals(v.getVal(), val);
		
	}
}
