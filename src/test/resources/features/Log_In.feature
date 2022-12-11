@Login @Regression
Feature: Login to the webdriver university page

  Background:
    Given I have visited the webdriver university login page

 @Login1
  Scenario: Login with valid credentials
    When I enter webdriver into the username text box
    And I enter webdriver123 into the password text box
    And I click on the Login button
    Then an alert text box with "validation succeeded" should be displayed

  Scenario: Login with invalid credentials
    When I enter webdriver into the username text box
    And I enter Martin into the password text box
    And I click on the Login button
    Then an alert text box with "validation failed" should be displayed

  @Smoke
  Scenario Outline: Login with valid credentials & invalid credentials
    When I enter a username <username>
    And I enter a password <password>
    And I click on the Login button
    Then I should be presented with the following validation message <validationMessage>

    Examples:
    | username | password |  validationMessage |
    | webdriver| webdriver123 | validation succeeded |
    | webdriver| webdriver1   | validation failed    |
    | Martin   | password123  | validation failed |