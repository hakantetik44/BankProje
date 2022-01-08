@US015
Feature: Sistem, kullanicinin kendi hesabini yonetmesine izin vermelidir.
  Background:
    When Kullanici gmibank sayfasina gider ve basarili bir sekilde customer girisi yapar.
    And Kullanici my operation butonuna tıklar.
    And Kullanici my accounts butonuna tiklar.

    @TC001_US015
    Scenario: Kullanici tum hesap turlerini ve o hesaplardaki bakiyeyi gormelidir.
      And Kullanici Customer Accounts sayfasini goruntuleyebilmelidir.
      And Kullanici account type kisimini goruntuleyebilmelidir.
      And Kullanici account balance kisimini goruntuleyebilmelidir.
      Then ve sayfa kapanir.

    @TC002_US015
    Scenario: Kullanici, hesap islemlerini goruntuleyebilmelidir.
      And Kullanici hesap islemlerini gormek istedigi hesabin view transaction butonuna tiklar.
      And Kullanici description, date, amount, newbalance kisimlarini gorebilmelidir.
      Then ve sayfa kapanir.





