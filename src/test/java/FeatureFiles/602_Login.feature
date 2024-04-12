Feature: Login functionality

  Scenario: Login Account

  Given Navigate to ParaBank
    When Enter username and password and click login button
    Then User should login successfully


    Scenario:Login Fail

      Given Navigate to ParaBank
      When Enter invalid username and password and click login button
      Then User should not login successfully