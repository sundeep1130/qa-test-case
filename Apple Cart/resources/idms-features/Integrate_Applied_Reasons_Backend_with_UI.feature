Feature: Active applied IDMS reasons to Shipments

  Scenario: Update Shipment Key View Count
    Given IDMS user on Key View page
    When User applies a reason to a shipment
    Then Shipment Key View Count get updated

  Scenario: Apply Reasons to Shipments from the Key View
    Given IDMS user is on HomePage
     When IDMS user on Key View page
    When User applies a reason "Korea" to a shipment
    Then The shipment no longer resides in the Shipment Key View.

  Scenario: Apply Reasons to Shipments from a populated Key View
    Given IDMS user is on HomePage
    When IDMS user on Key View page
    And the Key View has more than 1 shipment available
    When User applies a reason "Korea" to a shipment
    Then The shipment no longer resides in the Shipment Key View
    And the next shipment in the Key View is displayed to the user

  Scenario: Apply Reasons to Shipments from a unpopulated Key View
    Given Key View page has only one shipment
     When IDMS user on Key View page
    And the Key View only has 1 shipment
    When User applies a reason "Korea" to a shipment
    Then The shipment no longer resides in the Shipment Key View
    Then display : "No shipments available in IG Key at this time."

  Scenario: Display No shipments message in Key View
    Given Key View page doesnt have shipments
    When IDMS user on Key View page
    When There are no shipments in the IDMS Key View
    Then display : "No shipments available in at this time."

  Scenario: Display Mapped reasons to the Key View
    Given IDMS user is on HomePage
    When IDMS user on Key View page
    Then verify Key View count
    When User applies a reason to a shipment
    Then all of the reasons mapped to the Key View are displayed.
