Feature: As a customer I want to Login to Amazon website to buy a product
  Scenario Outline: Login with valid credentials
    Given User is on homePage
    When User clicks on menu Button
    And  User selects sign in from dropdown menu
    And  user is on login page
    Then user enters valid "<email>"
    Then user clicks on continue button
    And User has logged in successfully
    Examples:
    |email|
    |  npjadav@hotmail.com   |