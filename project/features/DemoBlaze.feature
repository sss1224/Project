Feature: To verify the URL for Demo_blaze on Google browser
Scenario: To verify the URL for Demo_blaze on Google browser
    Given User opens the browser
    When opens the DemoBlaze application URL
    Then the indexpage should be displayed with signin button
     Then browser is closed