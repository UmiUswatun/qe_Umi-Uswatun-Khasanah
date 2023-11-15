Feature: Delete a product
  As a user
  I want to delete a product
  So that i can delete a product

Scenario: As a user i can delete a product with valid URL
Given I set valid API endpoint for delete a product
When I send valid request for delete product
Then I receive status code 200
And I can delete a product

Scenario: As a user i can not delete a product with invalid URL
Given I set invalid API endpoint for delete a product
When I send invalid request for delete product
Then I receive status code 404
And I got an error message