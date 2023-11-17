Feature: Get User Information
  As a user
  I want to get user information
  So that I can view user information

  Scenario: As a user I can get user Information with valid credentials
    Given I set valid API endpoint for get user Information
    When I send valid request to get user Information
    Then I receive status code 200
    And I receive valid data for user Information

  Scenario: As a user I cannot get user Information with valid API and invalid method
    Given I set valid API endpoint for get user Information
    When I send invalid request to get user Information
    Then I receive status code 404

  Scenario: As a user I cannot get user Information with invalid API and valid method
    Given I set invalid API endpoint for get user Information
    When I send valid request to get user Information 1
    Then I receive status code 404

  Scenario: As a user I cannot get user Information with invalid API and invalid method
    Given I set invalid API endpoint for get user Information
    When I send invalid request to get user Information
    Then I receive status code 404

