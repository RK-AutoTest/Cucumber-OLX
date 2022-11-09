Feature: Navigating to OLX Home page and selecting options

  Background:
    Given I navigate to home page of OLX "https://www.olx.in".

  Scenario: user should be able to navigate to homepage and click on dropdown box to select country


    When user clicks on drop down country list
    Then user able to see and click on location options


  Scenario Outline: user should be able to click on search box and click on search button
    When user clicks on input field of search box "<cars>"
    Then user clicks on search button
    Examples:
      | cars |
      | car  |



