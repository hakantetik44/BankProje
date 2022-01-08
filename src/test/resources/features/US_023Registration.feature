@US_023Registrations
Feature: API registrations data okuma
  #https://www.gmibank.com/api/tp-account-registrations

  @US023_TC001
  Scenario: API registrationsdan data alma ve okuma
    * Sistem API registrations end pointe gidip "https://www.gmibank.com/api/tp-account-registrations" datalari alacak
    * Sistem tum registrations datalarini alir.
    * Sistem aldigi tum registrations datalarini okur.
    * Sistem aldigi tum registrations datalarini kaydeder.
    * Sistem aldigi tum registrations datalarini dogrular.

  @US023_TC002
  Scenario: API registrationsdan data alma ve okuma
    * Sistem aldigi tum registrations datalarini tek tek dogrular "https://www.gmibank.com/api/tp-account-registrations"
