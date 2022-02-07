Feature: Contacts page


  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1



    Scenario: Menu options
      Given the user is on the login page
      And the user logged in as "sales manager"
      Then user should see following options
        | Dashboards         |
        | Fleet              |
        | Customers          |
        | Sales              |
        | Activities         |
        | Marketing          |
        | Reports & Segments |
        | System             |


  @wip
  Scenario: log in as a given user
    Given the user is on the login page
   When the user logs in using following credentials
     | firstName | John            |
     | lastName  | Doe             |
     | username  | salesmanager101 |
     | password  | UserUser123     |
    Then the user should be able to login