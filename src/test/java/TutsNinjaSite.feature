Feature: Login into Tuts Ninja Site

  #Author - Rohan Rane
  #Use Case - Login with the credentials using actual password and username from method
  Scenario: login with valid credentials
    Given User navigates to the AUT website
    And User enters the valid username
    When User enters the valid password
    Then User should be logged into the AUT

  Scenario Outline:
    Given User navigates to the AUT website
    When Enter the Username "<username>"and Password "<password>"

    Examples:
    |username  |   password |
    |user  |   pass1 |
    |user@test.com | usertest12 |
