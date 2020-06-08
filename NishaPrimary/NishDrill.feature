@ALL
Feature: Techfish_Nisha
  I want to check my Primary and Savings Balance_Nisha

  @tag1
  Scenario Outline: User login_Nisha
    Given Open the URL_Nisha
    When when i enter username and password as password "<userdata>"_Nisha
    And Navigate to Savings Balance_Nisha
    Then close_Nisha1

    Examples: 
      | userdata |
      |        0 |
      |        1 |
     

  @tag2
  Scenario Outline: Check Primary Balance
    Given login with credentials "<userdata2>"_Nisha
    When click on view1 details_Nisha
    And enter the filter criteria_db
    Then close_Nisha

    Examples: 
      | userdata2 |
      |         0  |
      |         1  |
      |         2  |
      |         3  |
      |         4  |
