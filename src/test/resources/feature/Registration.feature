@register
Feature: User Registration

  @register_positive
  Scenario Outline: User Register Successfully
    Given The user is on the home page of the Para Bank Application
    When  The user enters personal details of "<firstName>", "<lastName>", "<address>", "<city>", "<state>", "<zipCode>", "<phoneNumber>", "<ssn>", "<userName>","<password>" and "<confirm>"
    Then  User should be taken to the Account Services page
    Examples:
      | firstName | lastName | address    | city   | state         | zipCode | phoneNumber | ssn            | userName  | password | confirm  |
      | Sam       | Chan     | CaveStreet | Durban | KwaZulu-Natal | 4031    | 0976785632  | 25082667096879 | tautester | password | password |