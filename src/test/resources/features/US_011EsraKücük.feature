

Feature: Employee olarak yeni bir müsteri olusturulma sirasinda güncel tarih girisinin kontrolu

  Background: Müsteri olustururken tarih kismi güncel  bir tarih girilir ve kayit yapildigi dogrulanir

    Given Employee "gmiBankUrl"anasayfaya gider
    And Signin butonunu tıklar
    And My Operations butonuna tıklar
    And Manage Customers butonuna tıklar
    And Create a new Customer butonuna tıklar


Scenario Outline: TC_001 Müsteri olustururken tarih kismi daha gec ya da daha erken bir tarih olamaz

  And "<Ssn>" "<First Name>"  "<Last Name>" "<Middle Initial>" "<Email>" "<Mobile Phone Number>" "<Phone Number>" "<Zip Code>" "<Address>"  "<City>" "<SsnIkinciGiris>"  "<State>" bilgilerini girer
And "<Create Date>" kismina mevcut güncel tarihten daha eski bir tarih girilir
  And Country dropdowndan ülke secilir
  And User dropdowndan kayıtlı bir kullanıcı adini sefer
  And Account kısmından kayirli bir hesap adi secer
  And  Zelle Enrolled kutucuğunu işaretler
  Then Save butonuna tıklar
  #  Then sayfayi kapatir

  Examples:
  |Ssn  |First Name|Last Name|Middle Initial |Email|Mobile Phone Number|Phone Number|Zip Code|Address|City|SsnIkinciGiris|State|Create Date|
  |282-47-9231|Marry|Christmas | Can | chrts@gmail.com | 123-456-6789 | 123-456-6789 | 2345 |Ehrenfelstrasse|Strasbourg|282-47-9231|germany|15.03.2021|


  Scenario Outline: TC_002 Tarih ay, gün, yıl, saat ve dakika olarak oluşturulmalıdır.

    Given "<Ssn>" "<First Name>"  "<Last Name>" "<Middle Initial>" "<Email>" "<Mobile Phone Number>" "<Phone Number>" "<Zip Code>" "<Address>"  "<City>" "<SsnIkinciGiris>"  "<State>" bilgilerini girer
    And Kullanici bir tarih ay gün yil saat ve dakika olarak tarih girer
    And Country dropdowndan ülke secilir
    And User dropdowndan kayıtlı bir kullanıcı adini sefer
    And Account kısmından kayirli bir hesap adi secer
    And Zelle Enrolled kutucuğunu işaretler
    Then Save butonuna tıklar ve beklenen sekliyle kayit yapildigini dogrular
  #  Then sayfayi kapatir
    Examples:
      |Ssn  |First Name|Last Name|Middle Initial |Email|Mobile Phone Number|Phone Number|Zip Code|Address|City|SsnIkinciGiris|State|Create Date|
      |137-95-9142|Marry|Christmas | Divine | torzi@gmail.com | 123-456-6789 | 123-456-6789 | 2345 |Schlafenstrasse|georgia|137-95-9142|germany|15.03.2021|


  Scenario Outline: TC_003 Kullanıcı kayıtlı kullanıcılardan bir kullanıcı seçebilir ve bu kısmı boş bırakamaz.

    Given "<Ssn>" "<First Name>"  "<Last Name>" "<Middle Initial>" "<Email>" "<Mobile Phone Number>" "<Phone Number>" "<Zip Code>" "<Address>"  "<City>" "<SsnIkinciGiris>"  "<State>" bilgilerini girer
    And Kullanici bir tarih ay gün yil saat ve dakika olarak tarih girer
    And Country dropdowndan ülke secilir
    And User dropdown kismini bos birakir
    And Account kısmından kayirli bir hesap adi secer
    And Zelle Enrolled kutucuğunu işaretler
    Then Save butonuna tıklar
    Then Kullanici Sayfayi kapatir


    Examples:
      |Ssn  |First Name|Last Name|Middle Initial |Email|Mobile Phone Number|Phone Number|Zip Code|Address|City|SsnIkinciGiris|State|
      |932-95-1142|Marry|Christmas | Divine | torzi@gmail.com | 123-456-6789 | 123-456-6789 | 2345 |Schlafenstrasse|georgia|932-95-1142|germany|


    Scenario:TC_004 Bu kısımda kullanıcı, hesapları yönetmek için oluşturulan bir hesabı seçebilir.

      Given kullanici Account kismindaki hesaplarin secilebilir oldugunu dogrular
  @gmik
Scenario: TC_005  Kullanıcı isteğe bağlı olarak Zelle Enrolled seçeneğini seçebilir ve kaydedebilir.
  Given Zelle Enrolled kutucuğunu işaretler
  And Zelle Enrolled kutucugunun secilebilir oldugu test edilir
  Then Kullanici Sayfayi kapatir