Feature: Get User
  As a user
  I want to get user
  So that i can get data for user

  Scenario: As a user i can get user data with valid URL
    Given I set valid API endpoint for get user data
    When I send valid request
    Then I receive status code 200
    And I get valid user data

  Scenario: As a user i can not get user data with invalid URL
    Given I set invalid API endpoint for get user data
    When I send invalid request
    Then I receive status code 404
    And I got an error message
