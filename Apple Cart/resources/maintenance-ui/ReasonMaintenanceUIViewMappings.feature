Feature: IDMS : Reason Maintenance UI, mapping Reasons To Views
  
  Scenario Display all existing views to a IDMS User 
  Given A logged in IDMS User 
  When The IDMS User navigates to the View Mappings screen
  Then All the existing views with available reasons are displayed
  
  Scenario Map an unmapped reason to the views
  Given A logged in IDMS User navigates to the View Mappings screen
  When The user Selects a reason from the list of Unmapped Reasons
  And The user selects the views to which the reason should be available for
  And The user clicks a submit button
  Then  A "Successful" message is displayed 
  And the new reason is displayed in the Views
  
  Scenario : Add a reason to the view
  Given A logged in IDMS User navigates to the View Mappings screen
  When The user clicks on "Add Reason" above the view
  And The user selects a reason from the list of reasons
  And The user clicks a submit button
  Then  A "Successful" message is displayed 
  And the newly added reason is displayed in the View
  
  Scenario  Delete a reason from the view
  Given A logged in IDMS User navigates to the View Mappings screen
  When The user clicks on "Delete Reason" button beside the reason in a view
  And The user confirms the deletion
  Then  A "Successful" message is displayed 
  And the reason is removed from the View
