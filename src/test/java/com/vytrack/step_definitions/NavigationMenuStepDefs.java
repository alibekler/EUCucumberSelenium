package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("the user navigates to {string} {string}")
    public void theUserNavigatesTo(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void defaultPageNumberShouldBe(int expectedPageNum) {
        BrowserUtils.waitFor(3);
        ContactsPage  contactsPage = new ContactsPage();
        int actualPageNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(actualPageNumber, expectedPageNum);
    }
}
