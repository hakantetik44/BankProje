@UserStory003 @paralel2
Feature: Kayit sayfasi, parola kullanimini guvenli ve ust duzey bir parolayla kisitlamalidir.
    Background:
    And Kullanici bankasitesine gider
    Given user butonuna tiklaraa
    And registration sayfasina tiklaraa
    And  Password kutusuna tiklaraa
  @UserStory3-01
  Scenario: Daha guclu sifre için en az 1 kucuk harf olmali ve guvenlik seviye tablosunun kullanima gore degistigi gorulmelidir
    And kullanici bir tane kucuk harfi password kutusuna girer
    Then kullanici password strength renginin kirmizi oldugunu gorur

  @UserStory3-02
  Scenario:Sifre en az 1 buyuk harf icermeli ve guvenlik seviye tablosunun kullanima göre degistigi gorulmelidir.
    And kullanici bir tane buyuk harfi onceki sifrenin ardindan  password kutusuna girer
    Then  kullanici password strength renginin turuncu oldugunu gorur

  @Userstory3-03
  Scenario: Sifre en az 1 rakam icermeli ve güvenlik seviye tablosunun kullanima göre degistigi gorulmelidir.
    And kullanici bir tane rakami onceki sifrenin ardindan password kutusuna girer
    Then kullanici password strength renginin sari oldugunu gorur

  @Userstory3-04
  Scenario: Sifre en az 1 ozel karakter icermeli ve guvenlik seviye tablosunun kullanima göre degistigi gorulmelidir.
    And  kullanici bir tane ozel karakteri onceki sifrenin ardindan password kutusuna girer
    Then kullanici password strength renginin acik yesil oldugunu gorur
  @UserStory3-05
  Scenario: Sifre en az 7 karakterden olusmalidir.
    And Kullanici sifresini 7 karaktere tamamladiginda Password Strengh renginin koyu yesile dondugunu gorur.
    And Kullanici sifresini 7 karaktere tamamlar
    And Kullanici confirmation textbox kutusuna tiklar
    Then kullanici confirmation textbox kutusuna 7 karakterden olusan sifreyi girer