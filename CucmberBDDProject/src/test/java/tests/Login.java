package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	// Tags in Runner Class and Tagged Hooks don't go together
	//Using tagged hooks for Login
	@Before("@Login")
	public void open() {
		System.out.println("Browser got Open");
	}
	
	// Tags in Runner Class and Tagged Hooks don't go together
	//Using tagged hooks for Login
	@After("@Login")
	public void close() {
		System.out.println("Browser got Closed");
	}
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	    System.out.println(">> User navigates to Login Page");
	}

	  @When("^User enters valid email address (.+)$")
	    public void user_enters_valid_email_address(String email) {
		  System.out.println(">> User has enetered email address"+email);
	    }

	    @When("^User enters valid password (.+)$")
	    public void user_enters_valid_password(String password) {
	    	System.out.println(">> User has enetered password"+password);
	    }

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    System.out.println(">> user clicks on Login button");
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    System.out.println(">> User gets successfully Logged In");
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String passwordText) {
	    System.out.println(">> User enters invalid password"+passwordText);
	}

	@Then("User should not be logged in and display an error message")
	public void user_should_not_be_logged_in_and_display_an_error_message() {
	    System.out.println(">> User couldnt log in");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String emailText) {
	    System.out.println(">> User entered invalid email address"+emailText);
	}

	@When("User enters no email address")
	public void user_enters_no_email_address() {
	    System.out.println(">> user didnt entered email address");
	}

	@When("User enters no password")
	public void user_enters_no_password() {
	    System.out.println(">> user didnt entered password");
	}
	
	
	
}

