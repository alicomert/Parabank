Feature: Update contact info

  Scenario: Change the Contact Information

    Given Navigate to ParaBank
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the Element in LeftNav
      | UpdateContact |
    And User delete the Element from Dialog and Clear
      | firstName     | bobaa     |
      | lastName      | amartha   |
      | address       | ankaraa   |
      | cityCustomer  | ankaraa   |
      | stateCustomer | ankaraa   |
      | zipCode       | 0231      |
      | phoneCustomer | 321654987 |
    And Click on the Element in Dialogs
    |updateButton|

    Then User should See Profile Update Text
