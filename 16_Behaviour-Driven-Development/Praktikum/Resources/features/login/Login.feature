Feature: Login
  As a user i can login
  I want to login
  So that i can accsess dashboard page


  Scenario: As a User i can login with valid credentials
    Given I am on the login page
    When I enter valid email
    And I enter valid password
    And I click login button
    Then I redirected to the dashboard page

  Scenario: As a User I can't login with invalid credentials
    Given I am on the login page
    When I enter invalid email
    And I enter invalid password
    And I click login button
    Then I got an error message
    And I can not redirected to the dashboard page