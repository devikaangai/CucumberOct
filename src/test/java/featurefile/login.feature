Feature: login with id and password
  Scenario: login
    Given user is on login page
    When user enters id and password
    And click on login button
    Then user should logged on