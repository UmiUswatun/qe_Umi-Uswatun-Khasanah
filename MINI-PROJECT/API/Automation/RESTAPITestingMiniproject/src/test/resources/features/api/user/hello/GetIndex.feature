Feature: Get index
  As a user
  I want to get index
  So that I can view list of index

  Scenario: As a user I can get index with valid credentials
    Given I set valid API endpoint for get index
    When I send valid request to get index
    Then I receive status code 200
    And I receive valid data for index

  Scenario: As a user I cannot get index with valid API and invalid method
    Given I set valid API endpoint for get index
    When I send invalid request to get index
    Then I receive status code 404

  Scenario: As a user I cannot get index with invalid API and valid method
    Given I set invalid API endpoint for get index
    When I send valid request to get index 1
    Then I receive status code 404

  Scenario: As a user I cannot get index with invalid API and invalid method
    Given I set invalid API endpoint for get index
    When I send invalid request to get index
    Then I receive status code 404