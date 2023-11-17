Feature: create a new order
  As a user
  I want to create a new order
  So that new order can be saved

  Scenario: As a user I can create a new order with valid credentials
    Given I set valid API endpoint for create a new order
    When I send request to create a new order with valid inputs
    Then I receive status code 200
    And I receive valid data for create a new order

  Scenario: As a user I cannot create a new order with valid API and invalid method
    Given I set valid API endpoint for create a new order
    When I send request to create a new order with invalid inputs
    Then I receive status code 404

  Scenario: As a user I cannot create a new order with invalid API and valid method
    Given I set invalid API endpoint for create a new order
    When I send request to create a new order with valid inputs 1
    Then I receive status code 404

  Scenario: As a user I cannot create a new order with invalid API and invalid method
    Given I set invalid API endpoint for create a new order
    When I send request to create a new order with invalid inputs
    Then I receive status code 404
