Feature: Delete a category
  As a user
  I want to delete a category
  So that I can delete a category

  Scenario: As a user I can delete a category with valid credentials
    Given I set valid API endpoint for delete a category
    When I send valid request to delete a category
    Then I receive status code 200
    And I receive valid data for delete a category

  Scenario: As a user I cannot delete a category with valid API and invalid method
    Given I set valid API endpoint for delete a category
    When I send invalid request to delete a category
    Then I receive status code 404

  Scenario: As a user I cannot delete a category with invalid API and valid method
    Given I set invalid API endpoint for delete a category
    When I send valid request to delete a category 1
    Then I receive status code 404

  Scenario: As a user I cannot delete a category with invalid API and invalid method
    Given I set invalid API endpoint for delete a category
    When I send invalid request to delete a category
    Then I receive status code 404