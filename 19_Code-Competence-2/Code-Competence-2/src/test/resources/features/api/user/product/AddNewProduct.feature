Feature: Add New Product
  As a user
  I want Add New Product
  So that i can Add New Product

  Scenario:  As a user i can add new product for login with valid API and valid input
    Given I set valid API endpoint for add new product
    When I send request for add new product with valid input
    Then I receive status code 200
    And I can add new product

  Scenario:  As a user i can not add new product with valid API and invalid input
    Given I set valid API endpoint for add new product
    When I send request for add new product with invalid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not add new product with invalid API and valid input
    Given I set invalid API endpoint for add new product
    When I send request for add new product with valid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not add new product with invalid API and invalid input
    Given I set invalid API endpoint for add new product
    When I send request for add new product with invalid input
    Then I receive status code 404
    And I got an error message