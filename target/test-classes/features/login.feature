@Login
Feature:This feature tests the Login Functionality of ParaBank UI

  @HappyPath
  Scenario:Login process with valid information
    Given Navigate to Para Bank Website
    And Fill in the Login with default Username and password
    When Click to Log in button
    Then Verify that you are logged in
    And Click to Log out button


  ## Please Note this Scenario was  working fine when I created the tests but website seems to have unusual behavior which allows login of unregisterd user
  ## Please see ParaBankTests_Recording_RV.mp4 in screenshots folder for recorded test run
  @NegativeScenario
  Scenario Outline:
    Given Navigate to Para Bank Website
    * Fill in the Login with unregistered Username
    * Fill in the Login Password input as "<password>"
    When Click to Log in button
    Then error message should be displayed

    Examples:
      | password    |
      | password123 |
      | password123 |
      | password123 |