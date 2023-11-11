Feature: Update user
  As a user
  I want to update user data
  So that the user data is updated

  Scenario: As a user I can update user data with valid input and valid API endpoint
    Given I set valid API endpoint for update user
    When I send request to update user with valid inputs
    Then I receive status code 200
    And I receive valid data for update user

  Scenario: As a user I can not update user data with valid input and invalid API endpoint
    Given I set invalid API endpoint for update user
    When I send request to update user with valid inputs 1
    Then I receive status code 404

  Scenario: As a user I can not update user data with invalid input and valid API endpoint
    Given I set valid API endpoint for update user
    When I send request to update user with invalid inputs 2
    Then I receive status code 200
    And I receive id for update user

  Scenario: As a user I can not update user data with invalid input and invalid API endpoint
    Given I set invalid API endpoint for update user
    When I send request to update user with invalid inputs
    Then I receive status code 404


