Feature: Cart
  As a user
  I want to add item to the cart
  So that I can buy the item

  Background:
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Given I am on the products page

  Scenario: As a user I can add item to the cart
    When I click add to cart button
    Then Item is added to the cart

  Scenario: As a user i can remove items from the cart
    When I remove items from the cart by click remove button
    Then my cart should be empty