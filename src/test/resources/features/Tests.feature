@predefined

#Feature: Verifying Details on a Ferragamo Leather Moccasin Page

#    As a fashionable individual,
#    I want to verify all the details of a Ferragamo Leather Moccasin on the product page,
#    So I can make an informed choice about purchasing it.
#  Background:
#    Given I open url "https://www.ferragamo.com/"

#  Scenario: Searching for a Leather Moccasin
#    Given I visit the Ferragamo website
#    When I enter "Leather Moccasin" into the search bar
#    And I click the search button
#    Then I should see search results related to "Leather Moccasin"
#    And the results should mention "Leather Moccasin"

#    Scenario: Searching for a Leather Moccasin
#      Then I mouse over element with xpath "//button[@data-test='icon-search']"
#      Then I click on element with xpath "//button[@data-test='icon-search']"
#      Then I wait for element with xpath "//input[@id='search-input']" to be present
#      Then element with xpath "//input[@id='search-input']" should be displayed
#      Then I type "Moccasin" into element with xpath "//input[@id='search-input']"
#      Then I press enter for element with xpath "//input[@class='search-input']"
#      Then I wait for element with xpath "//div[@class='custom-xo4j54 e1us0qi80']" to be present
#      Then element with xpath "//div[@class='custom-xo4j54 e1us0qi80']" should be displayed
#
#
#    Scenario: Verifying Product Details
#      Given I open url "https://www.ferragamo.com/en-us/shopping/moccasin-with-gancini-ornament-15649955"


#  Scenario: Verifying Product Details
#    Given I am on the product page for "Moccasin with Gancini ornament"
#    Then I should see the product image displayed
#    And the product name should be "Moccasin with Gancini ornament"
#    And the product description should contain "calfskin"
#    And the price details should be clearly displayed
#    And color and size options should be available
#    And there should be an "Add to Bag" button


#   Homework scenario (https://www.cartier.com/):
#
  Feature: Searching for the Cartier Love Bracelet
#
#   Background:  As a jewelry enthusiast,
#   I want to learn more about the Cartier Love Bracelet,
#   So I can appreciate its design, features, and history.
#
#   Scenario: Searching for a Cartier Love Bracelet
#   Given I visit the Cartier website
#   When I enter "Love Bracelet" into the search bar
#   And I click the search button
#   Then I should see search results related to "Love Bracelet"
#   And result should mention "Love Bracelet

  Background:
    Given I open url "https://www.cartier.com/"

  Scenario: Searching for the Cartier Love Bracelet
    Then I mouse over element with xpath "//div[@class='site-search']"
    Then I click on element with xpath "//div[@class='site-search']"
    Then I type "Love Bracelet" into element with xpath "//input[@id='siteSearch']"
    Then I press enter for element with xpath "//input[@id='siteSearch']"
    Then element with xpath "//div[@class='row product-grid grid-view']" should be displayed
    Then element with xpath "(//span[contains(text(),'LOVE bracelet')])[1]" should be present

  Scenario: Searching for the Cartier Love Bracelet
    Then I mouse over element with xpath "//div[@class='site-search']"
    Then I click on element with xpath "//div[@class='site-search']"
    Then I type "Love Bracelet" into element with xpath "//input[@id='siteSearch']"
    Then I click on element with xpath "//button[@title='Submit search']"
    Then element with xpath "//div[@class='row product-grid grid-view']" should be displayed
    Then element with xpath "(//span[contains(text(),'LOVE bracelet')])[1]" should be present

    #Homework - solution
Feature: Cartier tests

  Scenario: Searching for a Cartier Love Bracelet
    Given I open url "https://www.cartier.com/"
    Then I press enter for element with xpath "//nav[@id='navigation']//..//button[@for='siteSearch']"
    Then I type "Love Bracelet" into element with xpath "//input[@id='siteSearch']"
    Then I click on element with xpath "//button[@aria-label='Submit search']"
    Then element with xpath "//div[@class='search-results__main ']//input[@data-search-component='query-input']" should be displayed
    Then element with xpath "//div[@id='product-search-results']" should contain text "Love Bracelet"


#  [10:11 AM] Tatyana Kan
    Scenario: Searching for the Cartier Love bracelet
      Given I open url "https://www.cartier.com/"
      Then I click on element using JavaScript with xpath "(//button[@title='Toggle search bar'])[2]"
      Then I type "Love bracelet" into element with xpath "//input[@id='siteSearch']"
      Then I click on element with xpath "//button[@title='Submit search']"
      Then I should see page title contains "Love bracelet"
      Then I wait for element with xpath "//div[@data-search-component='product-grid']" to be present
      Then element with xpath "//div[@data-search-component='product-grid']" should contain text "love bracelet"
      Then I take screenshot

#      Irina
    Scenario: Searching for a Cartier Love Bracelet
      Given I open url "https://www.cartier.com/"
      Then I press enter for element with xpath "//nav[@id='navigation']//..//button[@for='siteSearch']"
      Then I type "Love Bracelet" into element with xpath "//input[@id='siteSearch']"
      Then I click on element with xpath "//button[@aria-label='Submit search']"
      Then element with xpath "//div[@class='search-results__main ']//input[@data-search-component='query-input']" should be displayed
      Then element with xpath "//div[@class='search-results__main ']//input[@data-search-component='query-input']" should contain text "love bracelet"

#    [10:05 AM] Arslan Alimov
  Scenario: Searching for Cartier Love Bracelet
    Given I open url "https://www.cartier.com/"
    Then I click on element with xpath "//div[@class='site-search']"
    Then element with xpath "//input[@id='siteSearch']" should be displayed
    Then I type "Love Bracelet" into element with xpath "//input[@id='siteSearch']"
    Then element with xpath "//form[@role='search']//button" should be displayed
    Then I click on element with xpath "//form[@role='search']//button"
    Then I should see page title contains "Love Bracelet"
    Then element with xpath "//*[@id='product-search-results']" should contain text "Love Bracelet"