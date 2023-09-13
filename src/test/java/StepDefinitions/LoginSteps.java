package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("user enter userName and passWord")
	public void user_enter_user_name_and_pass_word() {
		System.out.println("enter uname and psw");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicks on login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("User on home page");
	}

}
