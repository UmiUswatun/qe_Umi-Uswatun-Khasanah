Feature: Login
  As a user
  I want to login
  So that I can access products page

  Background:
    Given I am on the login page
    And I click login button

  Scenario: As a user I can login with valid credentials
    When I input valid username
    And I input valid password
    Then I am on the products page

  Scenario: As a user I cannot login with invalid password
    When I input valid username
    And I input invalid password
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: As a user I cannot login with invalid username
    When I input invalid username
    And I input valid password
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: As a locked user I cannot access products page
    When I input locked username
    And I input valid password
    Then I can see error message "Epic sadface: Sorry, this user has been locked out."

  Scenario: As a locked user I cannot access products page with invalid password
    When I input locked username
    And I input invalid password
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: As a user I cannot login with invalid credentials
    When I input invalid username
    And I input invalid password
    Then I can see error message "Epic sadface: Username and password do not match any user in this service"