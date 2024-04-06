Feature: Recruit tests

#  Mycode
#  Background:
#    Given I open url "https://quote-stage.portnov.com/"
#    Then I click on element with xpath "//button[@id='formSubmit']"
#
#    Scenario: Validate submission with empty fields
#    Then element with xpath "//label[@id='name-error']" should be displayed
#    Then element with xpath "//label[@id='username-error']" should be displayed
#    Then element with xpath "//label[@id='password-error']" should be displayed
#    Then element with xpath "//label[@id='password-error']" should be displayed
#    Then element with xpath "//label[@id='email-error']" should be displayed
#    Then element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should be displayed
#    Then I take screenshot
#
#    Scenario: Enter valid details and submit
#      Then I type "Deepa" into element with xpath "//input[@id='firstName']"
#      Then I type "Kiran" into element with xpath "//input[@id='lastName']"
#      Then I click on element with xpath "//span[contains(text(),'Save')"

#Vasily's code
#  Background:
#    Given I open url "https://quote-stage.portnov.com/"
#    Then I click on element with xpath "//button[@id='formSubmit']"

#    Scenario: Validate submission with empty fields
#    Then element with xpath "//label[@id='name-error']" should be displayed
#    Then element with xpath "//label[@id='username-error']" should be displayed
#    Then element with xpath "//label[@id='password-error']" should be displayed
#    Then element with xpath "//label[@id='password-error']" should be displayed
#    Then element with xpath "//label[@id='email-error']" should be displayed
#    Then element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should be displayed
#    Then I take screenshot
#
#    Scenario: Enter valid details and submit
#    Then I click on element with xpath "//input[@id='name']"
#    Then I type "Vasiliy" into element with xpath "//input[@id='firstName']"
#    Then I type "Seregin" into element with xpath "//input[@id='lastName']"
#    Then I click on element with xpath "//span[contains(text(),'Save')]"
#    Then I type "vasiliy.seregin" into element with xpath "//input[@name='username']"
#    Then I type "vasiliy.seregin@gmail.com" into element with xpath "//input[@name='email']"
#    Then I type "1234567890" into element with xpath "//input[@id='password']"
#    Then I type "1234567890" into element with xpath "//input[@id='confirmPassword']"
#    Then I switch to iframe with xpath "//*[@name='additionalInfo']"
#    Then I type "Test Person" into element with xpath "//input[@id='contactPersonName']"
#    Then I switch to default content
#    Then I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
#    Then I click on element with xpath "//button[@id='formSubmit']"
#    Then I wait for element with xpath "//legend[contains(text(),'Submitted Application')]" to be present
#    Then I take screenshot


  Scenario Outline: Quotes requests for users
    Given I open url "https://quote-stage.portnov.com"
    Then I click on element with xpath "//input[@id='name']"
    Then I type "<FirstName>" into element with xpath "//input[@id='firstName']"
    And I type "<MiddleName>" into element with xpath "//input[@id='middleName']"
    And I type "<LastName>" into element with xpath "//input[@id='lastName']"
    Then I click on element with xpath "//span[contains(text(),'Save')]"
    Then element with xpath "//input[@id='name']" should have attribute "value" as "<FullName>"
    Then I wait for 2 sec
    Examples:
      | FirstName | MiddleName | LastName | FullName                |
      | Test      | Testovich  | Testov   | Test Testovich Testov   |
      | John      |            | Doe      | John Doe                |
      | Artem     |            | Oganesyan| Artem Oganesyan         |
