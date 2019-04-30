Feature: Image-Consumer : Only Deactivate Non-Escalated IDMS Reasons
  
  Scenario : Deactive IDMS Reasons when a new image is recieved
  Given a shipment
  When an image is recieved for the shipments
  Then Deactivate all non-escalate type IDMS reasons for that shipments
  
  Scenario : when Escalate reason is applied to a shipment, it will remove this shipment from IDMS permanently
  Given IDMS user has shipments in KeyView page.
    When IDMS user on Key View page
    When The user applies an Escalate reason to the shipment in Key View
    Then The shipment is removed from the Shipment Key View and is not displayed in any of the views
    Then the Escalate Reason Code will be applied for the shipment
   
    Then the legacy backfill table will be updated with the escalate IDMS queue code "300" for the shipment
