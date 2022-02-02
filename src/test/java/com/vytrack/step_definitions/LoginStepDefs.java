package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I open the browser to navigate to vytrack login page");
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I put the user credentials");    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I verify that title changed to dashboard");    }


    @When("the user enters the store manager information")
    public void theUserEntersTheStoreManagerInformation() {
        System.out.println("i verify that The store manager logged in successfully");
    }

    @When("the user enters the sales manager information")
    public void theUserEntersTheSalesManagerInformation() {
        System.out.println("i put the user credentials of sales manager");
    }

    @When("the user enters the head manager information")
    public void theUserEntersTheHeadManagerInformation() {
        System.out.println("I enter head manager credentials");
    }
}
