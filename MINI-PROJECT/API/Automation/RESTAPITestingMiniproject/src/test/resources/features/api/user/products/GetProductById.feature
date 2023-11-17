Feature: Get product by Id
  As a user
  I want to get product by Id
  So that I can view product by Id

  Scenario: As a user I can get product by id with valid credentials
    Given I set valid API endpoint for get product by id
    When I send valid request to get product by id
    Then I receive status code 404

  Scenario: As a user I cannot get product by id with valid API and invalid method
    Given I set valid API endpoint for get product by id
    When I send invalid request to get product by id
    Then I receive status code 404

  Scenario: As a user I cannot get product by id with invalid API and valid method
    Given I set invalid API endpoint for get product by id
    When I send valid request to get product by id 1
    Then I receive status code 404

  Scenario: As a user I cannot get product by id with invalid API and invalid method
    Given I set invalid API endpoint for get product by id
    When I send invalid request to get product by id
    Then I receive status code 404
