Feature: Get All order
  As a user
  I want to get all order
  So that I can view list of all order

  Scenario: As a user I can get all order with valid credentials
    Given I set valid API endpoint for get all order
    When I send valid request to get all order
    Then I receive status code 200
    And I receive valid data for all order

  Scenario: As a user I cannot get all order with valid API and invalid method
    Given I set valid API endpoint for get all order
    When I send invalid request to get all order
    Then I receive status code 404

  Scenario: As a user I cannot get all order with invalid API and valid method
    Given I set invalid API endpoint for get all order
    When I send valid request to get all order 1
    Then I receive status code 404

  Scenario: As a user I cannot get all order with invalid API and invalid method
    Given I set invalid API endpoint for get all order
    When I send invalid request to get all order
    Then I receive status code 404

