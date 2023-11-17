Feature: create category
  As a user
  I want to create category
  So that i can make a new category

  Scenario: As a user I can create a new category with valid credentials
    Given I set valid API endpoint for create a new category
    When I send request to create a new category with valid inputs
    Then I receive status code 200
    And I receive valid data for create a new category

  Scenario: As a user I cannot create a new category with valid API and invalid method
    Given I set valid API endpoint for create a new category
    When I send request to create a new category with invalid inputs
    Then I receive status code 404

  Scenario: As a user I cannot create a new category with invalid API and valid method
    Given I set invalid API endpoint for create a new category
    When I send request to create a new category with valid inputs 1
    Then I receive status code 404

  Scenario: As a user I cannot create a new category with invalid API and invalid method
    Given I set invalid API endpoint for create a new category
    When I send request to create a new category with invalid inputs
    Then I receive status code 404
