package com.step;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	int a;
	int b;
	int sum;
	
	@Given("both numbers are {int} and {int}")
	public void both_numbers_are_and(int int1, int int2) {
		a = int1;
		b = int2;
	}

	@When("I added both numbers")
	public void i_added_both_numbers() {
		sum = a + b;
	}

	@Then("I verify result is {int}")
	public void i_verify_result_is(int int1) {
		Assert.assertEquals(sum, int1);
	}

}
