package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
       String username = ConfigurationReader.get("driver_username");
       String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
       String title = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", title);
    }


    @When("the user enters the store manager information")
    public void theUserEntersTheStoreManagerInformation() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @When("the user enters the sales manager information")
    public void theUserEntersTheSalesManagerInformation() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);


    }

    @When("the user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String arg0, String arg1) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(arg0, arg1);
    }

    @And("the title contains {string}")
    public void theTitleContains(String arg0) {

        Assert.assertTrue(Driver.get().getTitle().contains(arg0));
    }
}
