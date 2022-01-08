@gmi
Feature: US12 Createa A New Customer Featurea

  @verifyButtons
  Scenario: Butonlarına kontorü
    Given kullanicia gmibank login sayfasina gitmeli
    Then  usernamea box "employee32" girilmeli
    Then  passworda box "team32team32-" girilmeli
    Then signa in click yapabilmeli
    Then mya operations click yapabilmeli
    Then  managea customers click yapabilmeli
    And kullanicia manageCustomers sayfasındaki view kontrol eder
    And kullanicia manageCustomers sayfasındaki edit kontrol eder
    And kullanicia manageCustomers sayfasındaki delete kontrol eder
    Then createa a new customer click yapabilmeli
    Then SSNa "541-01-4572" girilmeli
    Then  searcha button a click yapabilmeli
    Then successa search verify
    And firstnamea box value getirmeli
    And  lastnamea box una value getiremli
    And middlea initial box una girilmeli
    And  emaila box value getirmeli
    And  mobilea phone number value getiremli
    And  phonea number box ayni no girilmeli
    And zipa code box una zip code girilemli
    And adressa box value getirmeli
    And citya box una sehir girilmeli
    And  phonea ssn box value getirmeli
    And createa date box value getirmeli
    And countrya box una ulke girilmeli
    And statea box una state girilmeli
    And usersa box una kullanici adi girilmeli
    And accounta box undan account secilmeli
    And savea button ununa click yapmali
    And yenia musteri create ettigi verify edilmeli





