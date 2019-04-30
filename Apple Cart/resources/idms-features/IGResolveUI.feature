Feature: IDMS : IG Resolve UI

  Scenario: Shipments with an active reason codes that are not flagged as Image, Escalate or Specialized should only appear in the IG Resolve View.
    Given A shipment has an active resolve reason code assigned to the shipment.
    When The IDMS application is displayed
    Then The shipment is visible in the Resolve View and is NOT visible in the Key and Specialized Views

  Scenario: Shipment Resolve View is displayed in the UI
    Given Shipments from the same shipper that have active reasons mapped to the IG Resolve View
    When The IDMS User navigates to the IG Resolve View
    Then Shipments will be grouped by shippers that have shipper contacts with the same FedEx Account Number
    And the resolve view will contain a summary table of all the grouped shipments
    And the summary table will include ISN, Master Track Id, Recipient Name, Recipient City, Most recent active reason, when the most recent active reason was applied
    And by default, the first shipment in the summary tables details will be displayed
    And the IDMS user can view other shipment detail information by clicking on the rows of the summary table
    And the shipment details will be displayed in the same maner as they are displayed in the IG Key View
