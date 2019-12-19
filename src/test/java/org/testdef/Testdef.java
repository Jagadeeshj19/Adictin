package org.testdef;

import org.base.BaseClass;
import org.login.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testdef extends BaseClass {
	@Given("to validate log in page")
	public void to_validate_log_in_page() {
		launch("http://adactin.com/HotelApp/");
	    
	}
	
Login ln=new Login();
	@When("validate the user name and password")
	public void validate_the_user_name_and_password() {
		type(ln.getUser(), "Jagadeeshwarans");
		type(ln.getPass(), "9123530292");
	    
	}

	@When("click login button")
	public void click_login_button() {
		click(ln.getButton());
	   
	}

	@Then("to book the rooms")
	public void to_book_the_rooms() {
	
	}


}
