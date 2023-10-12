Feature: Get new cart
  As a user
  I want to get cart data
  So that i can get cart data

  Scenario: As a user i can get cart data with valid URL
    Given I set valid API endpoint for get cart data
    When I send valid request
    Then I receive status code 200
    And I get valid cart data

  Scenario: As a user i can not get cart data with invalid URL
    Given I set invalid API endpoint for get cart data
    When I send invalid request
    Then I receive status code 404
    And I got an error message
