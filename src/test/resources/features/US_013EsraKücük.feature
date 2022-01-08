

Feature: Bir Müşteri yeni bir banka hesabı(Account) oluşturabilir.


  Background: kullanici hesap olusturmak icin giris yapar

    Given Employee "gmiBankUrl"anasayfaya gider
    And Signin butonunu tıklar
    And My Operations butonuna tıklar
    And Manage Accounts butonuna tiklar
    And Create a new Account butonuna tiklars
#Account Type
#CHECKING
#Account Status Type
#ACTIVE
#Create Date
#19.12.2021 00:00
#Closed Date
#19.12.2021 00:00
#Employee

@esra
  Scenario: TC_001 Kullanıcı yeni hesap için bir açıklama girmelidir. Bu kısım boş bırakılamaz.
    Given Kullanici description bölümünü bos birakir ve bir alt bölümdeki balance kismina tiklar
    And Description alt kisminda "This field is required." yazisinin göründügünü dogrular
    Then Kullanici Sayfayi kapatir


    Scenario: TC_002 Kullanıcı, ilk kez hesap oluşturmak için Dolar olarak bir bakiye sağlamalıdır.
      Given Kullanici description kismina bir yazi girer
      When Kullanici balance kismina dolar ibaresiyle birlikte bir miktar girmelidir
      And Kullanici Account Type dropdowndan bir hesap türü secer
      And  Kullanici Account Status Type dropdowndan bir statu secer
      And Kullanici createdate kismina gecerli güncel  "tarih" girer
      And Kullanici closedate kismina gecerli güncel "tarih" girer
      And Kullanici saves butonuna basar
      And yapilan kayit sonucu dolar ibareli bir ücret kaydeldigi dogrulanir
      Then Kullanici Sayfayi kapatir




      Scenario: TC_003 Kullanıcı CHECKING, SAVING, CREDIT_CARD veya INVESTING olarak bir hesap türü seçebilir.
        Given Kullanici Account Type dropdownda yer alan hesaplarin secilebilir oldugunu dogrular
        Then Kullanici Sayfayi kapatir

  Scenario: TC_004 Hesap durumu AKTİF(ACTIVE), ASKIYA ALINDI(SUSPENDED) veya KAPALI(CLOSED) olarak tanımlanmalıdır.
    Given Kullanici description kismina bir yazi girer
    When Kullanici balance kismina dolar ibaresiyle birlikte bir miktar girmelidir
    And Kullanici Account Type dropdowndan bir hesap türü secer
    And  Kullanici Account Status Type dropdowndan bir statu secer
    And Kullanici createdate kismina gecerli güncel  "tarih" girer
    And Kullanici closedate kismina gecerli güncel "tarih" girer
    And Kullanici saves butonuna basar
    Then Kullanici Sayfayi kapatir

  Scenario: TC_005 Kullanıcı açılır menüden bir çalışan seçebilir / İsteğe bağlı.
    Given kullanici employee bölümünde calisan isimleri görüntülendigini dogrular
    Then Kullanici Sayfayi kapatir