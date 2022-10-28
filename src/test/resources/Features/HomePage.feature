
Feature: Navigating to OLX Home page and selecting options

  Scenario: user should be able to navigate to homepage and click on dropdown box to select country

    Given user on homepage
    When user clicks on drop down country list
    Then user able to see and click on location options


  Scenario Outline: user should be able to click on search box and click on search button
    Given user clicks on input field of search box "<cars>"
    Then user clicks on search button
    Examples:
      | cars |
       |car|



