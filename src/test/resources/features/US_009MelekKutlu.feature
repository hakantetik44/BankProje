@melek @smoke
Feature: US09 Create A New Customer Feature
  Scenario:
    Given mkullanici gmibank login sayfasina gitmeli
    Then  musername box "employee32" girilmeli
    Then  mpassword box "team32team32-" girilmeli
    Then msign in click yapabilmeli
    Then mmy operations click yapabilmeli
    Then  mmanage customers click yapabilmeli
    Then mcreate a new customer click yapabilmeli
    Then mSSN "541-01-4572" girilmeli
    Then  msearch button a click yapabilmeli
    Then msuccess search verify
    And mfirstname box value getirmeli
    And  mlastname box una value getiremli
    And mmiddle initial box una girilmeli
    And  memail box value getirmeli
    And  mmobile phone number value getiremli
    And  mphone number box ayni no girilmeli
    And mzip code box una zip code girilemli
    And madress box value getirmeli
    And mcity box una sehir girilmeli
    And  mphone ssn box value getirmeli
    And mcreate date box value getirmeli
    And mcountry box una ulke girilmeli
    And mstate box una state girilmeli
    And musers box una kullanici adi girilmeli
    And maccount box undan account secilmeli
    And msave button ununa click yapmali
    And myeni musteri create ettigi verify edilmeli
