package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @When("the user should navigate to Fleet tab Vehicle module")
    public void the_user_should_navigate_to_Fleet_tab_Vehicle_module() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to Vehicle module");    }

    @Then("the title should be the same as module name")
    public void the_title_should_be_the_same_as_module_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I verify that the Title name and module name are matching");    }

    @When("the user navigates to Marketing tab Campaigns module")
    public void theUserNavigatesToMarketingTabCampaignsModule() {
        System.out.println("I navigate to Campaigns module");
    }

    @When("the user navigates to Activities tab Calendar Events module")
    public void theUserNavigatesToActivitiesTabCalendarEventsModule() {
        System.out.println("I verify navigate to Calendar Events module");
    }
}
