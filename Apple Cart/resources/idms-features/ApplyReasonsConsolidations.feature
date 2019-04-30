Feature: IDMS:  Apply Reasons to a Consolidated Shipment (ID 220663)

  Scenario: IDMS User Applies a Reason Code to a IGC 
    Given Consolidation page has shipments.
    When IDMS user on IGCKey View page
    When The user applies a reason "Cannot Data Enter" to the consolidation shipment
    Then The consolidation is removed from the Consolidation Key View and is not displayed in any of the views
    #And the reason code will be activated for the consolidation
    And the legacy backfill table will be updated with the consolidation resolve IDMS queue code "250" for all of shipments in the consolidation
