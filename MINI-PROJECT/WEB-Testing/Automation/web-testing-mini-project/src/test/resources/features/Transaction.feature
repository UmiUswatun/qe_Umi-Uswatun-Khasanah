Feature: Transaction
  As a user
  I want to see my transaction history
  So that i can see my transaction history

  Background:
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I clicks the login button
    Then I redirected to the product page

  Scenario: As a user i can see Transaction history
    Given I Click side navbar icon
    And I click Transaction button
    Then I Should be on transaction Page



