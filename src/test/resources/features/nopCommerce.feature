Feature: nopCommerce tests

# nopCommerce test
# Given client open the main page https://nop-qa.portnov.com
# Then client opens Computer->Desktops category
# Then client clieck on build your own computer
# Then client select the amount of RAM 2 GB
# And client select HDD option 320 Gb
# And client set quantity to 2
# And client click ‘Add to cart button’
# Then client open shopping cart
# And client should see price as 1315$
# And client should see total for the item in the shopping cart as 2630$
# And client should see total for the order as 2630$

  Background:
    Given I open url "https://nop-qa.portnov.com"

  Scenario: nopCommerce Test
    Then I mouse over element with xpath "(//a[contains (text(), 'Computers')])[1]"
    Then I click on element with xpath "(//a[contains (text(), 'Desktops')])[1]"
    Then I click on element with xpath "//a[contains(text(),'Build your own computer')]"
    Then I click on element with xpath "//dd/select/option[text()='2 GB']"
    Then I click on element with xpath "//label[text()='320 GB']//preceding-sibling::input"
    Then I clear element with xpath "//input[@id='product_enteredQuantity_1']"
    Then I type "2" into element with xpath "//input[@id='product_enteredQuantity_1']"
    Then I click on element with xpath "//button[@id='add-to-cart-button-1']"
    Then I click on element with xpath "//span[@class='cart-label']"
    Then I wait for element with xpath "//td[@class='unit-price' and contains(span[@class='product-unit-price'],'$1,315.00')]" to be present
    Then element with xpath "//*[contains(text(), 'Build your own computer')]//../..//span[@class='product-subtotal']" should contain text "$2,630.00"
    Then element with xpath "//tr[@class='order-total']/td/span/strong" should contain text "$2,630.00"
    And I wait for 5 sec

#      Then I click on element with xpath "(//a[contains (text(), 'Desktops')])[1]"
#      Then I click on element with xpath "//a[contains(text(),'Build your own computer')]"
#      Then I click on element with xpath "//select[@id='product_attribute_2']"
#      Then I click on element with xpath "//input[@id='product_attribute_3_6']"
#      Then I clear element with xpath "//input[@id='product_enteredQuantity_1']"
#      Then I type "2" into element with xpath "//input[@id='product_enteredQuantity_1']"
#      Then I click on element with xpath "//button[@id='add-to-cart-button-1']"
#      Then I click on element with xpath "//span[@class='cart-label']"
#      Then element with xpath "//span[contains(text(),'$1315.00')]" should be displayed


# Homework
# nopCommerce test - Write a test case and scenario to test Delete from shopping cart functionality
#
# Given client open the main page https://nop-qa.portnov.com
# Then client opens Electronics->Cell phones category
# Then client clicks on Nokia Lumia
# And client clicks ‘Add to cart button’
# Then client opens Apparel->Shoes category
# Then the client clicks on Nike Floral Roshe Customized Running Shoes
# Then the client selects 9 from the Size dropdown menu
# Then the client selects White/Blue from the Color dropdown menu
# Then the client select the Fresh floral image
# And client clicks ‘Add to cart button’
# Then client clicks on Books menu
# Then the client clicks on Pride and Prejudice
# Then the client clicks ‘Add to cart button’
# Then client opens shopping cart
# And client should see Nokia Lumia 1020 product with the price as $349
# And client should see Nike Floral Roshe Customized Running Shoes Size:9,
# Color:White/Blue,Print:Fresh with the price as $40
# And client should see Pride and Prejudice with the price as $24
# And client should see the Total as $413.00
# Then the client removes Pride and Prejudice from the Shopping Cart
# And client should see Total as $389

  Scenario: A test to add and delete items from the shopping cart
    Then I mouse over element with xpath "(//ul[@class='top-menu notmobile']/li[2])"
    Then I click on element with xpath "(//a[contains(text(),'Cell phones')])[1]"
    Then I click on element with xpath "//h2/a[contains(text(),'Nokia Lumia 1020')]"
    Then I click on element with xpath "//button[@id='add-to-cart-button-20']"
    Then I mouse over element with xpath "(//ul[@class='top-menu notmobile']/li[3])"
    Then I click on element with xpath "(//a[contains(text(),'Shoes')])[1]"
    Then I click on element with xpath "//h2/a[contains(text(),'Nike Floral')]"
    Then I click on element with xpath "//select[@name='product_attribute_6']//option[@value='14']"
    Then I click on element with xpath "//select[@name='product_attribute_7']//option[@value='17']"
    Then I click on element with xpath "(//span[@class='attribute-square'])[2]"
    Then I mouse over element with xpath "//div[@class='master-wrapper-page']"
    Then I click on element with xpath "//button[@id='add-to-cart-button-24']"
    
    Then I click on element with xpath "(//ul[@class='top-menu notmobile']/li[5])"
    Then I click on element with xpath "//h2/a[contains(text(),'Pride and Prejudice')]"
    Then I click on element with xpath "//button[@id='add-to-cart-button-39']"

    Then I wait for element with xpath "//span[@class='cart-label']" to be present
    Then I click on element with xpath "//span[@class='cart-label']"

    Then I wait for element with xpath "//td[@class='unit-price' and contains(span[@class='product-unit-price'],'$349.00')]" to be present
    Then element with xpath "//*[contains(text(), 'Nokia Lumia 1020')]//../..//span[@class='product-subtotal']" should contain text "$349.00"

    Then I wait for element with xpath "//td[@class='unit-price' and contains(span[@class='product-unit-price'],'$40.00')]" to be present
    Then element with xpath "//*[contains(text(), 'Nike Floral Roshe Customized Running Shoes')]//../..//span[@class='product-subtotal']" should contain text "$40.00"

    Then I wait for element with xpath "//td[@class='unit-price' and contains(span[@class='product-unit-price'],'$24.00')]" to be present
    Then element with xpath "//*[contains(text(), 'Pride and Prejudice')]//../..//span[@class='product-subtotal']" should contain text "$24.00"

    Then element with xpath "//tr[@class='order-total']/td/span/strong" should contain text "$413.00"
    Then I click on element with xpath "//td/a[contains(text(), 'Pride and Prejudice')]/../..//button[@name='updatecart']"

    Then element with xpath "//td/a[contains(text(), 'Pride and Prejudice')]/../.." should not be present
    Then element with xpath "//tr[@class='order-total']/td/span/strong" should contain text "$389.00"
    Then I scroll to the element with xpath "//tr[@class='order-total']/td/span/strong" with offset 5
    Then I wait for 5 sec



 






