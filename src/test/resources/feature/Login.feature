Feature: Login Functionality

  Scenario: Login Successful
    Given  I am in the login page of the Para Application
    When  I enter valid credentials
    Then  I should be taken to the Overview page