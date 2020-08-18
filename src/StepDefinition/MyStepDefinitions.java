package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on Learning test page$")
    public void user_is_on_learning_test_page() throws Throwable {
        throw new PendingException();
    }

    @When("^User login into application with username,password and Name$")
    public void user_login_into_application_with_usernamepassword_and_name() throws Throwable {
        throw new PendingException();
    }

    @Then("^When I click the Submit button$")
    public void when_i_click_the_submit_button() throws Throwable {
        throw new PendingException();
    }

    @And("^All informations are displayed$")
    public void all_informations_are_displayed() throws Throwable {
        throw new PendingException();
    }

}