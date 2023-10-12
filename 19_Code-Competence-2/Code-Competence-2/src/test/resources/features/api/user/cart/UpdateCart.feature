
Feature: Update cart
  As a user
  I want update cart
  So that i can update cart

  Scenario:  As a user i can update cart data with valid API and valid input
    Given I set valid API endpoint for update cart data
    When I send request for update cart data with valid input
    Then I receive status code 200
    And I can update cart data

  Scenario:  As a user i can not update cart data with valid API and invalid input
    Given I set valid API endpoint for update cart data
    When I send request for update cart data with invalid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not update cart data with invalid API and valid input
    Given I set invalid API endpoint for update cart data
    When I send request for update cart data with valid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not update cart data with invalid API and invalid input
    Given I set invalid API endpoint for update cart data
    When I send request for update cart data with invalid input
    Then I receive status code 404
    And I got an error message