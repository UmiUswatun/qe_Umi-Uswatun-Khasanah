Feature: Add new cart
  As a user
  I want Add new cart
  So that i can add new cart

  Scenario:  As a user i can add new cart with valid API and valid input
    Given I set valid API endpoint for add new cart
    When I send request for add new cart with valid input
    Then I receive status code 200
    And I can add new cart

  Scenario:  As a user i can not add new cart with valid API and invalid input
    Given I set valid API endpoint for add new cart
    When I send request for add new cart with invalid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not add new cart with invalid API and valid input
    Given I set invalid API endpoint for add new cart
    When I send request for add new cart with valid input
    Then I receive status code 404
    And I got an error message

  Scenario:  As a user i can not add new cart with invalid API and invalid input
    Given I set invalid API endpoint for add new cart
    When I send request for add new cart with invalid input
    Then I receive status code 404
    And I got an error message