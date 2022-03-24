@contactsLogin
Feature: Contacts page

  Background:
    Given the user is on the login page


    @lol
  Scenario: Default page number
    And the user enters the driver information
    When the user navigates to "Customer" "Contacts"
    Then default page number should be 1
      #aremoved s from Customers to fail for taking screenshot




    Scenario: Menu options
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



  Scenario: log in as a given user
   When the user logs in using following credentials
     | firstName | John            |
     | lastName  | Doe             |
     | username  | salesmanager101 |
     | password  | UserUser123     |
    Then the user should be able to login

    @wip
    Scenario: Contacts test with email
      Given the user logged in as "sales manager"
      And the user navigates to "Customers" "Contacts"
      When the user clicks "mbrackstone9@example.com" from contacts
      Then the information should be the same as database information