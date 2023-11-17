@ProductRating
Feature: Get product rating
  As a user
  I want to get product rating
  So that I can view product rating

  Scenario: As a user I can get product rating with valid credentials
    Given I set valid API endpoint for get product rating
    When I send valid request to get product rating
    Then I receive status code 200
    And I receive valid data for product rating

  Scenario: As a user I cannot get product rating with valid API and invalid method
    Given I set valid API endpoint for get product rating
    When I send invalid request to get product rating
    Then I receive status code 404

  Scenario: As a user I cannot get product rating with invalid API and valid method
    Given I set invalid API endpoint for get product rating
    When I send valid request to get product rating 1
    Then I receive status code 404

  Scenario: As a user I cannot get product rating with invalid API and invalid method
    Given I set invalid API endpoint for get product rating
    When I send invalid request to get product rating
    Then I receive status code 404
