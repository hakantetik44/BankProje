@US_018
Feature: US018 Musterinin yonetilebilirligi

  Background: Gmi bank sayfasina giris yapma
    When US018 Admin  olarak Gmibank anasayfasina gider
    And US018 Giris butonuna tiklar
    And US018 Sign in butonuna tiklar
    And US018 Gecerli bir Adminusarname girer
    And US018 Gecerli bir Adminpassword girer
    And US018 Sign in ekranindaki sign in butonuna tiklar


  @TC01
  Scenario: TC01 Tum musterilerin musteri yonetme modulunde kullanici bilgileriyle birlikte gorulebilmesi

    Then US018 My Operations dropdown a tiklar
    Then US018 Manage Customers e tiklar
    And US018 Admin bu alana giris yetkisinin olmadigini gorur
    And US018 sayfayi kapatir


  @TC02
  Scenario:Tum Musterilerin gorulebilmesi

    When US018 Admin Administration butonuna tiklar
    Then US018 Admin User Management butonuna tiklar
    And  US018 View butonunun gorulebilirligini test eder
    And US018 View butonuna tiklar
    Then US018 musteri bilgilerini gorur
    And US018 musteri bilgileri sayfasinda Edit butonunu gorur
    And US018 sayfayi kapatir

  @TC03
  Scenario:Edit butonu gorulebilmesi

    When US018 Admin Administration butonuna tiklar
    Then US018 Admin User Management butonuna tiklar
    And US018 Edit butonunun gorulebilirligini test eder
    And US018 sayfayi kapatir

  @TC04
  Scenario: Edit portalinda guncelleme yapilabilmesi

    When US018 Admin Administration butonuna tiklar
    Then US018 Admin User Management butonuna tiklar
    Then US018 Edit butonuna tiklar
    Then US018 Admin onceden olusturulmus bir musteri bilgisinde degisiklik yapar
    And US018 Save butonuna tiklar
    And US018 basarili update yazisini gorur
    And US018 sayfayi kapatir

  @TC05
  Scenario: Adminin bir musterinin silebilmesi

    When US018 Admin Administration butonuna tiklar
    Then US018 Admin User Management butonuna tiklar
    Then US018 Admin delete butonuna tiklar
    And US018 Admin silmeden once eminmisiniz yazisini gorur
    And US018 sayfayi kapatir
