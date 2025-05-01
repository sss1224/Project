Feature: Contact feature of DemoBlaze application
Scenario: To verify that the user redirects to New message page
    Given User opens the browser
    When opens the DemoBlaze application URL
    And user clicks on contact button
    Then browser is closed
    
 Scenario: To Verify that user is able to send message successfully
    Given User opens the browser
    When opens the DemoBlaze application URL
    And user clicks on contact button
    And user enters 'contact mail' , 'contact name' and 'message'
    And user click on send message button
    Then Alert message is displayed
    Then browser is closed