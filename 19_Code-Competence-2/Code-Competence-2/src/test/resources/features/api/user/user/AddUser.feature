Feature: Add User
  As a user
  I want Add new user
  So that i can add new user

  Scenario:  As a user i can add new user for with valid API and valid input
    Given I set valid API endpoint for add new user
    When I send request for add new user with valid input
    Then I receive status code 200
    And I can add new user

  Scenario:  As a user i can not add user with valid API and invalid input
    Given I set valid API endpoint for add new user
    When I send request for add new user with invalid input
    Then I receive status code 404 for add user data
    And I got an error message

  Scenario:  As a user i can not add user with invalid API and valid input
    Given I set invalid API endpoint for add new user
    When I send request for add new user with valid input
    Then I receive status code 404 for add user data
    And I got an error message

  Scenario:  As a user i can not add user with invalid API and invalid input
    Given I set invalid API endpoint for add new user
    When I send request for add new user with invalid input
    Then I receive status code 404 for add user data
    And I got an error message