Feature: User selects an item from categories option.

  Background:
    Given Navigate to home page of OLX "https://www.olx.in".

  Scenario: user selects Dogs options
    Given user is on home page  and verifies page title
    When user clicks on Categories option
    And user clicks on Dogs option
    Then it should take user to dog page and verifies page title
