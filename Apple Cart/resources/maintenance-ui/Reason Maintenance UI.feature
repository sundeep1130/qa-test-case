Feature: IDMS : Reason Maintenance UI

  Scenario: Display all IDMS Reasons to a IDMS User
    Given A logged in IDMS User
    When The IDMS User navigates to the IDMS Reason Maintenance screen
    Then All IDMS Reasons are displayed to the user

  Scenario Outline: IDMS User Creates a  Reason
    Given A logged in IDMS User
    When The IDMS User navigates to the IDMS Reason Maintenance screen
    And the user clicks on Add Reason button
    And The user enters the reason "<Reason>"
    And The user selects the parent reason "<Parent_Reason>"
    And select the applicable flag "<Flag>" in the New Reason dialog
    When The user clicks on Submit button
    Then a "Successful!" message is displayed
    Then The new reason "<Reason>", parent reason "<Parent_Reason>" and flag "<Flag>" is shown in the List of Available Reason Codes

    Examples: 
      | ATT_TestID | Reason        | Parent_Reason | Flag               |
      |      10012 | Test Reason01 | Weight        | Image Reason       |
      |      10013 | Test Reason02 | Korea         | Escalate Reason    |
      |      10012 | Test Reason03 | Small         | Specialized Reason |

  Scenario Outline: IDMS User Edits an existing Reason
    Given A logged in IDMS User
    When The IDMS User navigates to the IDMS Reason Maintenance screen
    And Selects a Reason "<Reason>" to modify from the list of Reasons displayed
    And The user edits the parent reason "<Parent_Reason>"
    And edit the applicable flag "<Flag>" in the New Reason dialog
    When The user clicks on Submit button
    Then a "Successful!" message is displayed
		Then The edited reason "<Reason>", parent reason "<Parent_Reason>" and flag "<Flag>" is shown in the List of Available Reason Codes
    Examples: 
      | ATT_TestID | Reason        | Parent_Reason | Flag               |
      |      10021 | Test Reason01 | Korea         | Escalate Reason    |
      |      10022 | Test Reason02 | Small         | Specialized Reason |
      |      10023 | Test Reason03 | Weight        | Image Reason       |
      