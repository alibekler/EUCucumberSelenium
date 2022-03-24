package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.DBUtils;
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


    @When("the user clicks {string} from contacts")
    public void the_user_clicks_from_contacts(String string) {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitFor(4);
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.getContactEmail(string).click();
    }

    @Then("the information should be the same as database information")
    public void the_information_should_be_the_same_as_database_information() {

        BrowserUtils.waitFor(3);
        //get info from UI
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualFullnane = contactInfoPage.contactFullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhone = contactInfoPage.phone.getText();


        System.out.println(actualFullnane);
        System.out.println(actualEmail);
        System.out.println(actualPhone);

        //get info from DB
        BrowserUtils.waitFor(2);
        DBUtils.createConnection();
        String query ="select concat(first_name, ' ', last_name) as \"full_name\", e.email, phone \n" +
        "from orocrm_contact c join orocrm_contact_email e\n" +
        "on c.id = e.owner id join orocrm_contact_phone p\n" +
        "on e.owner id = p.owner id\n"+
        "where e.email='mbrackstone9@example.com'";
        Map<String, Object> map = DBUtils.getRowMap(query);

        String expectedFullName = (String) map.get("full_name");
        String expectedPhone = (String) map.get("phone");
        String expectedEmail = (String) map.get("email");

        System.out.println(expectedFullName);
        System.out.println(expectedPhone);
        System.out.println(expectedEmail);
        DBUtils.destroy();

        //assertion

    }
}
