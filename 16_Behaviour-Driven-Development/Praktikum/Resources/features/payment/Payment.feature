Feature: Payment
  As a User
  I want to pay
  So that i can get the product

  Scenario: As a User I can pay with a sufficient balance
    Given I am on the Payment Page
    When I choose the payment method
    And I click pay button with a sufficient balance
    And I confirm payment
    Then I got the product

  Scenario: As a User I can not pay with insufficient balance
    Given I am on the Payment Page
    When I choose the payment method
    And I click pay button with insufficient balance
    And I confirm payment
    Then I can not get the product

  Scenario: As a User I can get a discount by entering valid promotional code
    Given I am on the Payment Page
    When I fill promotional code form with a valid promotional code
    And I choose the payment method
    And I click pay button
    Then I can get a discount
    And I get the product

  Scenario: As a User I can not get a discount by entering invalid promotional code
    Given I am on the Payment Page
    When I fill promotional code form with an invalid promotional code
    And I choose the payment method
    And I click pay button
    Then I can not get a discount
    And I can not get the product