package stepdefinitions;


import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("^User is on registration page$")
	public void User_is_on_registration_page() {
		System.out.println(">> User navigats on registration page");
	}
	
	@When("User enters below details")
	public void User_enters_below_details(DataTable dataTable) {
		
		Map<String, String> map =  dataTable.asMap(String.class,String.class);
		
		System.out.println("User entered firstname as"+ map.get("firstname"));
		System.out.println("User entered lastname as"+ map.get("lastname"));
		System.out.println("User entered email address as"+ map.get("emailaddress"));
		System.out.println("User entered telephone as"+ map.get("telephone"));
		System.out.println("User entered password as"+ map.get("password"));
		System.out.println("User entered confirm password as"+ map.get("confirmpassword"));
	}
	/*
	 * @When("user enters firstname {string} in firstname field") public void
	 * user_enters_firstname_in_firstname_field(String firstName) {
	 * System.out.println("user entered firstname " + firstName +
	 * " in firstname field"); }
	 * 
	 * @When("user enters lastname {string} in lastname field") public void
	 * user_enters_lastname_in_lastname_field(String lastName) {
	 * System.out.println("user entered lastname " + lastName +
	 * " in lastname field");
	 * 
	 * }
	 * 
	 * @When("user enters email address {string} in email address field") public
	 * void user_enters_email_address_in_email_address_field(String email) {
	 * System.out.println("user entered email " + email + " in email field");
	 * 
	 * }
	 * 
	 * @When("user enters telephone {string} in telephone field") public void
	 * user_enters_telephone_in_telephone_field(String telephone) {
	 * System.out.println("user entered telephone " + telephone +
	 * " in telephone field"); }
	 * 
	 * @When("user enters password  {string} in password field") public void
	 * user_enters_password_in_password_field(String password) {
	 * System.out.println("user entered password " + password +
	 * " in password field"); }
	 * 
	 * @When("user enters password confirm {string} in confirm password field")
	 * public void user_enters_password_confirm_in_confirm_password_field(String
	 * confirmPassword) { System.out.println("user entered confirm password " +
	 * confirmPassword + " in confirm password field"); }
	 */

	@When("user select on privacy field")
	public void user_select_on_privacy_field() {
	    System.out.println("User select on privacy field");
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		System.out.println("User clicked on continue button");
	}

	@Then("user account should be created successfully")
	public void user_account_should_be_created_successfully() {
	    System.out.println("User got Registered");
	}

	@When("user select newsletter option")
	public void user_select_newsletter_option() {
	    System.out.println("user selected newsletter option");
	}

	@When("user enters nothing in firstname field")
	public void user_enters_nothing_in_firstname_field() {
	    System.out.println("user didnt entered firstname");
	}

	@When("user enters nothing  in lastname field")
	public void user_enters_nothing_in_lastname_field() {
		System.out.println("user didnt entered lastname");
	}

	@When("user enters  nothing in email address field")
	public void user_enters_nothing_in_email_address_field() {
		System.out.println("user didnt entered email");
	}

	@When("user enters nothing in telephone field")
	public void user_enters_nothing_in_telephone_field() {
		System.out.println("user didnt entered telephone");
	}

	@When("user enters nothing in password field")
	public void user_enters_nothing_in_password_field() {
		System.out.println("user didnt entered password");
	}

	@When("user enters nothing in confirm password field")
	public void user_enters_nothing_in_confirm_password_field() {
		System.out.println("user didnt entered password confirm");
	}

	@When("user dont select privacy field")
	public void user_dont_select_on_privacy_field() {
	    System.out.println("user didnt select");
	}
	
	@When("user select privacy field")
	public void user_select_privacy_field() {
	    System.out.println("user selected privacy field");
	}

	

	@Then("user account should not be created successfully and an error messages should be displayed for all fields")
	public void user_account_should_not_be_created_successfully_and_an_error_messages_should_be_displayed_for_all_fields() {
		System.out.println("user not registered and error message for all fields displayed");
	}

	@Then("user account should not be created successfully and an error messages should be displayed")
	public void user_account_should_not_be_created_successfully_and_an_error_messages_should_be_displayed() {
	   System.out.println("user not registered with duplicate email error message");
	}

}
