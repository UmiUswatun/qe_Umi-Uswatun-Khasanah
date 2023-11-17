Feature: Delete a product
  As a user
  I want to delete a product
  So that I can delete a product

  Scenario: As a user I can delete a product with valid credentials
    Given I set valid API endpoint for delete a product
    When I send valid request to delete a product
    Then I receive status code 200
    And I receive valid data for delete a product

  Scenario: As a user I cannot delete a product with valid API and invalid method
    Given I set valid API endpoint for delete a product
    When I send invalid request to delete a product
    Then I receive status code 404

  Scenario: As a user I cannot delete a product with invalid API and valid method
    Given I set invalid API endpoint for delete a product
    When I send valid request to delete a product 1
    Then I receive status code 404

  Scenario: As a user I cannot delete a product with invalid API and invalid method
    Given I set invalid API endpoint for delete a product
    When I send invalid request to delete a product
    Then I receive status code 404