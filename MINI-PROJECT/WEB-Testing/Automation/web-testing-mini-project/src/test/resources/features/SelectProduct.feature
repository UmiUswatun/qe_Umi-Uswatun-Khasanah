Feature: Select Product
  As a user
  I want to select product
  So that i can view my selected item on a cart

  Scenario: As a user i can add product into the cart without login
    Given I am on the product page
    When I click buy icon of one items
    Then I succeeded add items into the cart

  Scenario: As a user i can add product into the cart with login
    When I enter valid email
    And I enter valid password
    Then I clicks the login button
    Given I am on the product page
    When I click buy icon of one items
    Then I succeeded add items into the cart




