Feature: Laptop search functionality check


  Background: User is on amazon home page
    Given User is on the amazon homepage


  @Smoke @Regression
  Scenario: User should be able to purchase laptop successfully
    When User search for "Laptop" laptop in the search bar and click on search button and finds the selection from the pages "2021 Newest HP 15.6 HD Laptop for Business and Student"
    And selects the quantity "3"
    And clicks on add to cart button
    Then Verifies the add to cart message "Added to Cart"