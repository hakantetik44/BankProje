@CountryApi21
Feature: SunaCountry Okuma ve Validate

  @CountryOkumaTC_001
  Scenario: SunaCountry Okuma ve Dogrulama
    Given SunaKullanici gmibank api "https://www.gmibank.com/api/tp-countries" ulke bilgilerine gider
    And SunaKulanici ulke datalarini alir
    And SunaKullanici ulke datalarini kaydeder
    And SunaKullanici ulke datalarini validate eder

