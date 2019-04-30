Feature: IDMS:  Specialized Reasons and Views
  Scenario: Specialized View is displayed in the UI
    Given The IDMS user is on HomePage
    When IDMS user is on HomePage
    Then A "Specialized" tab is visible

  Scenario: Shipments with an active Specialized Reason Code should only appear in the Specialized View.
    Given IDMS user has shipments in KeyView page.
    When IDMS user on Key View page
    And The User applies a Specialized reason "Multi-Item" to a shipment in Key View
    Then The shipment is visible in the Specialized View and is NOT visible in the Key and Resolve Views
    Then the Specialized Reason Code will be activated for the shipment and all other reason codes will be deactivated for the shipment
