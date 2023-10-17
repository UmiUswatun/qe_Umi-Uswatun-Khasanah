Feature: Checkout product
  As a user
  I want to checkout my products
  So that i can get my products

  Background:
    Given I am on the cart page

  Scenario: As a user i can checkout with added items
    When I click checkout
    And I redirected to your information page
    And I input valid credentials
    And I click continue button
    And I redirected to overview page
    And I click finish button
    Then I redirected to compelete page
    And I click back home button
    Then I redirected to cart page

  Scenario: As a user i cannot checkout added items with invalid input
    When I click checkout
    And I redirected to your information page
    And I input invalid credentials
    And I click continue button
    Then I got an error message

  Scenario: As a user i cannot checkout without added item
    When I remove all the items
    Then I see that checkout button should not appear
