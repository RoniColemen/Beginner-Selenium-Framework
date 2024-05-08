Feature: Login into Tuts Ninja Site

  #Author - Rohan Rane
  #Use Case - Login with the credentials using actual password and username from method
  Scenario Outline:
    Given User navigates to the AUT website
    When Enter the Username "<username>"and Password "<password>"

    Examples:
      |username  |   password |
      |user  |   pass1 |
      |user@test.com | usertest12 |

  #Author - Rohan Rane
  #Use Case - Login with the credentials using actual password and username from method
  Scenario: login with valid credentials
    Given User navigates to the AUT website
    And User enters the valid username
    When User enters the valid password
    Then User should be logged into the AUT

  Scenario: Add a MAC book to the wishlist and then add to cart
    Given User navigates to the AUT website
    And User enters the valid username
    When User enters the valid password
    Then User should be logged into the AUT
    And User clicks on Desktops tab and looks for a Mac
    When User clicks on the mac and adds the product to the wishlist
    Then User adds the product to the cart and checks out
