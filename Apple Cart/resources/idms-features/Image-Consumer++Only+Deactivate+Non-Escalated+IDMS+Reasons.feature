Feature: Image-Consumer : Only Deactivate Non-Escalated IDMS Reasons
  		
	Scenario: Deactive IDMS Reasons ,when a new image is recieved for an imaged reason shipment
  Given an imaged reason shipment
  When an image is recieved for the shipment
  Then Deactivate all non-escalate type IDMS reasons for that shipment.
  Then this shipment to reappear in the Key Queue

Scenario: Deactive IDMS Reasons ,when a new image is recieved for an Specialized reason shipment
  Given an Specialized reason shipment
  When an image is recieved for the shipment
  Then Deactivate all non-escalate type IDMS reasons for that shipment.
  Then this shipment to reappear in the Key Queue

Scenario: Deactive IDMS Reasons ,when a new image is recieved for an Escalate reason shipment
  Given an Escalate reason shipment
  When an image is recieved for the shipment
  Then remove this shipment from IDMS permanently. 
  Then the shipment will still have the active Escalated Reason applied and not show up in IDMS.
  
  


