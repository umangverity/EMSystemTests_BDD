Feature: Functionality on login page of Application

  Scenario: Verification of Login functionality
    Given Headless browser is opened and Expense Manager app is launched
    When I Enter correct Username and Password
    And click on login button
    Then it shows home page
    
