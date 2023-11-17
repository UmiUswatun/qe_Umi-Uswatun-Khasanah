Feature: create a new product
  As a user
  I want to create a new product
  So that new product can be saved

  Scenario: As a user I can create a new product with valid credentials
    Given I set valid API endpoint for create a new product
    When I send request to create a new product with valid inputs
    Then I receive status code 200
    And I receive valid data for create a new product

  Scenario: As a user I cannot create a new product with valid API and invalid method
    Given I set valid API endpoint for create a new product
    When I send request to create a new product with invalid inputs
    Then I receive status code 404

  Scenario: As a user I cannot create a new product with invalid API and valid method
    Given I set invalid API endpoint for create a new product
    When I send request to create a new product with valid inputs 1
    Then I receive status code 404

  Scenario: As a user I cannot create a new product with invalid API and invalid method
    Given I set invalid API endpoint for create a new product
    When I send request to create a new product with invalid inputs
    Then I receive status code 404
