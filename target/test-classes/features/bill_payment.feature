@BillPayment
Feature: Bill Pay Functionality

  Background:
    Given Navigate to Para Bank Website
    * Fill in the Login with default Username and password
    * Click to Log in button

  Scenario Outline: Bill Payment Process
    Given Click to Bill Pay button
    * Fill in the Payee Name input as "<payeeName>"
    * Fill in the Bill Address input as "<address>"
    * Fill in the Bill City input as "<city>"
    * Fill in the Bill State input as "<state>"
    * Fill in the Bill Zip Code input as "<zipcode>"
    * Fill in the Bill Phone input as "<phone>"
    * Fill in the Account input as "<account>"
    * Fill in the Verify Account input as "<verifyAccount>"
    * Fill in the Amount input as "<amount>"
    When Click to Send Payment button
    Then Bill Payment Complete message should be displayed
    And Click to Log out button

    Examples:
      | payeeName  | address        | city      | state | zipcode | phone      | account | verifyAccount | amount |
      | Electric   | Greenfly Blvd. | London    | UK    | 1425    | 5328759663 | 123456  | 123456        | 25     |
      | WelshWater | Dayton City    | Ohio      | US    | 2563    | 5328759661 | 74123   | 74123         | 32     |
      | Telephone  | Sunset Blvd.   | Hollywood | US    | 9685    | 5328759664 | 14563   | 14563         | 23     |