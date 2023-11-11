@UpdateUser

Feature: Get User
  As a user
  I want to get single user
  So that I can read single user data

  Scenario: As a user I can get user data with valid credentials
    Given I set valid API endpoint for get user data
    When I send valid request to get user data
    Then I receive status code 200
    And I receive valid data for user data

  Scenario: As a user I cannot get user data with valid API and invalid method
    Given I set valid API endpoint for get user data
    When I send invalid request to get user data
    Then I receive status code 404

  Scenario: As a user I cannot get user data with invalid API and valid method
    Given I set invalid API endpoint for get user data
    When I send valid request to get user data 1
    Then I receive status code 404

  Scenario: As a user I cannot get user data with invalid API and invalid method
    Given I set invalid API endpoint for get user data
    When I send invalid request to get user data
    Then I receive status code 404