Feature: Verify No shipments avaiable message in IDMS views

Scenario Outline: IDMS User see No shipments available message in Key view
    Given IDMS user has no shipments in "<View>" page.
    When IDMS user on "<View>" page.
		Then  "<No shipments message>" message.
 Examples: 
     | View        			| No shipments message 																			|
     | Key				 			| No shipments available in Key at this time.								|
     | Resolve		 			| No shipments available in Resolve at this time.   				|
     | Specialized 			| No shipments available in Specialized at this time.   		|
     | NB_Consolidation	| No shipments available in NB Consolidation at this time.  |
     | SB_Consolidation | No shipments available in SB Consolidation at this time.  |