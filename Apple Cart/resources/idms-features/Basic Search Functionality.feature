Feature: Basic Search Functionality (ID 231681 )

  Scenario: Display No shipments available message in Resolve tab
    Given IDMS user has shipments in Resolve page.
    When User selected Search By as "ISN" and enters Invalid ISN(ISN does not exist in the Resolve View) number "100333010"
    And click on search icon
    #Then Display message "ISN 100333010 is not available in Resolve at this time." in Resolve tab.
    Then Display message "No shipments available Resolve at this time." in Resolve tab.

  Scenario Outline: Display search results in Resolve tab
    Given IDMS user is logged in
    When User selected Search By as "<Search>" and enters valid ISN number.
    And click on search icon
    Then User will able to see results in Resolve tab.

    Examples: 
      | Search |
      | ISN    |
