Feature: Update Newest Post
  As a User
  I want to see the newest Post
  So that i see the newest status from the others

  Scenario: As a user i can see the newest post
    Given I am on the dashboard page
    When I refresh the dashboard Page
    Then I can see the newest post from the others

  Scenario: As a User I can not see the newest post
    Given I am on the dashboard page
    When I do not refresh the page
    Then I can not see the newest post from the others

