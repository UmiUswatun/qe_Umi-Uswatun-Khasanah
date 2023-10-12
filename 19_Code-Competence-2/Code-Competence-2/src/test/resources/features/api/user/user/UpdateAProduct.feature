Feature: Update user data
  As a user
  I want update user data
  So that i can update user data

  Scenario:  As a user i can update user data with valid API and valid input
    Given I set valid API endpoint for update user data
    When I send request for update user data with valid input
    Then I receive status code 200
    And I can update user data

  Scenario:  As a user i can not update user data with valid API and invalid input
    Given I set valid API endpoint for update user data
    When I send request for update user data with invalid input
    Then I receive status code 404 for update user data
    And I got an error message

  Scenario:  As a user i can not update user data with invalid API and valid input
    Given I set invalid API endpoint for update user data
    When I send request for update user data with valid input
    Then I receive status code 404 for update user data
    And I got an error message

  Scenario:  As a user i can not update user data with invalid API and invalid input
    Given I set invalid API endpoint for update user data
    When I send request for update user data with invalid input
    Then I receive status code 404 for update user data
    And I got an error message