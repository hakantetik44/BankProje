@US025
Feature: Sistem, api endpoint kullanarak yeni ülkeler oluşturmaya izin vermelidir
  @TC2501
  Scenario Outline: Country olusturma
    And kullanici api end point "https://www.gmibank.com/api/tp-countries" den "<country>" ve "<name>" kullanarak ulke olusturur
    Examples: country olusturma
      |country|name|
      |name|parisli|
      |name|hakkarili|
      |name|trabzonlumuyubu|


  @TC2502
  Scenario: Country dogrulama

    And kullanici "https://www.gmibank.com/api/tp-countries" endpointinde olusturulan ulkeleri dogrular