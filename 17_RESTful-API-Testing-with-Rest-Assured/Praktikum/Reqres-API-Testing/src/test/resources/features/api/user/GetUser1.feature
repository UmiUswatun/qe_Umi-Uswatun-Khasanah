@UpdateUser

Feature: Get User
  As a user
  I want to get single user
  So that I can read single user data

  Scenario: As a user I can get valid user data with valid API endpoint
    Given I set valid API endpoint for get user
    When I send request to get user
    Then I receive status code 200
    And I receive valid data for user

  Scenario: As a user I can not get valid user data with invalid API endpoint
    Given I set invalid API endpoint for get user
    When I send request to get user
    Then I receive status code 404