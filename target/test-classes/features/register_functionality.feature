@Register
Feature: Register Functionality Basic Tests
  As a user I want to register a new account so that I can use that to login to my bank

  Background:
    Given Navigate to Para Bank Website
    And Click to Register Menu button
    And Fill in the First Name input as "FirstName"
    And Fill in the Last Name input as "LatName"
    And Fill in the Address input as "UK"
    And Fill in the City input as "London"
    And Fill in the State input as "London"
    And Fill in the Zip Code input as "102456"
    And Fill in the Phone input as "12546396"
    And Fill in the SSN input as "1234"

  @HappyPath
  Scenario: Test 1: When I register a new account with unique username then I should be able to create an account
    Given I Fill in the random Username as input
    And Fill in the Password input as "user123"
    And Fill in the Confirm input as "user123"
    When Click to Register button
    Then Account create Successfully should be displayed

  @NegativeScenario
  Scenario: Test 2: When I register a new account with existing username then I should get error message
    And I Fill in the existing Username as input
    And Fill in the Password input as "user123"
    And Fill in the Confirm input as "user123"
    When Click to Register button
    Then User already exists error message should be displayed
