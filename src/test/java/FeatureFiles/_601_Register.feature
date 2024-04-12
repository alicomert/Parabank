Feature: Register functionality

  Scenario Outline: Successful Registration

    Given Navigate to ParaBank
    When Register button is clicked
    And Enter first name "<firstName>"
    And Enter sur name"<surName>"
    And Enter address "<address>"
    And Enter city "<city>"
    And Enter state "<state>"
    And Enter zipcode "<zipCode>"
    And Enter ssn "<SSN>" (social security number)
    And Enter username "<username>"
    And Enter password "<password>"
    And Enter the confirmation of "<password>"
    And Click the register button
    Then Should see "Your account was created successfully. You are now logged in." message
    Examples:
      | firstName | surName  | address          | city          | state       | zipCode | SSN       | username         | password       |
      | Emily     | Johnson  | 1234 Forest Lane | Willow Creek  | Montana     | 59760   | 231254634 | willowcreekuser2 | CreekPass@2024 |
      | Michael   | Smith    | 5678 Beach Blvd  | Ocean Springs | Mississippi | 39564   | 412345231 | oceansprings2025 | OceanPass#567  |
      | Olivia    | Williams | 910 Pearl Street | Boulder       | Colorado    | 80302   | 512341623 | boulderuser4     | Boulder123!    |


