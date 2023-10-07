Feature: Delete user
  As a user
  I want to delete user data
  So that the user data can be removed

  Scenario: As a user I can delete user with valid API endpoint
    Given I set valid API endpoint for delete user
    When I send request to delete user
    Then I receive status code 200

  Scenario: As a user I can not delete user with invalid API endpoint
    Given I set invalid API endpoint for delete user
    When I send request to delete user
    Then I receive status code 404