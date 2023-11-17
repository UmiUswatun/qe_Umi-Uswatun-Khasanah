Feature: Remove Item
  As a user
  I want to remove item
  So that item is removed

  Scenario: As a User i can remove item
    Given I am on the dashboard page
    When I swipe item to the left or right
    Then I successfully remove item
