Feature: Get order by Id
  As a user
  I want to get order by Id
  So that I can view list of order by Id

  Scenario: As a user I can get order by id with valid credentials
    Given I set valid API endpoint for get order by id
    When I send valid request to get order by id
    Then I receive status code 200
    And I receive valid data for order by id

  Scenario: As a user I cannot get order by id with valid API and invalid method
    Given I set valid API endpoint for get order by id
    When I send invalid request to get order by id
    Then I receive status code 404

  Scenario: As a user I cannot get order by id with invalid API and valid method
    Given I set invalid API endpoint for get order by id
    When I send valid request to get order by id 1
    Then I receive status code 404

  Scenario: As a user I cannot get order by id with invalid API and invalid method
    Given I set invalid API endpoint for get order by id
    When I send invalid request to get order by id
    Then I receive status code 404

