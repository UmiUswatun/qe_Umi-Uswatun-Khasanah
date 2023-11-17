Feature: Logout
  As a user
  I want to logout
  So that I can out from the website

  Background:
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I clicks the login button
    Then I redirected to the product page

  Scenario: Logout
    Given I Click side navbar icon
    And I click Logout
    Then I Should be on Login Page