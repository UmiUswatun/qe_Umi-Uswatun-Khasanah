Feature: Update A Product
  As a user
  I want update a product
  So that i can update a product

  Scenario:  As a user i can can update a product with valid API and valid input
    Given I set valid API endpoint for update a product
    When I send request for update a product with valid input
    Then I receive status code 200
    And I can update a product

  Scenario:  As a user i can can update a product with valid API and invalid input
    Given I set valid API endpoint for update a product
    When I send request for update a product with invalid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can can update a product with invalid API and valid input
    Given I set invalid API endpoint for update a product
    When I send request for update a product with valid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can can update a product with invalid API and invalid input
    Given I set invalid API endpoint for update a product
    When I send request for update a product with invalid input
    Then I receive status code 404
    And I got an error message