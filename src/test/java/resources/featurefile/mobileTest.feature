Feature:Mobile search Functionality check



  Background: User is on amazon home page
    Given User is on the amazon homepage



  Scenario: User should be able to purchase Mobile successfully
    When User search for "Mobile" laptop in the search bar and click on search button and finds the selection from the pages "TCL 20S Unlocked Android Smartphone with 6.67” Dotch FHD+ Display"
    And selects the quantity "3"
    And clicks on add to cart button
    Then Verifies the add to cart message "Added to Cart"

