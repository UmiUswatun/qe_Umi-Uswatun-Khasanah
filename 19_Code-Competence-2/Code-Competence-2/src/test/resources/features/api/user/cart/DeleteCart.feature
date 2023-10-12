Feature: Delete cart
  As a user
  I want to delete cart
  So that i can delete cart

Scenario: As a user i can delete cart with valid URL
Given I set valid API endpoint for delete cart
When I send valid request
Then I receive status code 200
And I can delete cart

Scenario: As a user i can not delete cart with invalid URL
Given I set invalid API endpoint for delete cart
When I send invalid request
Then I receive status code 404
And I got an error message