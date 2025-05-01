Feature: Login feature of Demoblaze application

  Scenario: Verify the successful login of DemoBlaze application
    Given User opens the browser
    When opens the DemoBlaze application URL
    And user clicks on login link
    And user enters username as 'name' and password as 'pass'
    And user clicks on login button
    Then the homepage should be displayed with signout button
    Then browser is closed
