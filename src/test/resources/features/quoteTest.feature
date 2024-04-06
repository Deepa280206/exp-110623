Feature: Quote tests

  Scenario: (Smoke Test) Fill Out the required fields of Quote and arrive on the Confirmation Page
    Given I visit Quote Page in the "Stage" Environment
    Then I enter "Test" in the UserName field
    And I enter "Deepa" for the first name and "Kiran" for the last name in the Name field
#    And I enter "test@gmail.com" for the Email field
#    When I enter "12345" for the Password field
#    And I enter "12345" for the Confirm Password field
#    Then I "check" the Privacy Policy Checkbox
#    When I click on the "" button at the bottom of the Page
#    Then I verify we see the Submitted Application Page

