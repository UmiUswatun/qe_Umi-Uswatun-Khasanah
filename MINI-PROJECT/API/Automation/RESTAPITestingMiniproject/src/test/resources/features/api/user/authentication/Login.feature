Feature: Login
  As a user
  I want to login
  So that i can login

  Scenario: As a user I can login with valid credentials
    Given I set valid API endpoint for login
    When I send request to login
    Then I receive status code 200
    And I can login

  Scenario: As a user I cannot login with valid API and invalid method
    Given I set valid API endpoint for login
    When I send invalid request to login
    Then I receive status code 404

  Scenario: As a user I cannot login with invalid API and valid method
    Given I set invalid API endpoint for login
    When I send request to login 1
    Then I receive status code 404

  Scenario: As a user I cannot login with invalid API and invalid method
    Given I set invalid API endpoint for login
    When I send invalid request to login
    Then I receive status code 404
