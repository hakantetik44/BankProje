@US0022States
Feature: System should allow to read states using api end point
  Background:
    Given User going to "https://www.gmibank.com/api/tp-states" api endpoint

  @US0022StatesStep1
  Scenario: Read all states and print
    And print this information in a data

  @US0022StatesStep2
  Scenario: save all states data using txt format
    And save this informations in a data

  @US0022StatesStep3
  Scenario: Read all states you created and validate them from your data set
    And validate this informations in a data