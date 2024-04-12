Feature: Money Transfer and Verification Between My Accounts

  Scenario: Completing and verifying a money transfer between accounts
    Given the user is on the Parabank website
    And the user has logged in
    When the user clicks on the Transfer Funds link from the menu
    And the user selects a sender account and a receiver account
    And the user enters an amount to transfer
    And the user clicks on the Transfer button
    Then the system confirms that the money transfer process has been successfully completed
    Then the system confirms that the user transfer is verified and the amount is correct
