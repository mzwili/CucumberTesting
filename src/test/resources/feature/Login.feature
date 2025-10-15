Feature: User Login
  @login

  @login_positive
  Scenario Outline: User Login Successfully
    Given The user is on the home page of the Para Bank Application
    When  The user enters valid "<email>" and "<password>"
    Then  User should be taken to the Overview page
  Examples:
    | email     | password |
    | tautester | password |