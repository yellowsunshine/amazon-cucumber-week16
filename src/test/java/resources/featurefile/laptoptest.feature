Feature: Laptop search functionality check


  Background: User is on amazon home page
    Given User is on the amazon homepage


  @Smoke @Regression
  Scenario: User should be able to purchase laptop successfully
    When User search for "Laptop" laptop in the search bar
    And clicks on the search button
    And finds the selection from the pages "2020 Newest HP Stream 11.6 inch HD Laptop, Intel Celeron N4000, 4 GB RAM, 64 GB eMMC, Webcam, HDMI, Windows 10"
    And selects the quantity "3"
    And clicks on add to cart button
    Then Verifies the add to cart message ""