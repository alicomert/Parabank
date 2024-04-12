Feature: Update contact functionality

  Background:
    Given Navigate to ParaBank
    When Enter username and password and click login button
    Then User should login successfully
    Given Click on the Element in LeftNav
      | UpdateContact |
    Scenario:

      And Navigate to the update contact info
      When The user enters new information in the relevant fields
      Then Click the update profile button to save user updates
      And User should login successfully

      

