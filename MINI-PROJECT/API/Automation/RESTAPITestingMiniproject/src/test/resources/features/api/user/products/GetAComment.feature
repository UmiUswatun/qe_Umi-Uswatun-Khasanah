Feature: Get comment
  As a user
  I want to get comment
  So that I can view comment

  Scenario: As a user I can get comment with valid credentials
    Given I set valid API endpoint for get comment
    When I send valid request to get comment
    Then I receive status code 200
    And I receive valid data for comment

  Scenario: As a user I cannot get comment with valid API and invalid method
    Given I set valid API endpoint for get comment
    When I send invalid request to get comment
    Then I receive status code 404

  Scenario: As a user I cannot get comment with invalid API and valid method
    Given I set invalid API endpoint for get comment
    When I send valid request to get comment 1
    Then I receive status code 404

  Scenario: As a user I cannot get comment with invalid API and invalid method
    Given I set invalid API endpoint for get comment
    When I send invalid request to get comment
    Then I receive status code 404
