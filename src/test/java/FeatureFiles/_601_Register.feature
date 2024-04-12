Feature: Register functionality
  @SmokeTest @Regression
  Scenario: Register new Account

    Given Navigate to ParaBank
    When Enter to the  Register
    Then User should See Sign Up Text
    And User sending the keys in Dialog
      | firstName        | boba      |
      | lastName         | amarth    |
      | address          | ankara    |
      | cityCustomer     | ankara    |
      | stateCustomer    | ankara    |
      | zipCode          | 06830     |
      | phoneCustomer    | 123456789 |
      | ssnCustomer      | 123456789 |
      | usernameCustomer | bobamarth |
      | passwordCustomer | 123456    |
      | passwordConfirm  | 123456    |


    And Click on the Element in Dialogs
      | registerButton |
    Then Register Success message should be displayed

