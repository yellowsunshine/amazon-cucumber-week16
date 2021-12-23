Feature: Mobile search functionality check


  Background: User is on amazon home page
    Given User is on the amazon homepage


  @Sanity @Regression
  Scenario: User should be able to purchase mobile phone successfully
    When User search for "Mobile Phone" laptop in the search bar
    And clicks on the search button
    And finds the selection from the pages "Nokia XR20 5G | Android 11 | Unlocked Smartphone | Dual SIM | US Version | 6/128GB | 6.67-Inch Screen | 48MP Dual Camera | Polar Night"
    And selects the quantity "2"
    And clicks on add to cart button
    Then Verifies the add to cart message "Added to Cart"