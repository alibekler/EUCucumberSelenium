@navigate
Feature: Logged in user should be able to navigate to pages using top menu.
  once in the expected page, user should see correct page title.

  @vehiclesMod @smoke
  Scenario: Navigate to Fleet --> Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user should navigate to Fleet tab Vehicle module
    Then the title should be the same as module name

  @CampaignsMod @db @smoke
  Scenario: Navigate to Marketing --> Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing tab Campaigns module
    Then the title should be the same as module name

  @CalendarEventsMod  @smoke
  Scenario: Navigate to Activities --> Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities tab Calendar Events module
    Then the title should be the same as module name