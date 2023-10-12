Feature: Delete user
  As a user
  I want to get user data
  So that i can delete user data

Scenario: As a user i can delete user data with valid URL
Given I set valid API endpoint for delete user data
When I send valid request
Then I receive status code 200
And I can delete user data

Scenario: As a user i can not delete user data with invalid URL
Given I set invalid API endpoint for delete user data
When I send invalid request
Then I receive status code 404
And I got an error message