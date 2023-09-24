Feature: Select Product
  As a User
  I want to select product
  So that i can get the product

  Scenario: As a user I can select product with valid phone number
    Given I am on the dashboard page
    When I am choose product that i want
    And I enter valid phone number
    And I select the nominal
    Then I redirected to the payment page

  Scenario: As a User I can't select product with invalid phone number
    Given I am on the dashboard page
    When I am choose product that i want
    And I enter invalid phone number
    Then I am still on the number phone form page
    And I can not redirected to the payment page
