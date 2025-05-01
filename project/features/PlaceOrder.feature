Feature: To Verify place order of DemoBlaze application

Scenario: Verify that user is able to place the order
Given User opens the browser
When opens the DemoBlaze application URL
Then user navigates to cart
Then user clicks on place button 
Then order summary and Ok button is displayed
Then browser is closed