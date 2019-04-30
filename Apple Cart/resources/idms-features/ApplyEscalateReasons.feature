Feature: IDMS:  Apply Escalate Reasons

  Scenario: 01-IDMS User Applies an Escalate Reason Code to a Shipment
    Given IDMS user has shipments in KeyView page.
    When IDMS user on Key View page
    When The user applies an Escalate reason code "Image" to the shipment in Key View
    Then The shipment is removed from the Shipment Key View and is not displayed in any of the views
    Then the Escalate Reason Code will be applied for the shipment
    Then the legacy backfill table will be updated with the escalate IDMS queue code "300" for the shipment
