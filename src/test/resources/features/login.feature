Feature: feature to test login functionality

  Scenario: check login is successful with valid credentials
    Given user is on login page
    When user enter userName and passWord
    And clicks on login button
    Then user is navigated to the homepage
