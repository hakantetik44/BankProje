Feature: Musteri Api Control

  Scenario: Tum musterileri okumaliyim ve verifiy etmeliyim
    Given Sistem  endpoint ile token alir  "https://gmibank.com/api/authenticate"
    Then Sistem aldigi datalari okur "https://www.gmibank.com/api/tp-customers"
    Then Sistem Customer datalarini verify eder