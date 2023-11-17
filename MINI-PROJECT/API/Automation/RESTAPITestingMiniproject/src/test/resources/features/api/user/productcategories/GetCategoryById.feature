Feature: Get category by Id
  As a user
  I want to get category by Id
  So that I can view list of category by Id

  Scenario: As a user I can get category by Id with valid credentials
    Given I set valid API endpoint for get category by Id
    When I send valid request to get category by Id
    Then I receive status code 404
    And I receive valid data for category by Id

  Scenario: As a user I cannot get category by Id with valid API and invalid method
    Given I set valid API endpoint for get category by Id
    When I send invalid request to get category by Id
    Then I receive status code 404

  Scenario: As a user I cannot get category by Id with invalid API and valid method
    Given I set invalid API endpoint for get category by Id
    When I send valid request to get category by Id 1
    Then I receive status code 404

  Scenario: As a user I cannot get category by Id with invalid API and invalid method
    Given I set invalid API endpoint for get category by Id
    When I send invalid request to get category by Id
    Then I receive status code 404