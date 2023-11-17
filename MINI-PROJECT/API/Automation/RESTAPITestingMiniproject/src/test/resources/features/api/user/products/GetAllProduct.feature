Feature: Get all product
  As a user
  I want to get all product data
  So that I can view list of product

  Scenario: As a user I can get all product data with valid credentials
    Given I set valid API endpoint for get all product
    When I send valid request to get all product
    Then I receive status code 200
    And I receive valid data for all product

  Scenario: As a user I cannot get all product data with valid API and invalid method
    Given I set valid API endpoint for get all product
    When I send invalid request to get all product
    Then I receive status code 404

  Scenario: As a user I cannot get all product data with invalid API and valid method
    Given I set invalid API endpoint for get all product
    When I send valid request to get all product 1
    Then I receive status code 404

  Scenario: As a user I cannot get all product data with invalid API and invalid method
    Given I set invalid API endpoint for get all product
    When I send invalid request to get all product
    Then I receive status code 404
