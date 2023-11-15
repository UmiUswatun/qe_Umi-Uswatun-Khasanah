Feature: User Login
  As a user
  I want to login
  So that i am on the dashboard page

  Scenario:  As a user i can get the token for login with valid API and valid input
    Given I set valid API endpoint
    When I send request with valid input
    Then I receive status code 200
    And I get the token for login

  Scenario:  As a user i can not get the token for login with valid API and invalid input
    Given I set valid API endpoint
    When I send request with invalid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not get the token for login with invalid API and valid input
    Given I set invalid API endpoint
    When I send request with valid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not get the token for login with invalid API and invalid input
    Given I set invalid API endpoint
    When I send request with invalid input
    Then I receive status code 404
    And I got an error message

