@login
Feature: User Login
  Background:
    Given User is registered


  @login_positive
  Scenario: User Login Successfully
    Given The user is on the home page of the Para Bank Application
    When  The user enters valid credentials
    Then  User should be taken to the Overview page


  @login_negative
  Scenario Outline: User Login Unsuccessfully
    Given The user is on the home page of the Para Bank Application
    When  The user enters invalid "<email>" and "<password>"
    Then  User should not login successfully
    Examples:
      | email      | password |
      | tautester1 | password |