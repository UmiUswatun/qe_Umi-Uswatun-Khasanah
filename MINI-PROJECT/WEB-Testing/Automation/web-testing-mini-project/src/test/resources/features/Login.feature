Feature: Login
  As a user
  I want to login
  So that i can logged in

  Background:
    Given I am on the login page

  Scenario: As a user i can login with valid credentials
    When I enter valid email
    And I enter valid password
    And I clicks the login button
    Then I redirected to the product page

  Scenario: As a user i cannot login with invalid credentials
    When I enter invalid email
    And I enter invalid password
    And I clicks the login button
    Then I see an error message "record not found"

  Scenario: As a user i cannot login with blank fields
    When I leaving email fields blank
    And I leaving password fields blank
    And I clicks the login button
    Then I see an error message 1 "email is required"