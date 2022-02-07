package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ContactStepDefs {


    @Then("user should see following options")
    public void user_should_see_following_options(Map<String, String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(dataTable.size());
        System.out.println(dataTable);

        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals("verify that those tables are correct", actualOptions, dataTable);

    }

    @When("the user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String, String> userInfo) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(userInfo.get("username"), userInfo.get("password"));

        DashboardPage dashboardPage = new DashboardPage();
        String actualFullName = dashboardPage.getUserName();
        String expectedName = userInfo.get("firstName") + " " + userInfo.get("lastName");

        Assert.assertEquals("", expectedName, actualFullName);

    }
}
