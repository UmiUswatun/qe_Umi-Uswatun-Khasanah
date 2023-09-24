Feature: Search
  As a user
  I want to search for a connection, company, or topic
  So that i can find what i want

  Scenario: As a user i can find a connection,company, or topic
    Given I am on the dasboard page
    When I enter valid keyword in a search bar
    And I click enter
    Then I redirected to the page that i search for

  Scenario: As a user i can not find a connection,company, or topic
    Given I am on the dasboard page
    When I enter invalid keyword in a search bar
    And I click enter
    Then I got an error message
    And I can not redirected to the page that i search for