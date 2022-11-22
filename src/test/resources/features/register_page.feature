@RegisterPage
Feature: Register Functionality Negative test cases for each field
  As a user I cannot register a new account if I do not fill in mandatory fields

  Background:
    Given Navigate to Para Bank Website
    And Click to Register Menu button

  @NegativeScenario
  Scenario Outline: Test 1 : When user does not fill in required fields then Error message should be displayed
    And Fill in the First Name input as "<firstname>"
    And Fill in the Last Name input as "<lastname>"
    And Fill in the Address input as "<address>"
    And Fill in the City input as "<city>"
    And Fill in the State input as "<state>"
    And Fill in the Zip Code input as "<zipcode>"
    And Fill in the Phone input as "<phone>"
    And Fill in the SSN input as "<ssn>"
    And I Fill in the random Username as input
    And Fill in the Password input as "<password>"
    And Fill in the Confirm input as "<confirmPassword>"
    When Click to Register button
    Then Field is required error message should be displayed

    Examples:
      | firstname   | lastname   | address   | city   | state   | zipcode | phone     | ssn | password | confirmPassword |
      |             | lastName1& | address1  | city1  | state1  | 12345   | 12345678  | 123 | pass123  | pass123         |
      | firstname2$ |            | address2  | city2  | state2  | 12345   | 12345678  | 234 | pass123  | pass123         |
      | firstname3  | lastName3$ |           | city3% | state3% | 12345   | 12345678  | 345 | pass123  | pass123         |
      | firstname4  | lastName4  | address4  |        | state4  | 12345^  | 12345678  | 345 | pass123  | pass123         |
      | firstname5  | lastName5  | address5  | city5  |         | 12345   | 12345678  | 345 | pass123  | pass123         |
      | firstname6  | lastName6  | address6  | city6  | state6  |         | 12345678  | 345 | pass123  | pass123         |
      | firstname8  | lastName8  | address8  | city8  | state8  | 343535  | 12345678S |     | pass123  | pass123         |
      | firstname9  | lastName9  | address9  | city9£ | state9  | 343535  | 12345678  | 454 |          | pass123         |
      | firstname9  | lastName9  | address9* | *****  | state9  | 343535  | 12345678  | 454 | pass123  |                 |
