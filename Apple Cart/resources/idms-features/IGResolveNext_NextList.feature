Feature: IDMS: IG Resolve Next/Next List

  Scenario: 01-IDMS User applies a reason code to a single shipment in the IG Resolve View
    Given IDMS user has shipments in Resolve page.
    When IDMS user on IGResolve View page
    When The IDMS User clicks the 'Next' button
    When The user applies a reason "Prohibited Country" to the shipment in Resolve
    Then The selected reasons will only be applied to the currently active shipment
    Then the currently active shipment will be removed from the Summary Table
    And load the next active shipment from the Summary Table
    And if there are no other shipments in the Summary Table, load the next group of prioritized shipments to the IDMS user

  Scenario: 02-IDMS User applies a reason code to a group of shipments in the IG Resolve View
    Given IDMS user has shipments in Resolve page.
    When IDMS user on IGResolve View page
    When The IDMS User clicks the 'Next List' button
    When The user applies a reason "Prohibited Country" to the shipment in Resolve
    Then The selected reasons will be applied to all of the shipments in the Summary Table
    And load the next group of prioritized shipments to the IDMS user

  
