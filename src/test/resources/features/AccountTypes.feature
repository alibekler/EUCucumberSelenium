Feature: Account types


  Scenario Outline: Different user types
    When the user is on the login page
    Given the user logged in as "<userType>"
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | admin         |
      | sales manager |

  @wip
  Scenario: driver user
    Given   the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

  @wip
  Scenario: sales manager user
    Given   the user logged in as "sales manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Accounts - CustomerS"

  @wip
  Scenario: store manager user
    Given   the user logged in as "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"


  Scenario Outline: login with different accounts
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" "<module>"
    Then the title contains "<title>"
    Examples:
      | userType      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |

