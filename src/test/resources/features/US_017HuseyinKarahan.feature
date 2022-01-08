@US_017
Feature:Sistem, Adminin kullanıcıları yönetmesine izin vermelidir.

  Background: Sayfa acilir
    Given Huseyin admin gmibank sayfasina  gider
    And   Huseyin menu  sayfasindaki person  simgesine tiklar
    And   Huseyin sign in baglantisina tiklar
    And   Huseyin acilan sayfadan username kutusuna gecerli bir kullanici adi yazar
    And   Huseyin acilan sayfadan password  kutusuna gecerli bir sifre yazar
    And   Huseyin sign in buttonuna tiklar
    And   Huseyin acilan sayfadan administration buttonuna  tiklar
    And   Huseyin menuden user manegment baglantisina tiklar



  @TC1_2_3_4
  Scenario Outline: Hüseyin Admin bir rolü user employe manager admin olarak etkinlestirebilir
    When  Huseyin acilan sayfadan kayitli kullanicilardan herhangi birinin  edit buttonuna  tiklar
    Given Huseyin profillerden "<profil>" secenegini secer
    And   Huseyin Save buttonuna tiklar
    And   Huseyin Kullanici bilgilerine ulastigini dogrular
    And   Huseyin  Sayfayi kapatir

    Examples:
      |profil|
      |user |
      |employee  |
      |manager  |
      |admin  |
      |customer |


  @TC5
  Scenario Outline:Huseyin Yönetici tüm kullanıcı bilgilerini görebilir admin, manager, employee and user
    When  Huseyin acilan sayfadan kayitli kullanicilardan herhangi birinin  edit buttonuna  tiklar
    Given Huseyin admin kayitli kisinin profil böümünde "<profil5>", "<profil6>","<profil7>","<profil8>" ün görülebilir oldugunu dogrular
    And   Huseyin  Sayfayi kapatir


    Examples:
      |profil5|profil6|profil7|profil8|
      |user | employee  |  manager  |   admin  |



  @TC_6
  Scenario: Yonetici tum kullanici bilgilerini düzenleyebilir admin, manager, employee and user

    Given Huseyin Kullanicilardan admin secer ve kullanicilardan birinin edit buttonuna tiklar
    And   Huseyin Acilan sayfada kullanicilardan birinin ismini degistirir
    And   Huseyin Save buttonuna basar
    And   Huseyin Degisikligin gerceklestigini dogrular
    And   Huseyin  Sayfayi kapatir



  @TC_7
  Scenario: Yonetici tum kullanici bilgilerini silebilir admin, manager, employee and user
    Given Huseyin Kullanicilardan bir manager secer ve sil buttonuna tiklar
    And   Huseyin silme islemini onayla butonuna tiklar
    And   Huseyin silme isleminin onaylandigi yazisini gorur
    And   Huseyin  Sayfayi kapatir