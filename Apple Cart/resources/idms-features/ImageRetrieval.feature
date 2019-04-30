Feature: IDMS Rewrite : Image Retrieval

Scenario: Display the image for a shipment
	Given The IDMS user is logged in 
	When A shipment is loaded for the IDMS user to work
	Then The image for the shipment is displayed in a new window

Scenario: Reload the image for a shipment
	Given The logged in IDMS user working on a shipment
	When The IDMS user clicks on "Image" button
	Then The image for the shipment is displayed in a new window

Scenario: Display the error message in a new window
	Given The logged in IDMS user working on a shipment
	When The IDMS user clicks on "Image" button
	Then "EDM Images Not Available" message is displayed in a new window