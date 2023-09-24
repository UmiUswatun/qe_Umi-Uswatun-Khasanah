Feature: Create Post
  As a User
  I can create post
  So that i can post

  Scenario: As a User I can create post
    Given I am on the dashboard page
    When I click start a post icon
    And I write a post with valid file
    And I click post
    Then I successfully posted

  Scenario: As a User I can not create post
    Given I am on the dashboard page
    When I click start a post icon
    And I write a post with invalid type of file
    And I click post
    Then I got an error mesaage
    And I did not successfully posted
