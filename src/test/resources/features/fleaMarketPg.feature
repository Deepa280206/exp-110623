Feature: Automate the FLEA Market

 @flea1
  Scenario: Landing Page
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    When I verify and Click on "Mac" Category on the Top Bar
    Then I verify Cart Icon is present
    Then I verify Image Slider is present
    Then I verify Contact button functionality

    @flea2
    Scenario Outline: Landing Page category tests
      Given I visit FLEA Market in the "qa" Environment
      Then I verify title is "e-commerce – Automation Practice Website" for the page
      Then I verify and Click on "<name>" Category on the Top Bar

      Examples:
        | name |
        | Mac |
        | iPhone |
        | Watch  |
        | Accessories |

  @flea3
  Scenario: Product Page
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    When I wait and click on a product "Apple Watch Series 6" on the Landing Page
    When I verify Description contains text "Apple Watch Series 6"
    When I add "2" items to Cart and verify Cart

  @flea4
  Scenario Outline: Product Page Outline
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    When I wait and click on a product "<product>" on the Landing Page
    When I verify Description contains text "<product>"
    When I add "2" items to Cart and verify Cart
    Examples:
      | product               |
      | Apple Watch Series 6  |
      | AirPods Pro           |
      | iMac                  |
      | IPhone 12             |
      | IPhone XR             |
      | Macbook Air           |

    @flea5
    Scenario Outline: Add to Cart functionality
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    Then I click on the Add to Cart button on the "<product>"
    Then I wait and click on the View Cart button
    Then I verify the "<product>" is present in the cart
    Then I increment the Qty counter to "2" for the "<product>"
    Then I click on the UpdateCart button
    Then I remove the "<product>" from the cart
    Then I verify the "<product>" is removed from the cart

    Examples:
      | product               |
      | iMac                  |
#      | Apple Watch Series 6  |
#      | AirPods Pro           |
#      | iMac                  |
#      | IPhone 12             |
#      | IPhone XR             |
#      | Macbook Air           |

