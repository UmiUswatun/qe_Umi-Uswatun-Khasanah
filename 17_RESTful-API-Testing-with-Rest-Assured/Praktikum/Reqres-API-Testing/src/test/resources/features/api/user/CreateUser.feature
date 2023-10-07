Feature: Create an user
As a user
I want to create a new user
So that the user data is saved

  Scenario: As a user I can create user data with valid input and valid API endpoint
    Given I set valid API endpoint for create user
    When I send request to create user with valid inputs
    Then I receive status code 201
    And I receive valid data for created user

  Scenario: As a user I can not create user data with valid input and invalid API endpoint
    Given I set invalid API endpoint for create user
    When I send request to create user with valid inputs
    Then I receive status code 404


  Scenario: As a user I can not create user data with invalid input and valid API endpoint
    Given I set valid API endpoint for create user
    When I send request to create user with invalid inputs
    Then I receive status code 500
    And I receive syntax error message

  Scenario: As a user I can not create user data with invalid input and invalid API endpoint
    Given I set invalid API endpoint for create user
    When I send request to create user with invalid inputs
    Then I receive status code 500
    And I receive syntax error message


