Feature: Login as different users
  @login
  Scenario: login as a driver
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"