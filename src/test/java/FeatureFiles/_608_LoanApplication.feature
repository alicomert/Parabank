Feature: Loan Functionality


  Scenario Outline: Loan Applicaiton

    Given Navigate to ParaBanka
    When Enter username and password and click login buttonss
    Then User should login successfullys
    And Click on the Element in Dialogss
      | RequestLoan |
    And User sending the keys in Dialoga
      | loanAmount  | <loanA> |
      | downPayment | <downP> |

    And Click on the Element in Dialogss
      | applyNowButton |
    Then User should see Loan Approved
    And Click on the Element in Dialogss
      | newAccountID |
    Then User Should see No Transaction Text
    Examples:
      | loanA | downP |
      | 250   | 150   |


  Scenario Outline: Loan Applicaiton Decline

    Given Navigate to ParaBanka
    When Enter username and password and click login buttonss
    Then User should login successfullys
    And Click on the Element in Dialogss
      | RequestLoan |
    And User sending the keys in Dialoga
      | loanAmount  | <loanA> |
      | downPayment | <downP> |

    And Click on the Element in Dialogss
      | applyNowButton |
    Then User should see Loan Decline Text

    Examples:
      | loanA | downP |
      | 25000   | 15000   |