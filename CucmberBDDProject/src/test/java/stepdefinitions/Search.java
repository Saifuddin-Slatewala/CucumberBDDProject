package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("user open the application")
	public void user_open_the_application() {
	    System.out.println("user opens the application");
	}
	@When("user enter valid product name in search field")
	public void user_enter_valid_product_name_in_search_field() {
	   System.out.println("user searches a valid product");
	}
	@When("user click on search button")
	public void user_click_on_search_button() {
		System.out.println("user clicked on search button");
	    
	}
	@Then("Valid product details should be shown in search results")
	public void valid_product_details_should_be_shown_in_search_results() {
	    System.out.println("valid products are shown in serach results");
	}
	@When("user enter invalid product name in search field")
	public void user_enter_invalid_product_in_search_field() {
	    System.out.println("user entered invalid product name");
	}
	@When("user enter nothing in search field")
	public void user_enter_nothing_in_search_field() {
		System.out.println("user entered nothing in search field");
	}
	@Then("proper error message should be shown")
	public void proper_error_message_should_be_shown() {
	    System.out.println("Error message is shown");

}
	
	
}