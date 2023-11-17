Feature: Get all categories
  As a user
  I want to get all categories
  So that I can view list of product

  Scenario: As a user I can get all categories with valid credentials
    Given I set valid API endpoint for get all categories
    When I send valid request to get all categories
    Then I receive status code 200
    And I receive valid data for all categories

  Scenario: As a user I cannot get all categories with valid API and invalid method
    Given I set valid API endpoint for get all categories
    When I send invalid request to get all categories
    Then I receive status code 404

  Scenario: As a user I cannot get all categories with invalid API and valid method
    Given I set invalid API endpoint for get all categories
    When I send valid request to get all categories 1
    Then I receive status code 404

  Scenario: As a user I cannot get all categories with invalid API and invalid method
    Given I set invalid API endpoint for get all categories
    When I send invalid request to get all categories
    Then I receive status code 404
