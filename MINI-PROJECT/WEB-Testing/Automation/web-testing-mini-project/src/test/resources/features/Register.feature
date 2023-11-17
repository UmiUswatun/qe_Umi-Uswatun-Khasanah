@register
Feature: Registration
  As a user
  I want to register
  So that i redirected to login page

  Background:
    Given I am on the login page
    When I click register icon
    Given I am on the registration page

  Scenario: As a user i can registration with valid input
    When I enters valid credentials
    And I clicks the register button
    Then I redirected to the login page

  Scenario: As a user i cannot registration with registered email
    When I enter registered email
    And I clicks the register button
    Then I see an error message


  Scenario: As a user i cannot registration with empty fields
    When I leaving fields blank
    And I clicks the register button
    Then I see an error message 1

