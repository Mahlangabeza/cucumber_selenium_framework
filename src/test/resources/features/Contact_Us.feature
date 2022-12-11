@contact-us @Regression
Feature: WebDriver University - Contact Us page

  Scenario: Validate successful submission - Unique date
    Given I access the WebDriver university contact us page
    When I enter a unique first name
    And I enter a unique last name
    And enter a valid email address
    And enter a unique comment
    And submit the form
    Then I should be presented with a thank you message

  @Smoke
  Scenario:  Validate successful submission - Specific data
    Given I access the WebDriver university contact us page
    When I enter a specific name Joe
    And I enter a specific last name Pancakes
    And I enter a specific email address JoePancakes@mail.com
    And I enter a specific comment "Hi, how are you?"
    And submit the form
    Then I should be presented with a thank you message
