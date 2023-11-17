@android
Feature: Add new item
  As a user
  I want to add new item
  So that item can added

  Scenario: As a User i can add new item with valid credentials
    Given I am on the dashboard page
    When I click plus icon
    And I enters valid credentials
    And I click add item
    Then I successfully added a new item on the dashboard page

  Scenario: As  a user i cannot add a new item with invalid name
    Given I am on the dashboard page
    When I click plus icon
    And I enter invalid name
    And I enter valid quantity
    And I click add item
    Then I got an error message

  Scenario: As a user I cannot add a new item with invalid quantity
    Given I am on the dashboard page
    When I click plus icon
    And I enter valid name
    And I enter invalid quantity
    And I click add item
    Then I got an error message

  Scenario: As a user I cannot add a new item with blanks fields
    Given I am on the dashboard page
    When I click plus icon
    And I left the field name blank
    And I left the field quantity blank
    And I click add item
    Then I got an error message

  Scenario: As a user i can reset the name of item using reset button
    Given I am on the dashboard page
    When I click plus icon
    And I enter valid name
    And I enter valid quantity
    And I click reset button
    Then the name field is empty again and the quantity field back to 1