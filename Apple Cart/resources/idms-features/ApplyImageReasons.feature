Feature: IDMS:  Apply Image Reasons (ID 218166)

  Scenario: IDMS User Applies an Image Reason Code to a Shipment
    Given IDMS user has shipments in KeyView page.
    When IDMS user on Key View page
    And The user applies an image reason code "Illegible" to the shipment in Key View
    Then The shipment is removed from the Shipment Key View and is not displayed in any of the views
    Then the Image Reason Code will be applied for the shipment
    Then the legacy backfill table will update the re-image flag to 'Y' for the shipment
