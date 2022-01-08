

Feature: US_26 System should allow to update countries using api end point

  Scenario: User can just update each country
    Given use api end take token and go to endpoint
    And use post new country verify new country