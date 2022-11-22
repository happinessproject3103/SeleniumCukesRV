@SavingsAccount
Feature:This feature tests the Open New Savings account Functionality of ParaBank UI

  ## Please note as mentioned before the website data changes which can give inaccurate results

  @HappyPath
  Scenario: Test 1: When I login with valid credentials then I should be able to open new Savings account
    Given Navigate to Para Bank Website
    And Fill in the Login with default Username and password
    When Click to Log in button
    And Click Open Account button
    And Open new Savings account
    Then savings account should be opened
    And I verify that $ "100" is added to the newly created savings account and deducted from main account