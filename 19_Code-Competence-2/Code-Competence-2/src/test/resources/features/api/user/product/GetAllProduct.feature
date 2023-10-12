Feature: Get All Product
  As a user
  I want to get all product
  So that i can get all product

  Scenario: As a user i can get all data product with valid URL
    Given I set valid API endpoint for data product
    When I send valid request
    Then I receive status code 200
    And I get valid data for all product

  Scenario: As a user i can not get all data data product with invalid URL
    Given I set invalid API endpoint for data product
    When I send invalid request
    Then I receive status code 404
    And I got an error message
