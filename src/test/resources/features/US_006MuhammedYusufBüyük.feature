@us_006
Feature: us_006 Kullanıcı ayarlarına girildiğinde isim soyisim email ve dil seceneklerinin değiştirilebildiğini kontrol et

  @tc_601
  Scenario Outline: tc_601 "ad, soyadı e-postası ve dili" textlerinde  kullanıcının kayıtlı bilgileri ekrana gelmelidir
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Kayıtlı bir Username bilgisini girer.
    Then Kayıtlı bir password bilgisini girer.
    Then Singin ekranındaki sing in butonuna tıklar
    Then Ana sayfada sağ üstte bulunan user iconuna tıklar
    Then user info linkine tıklanır.
    Then "<first_name>""<last_name>""<email>" ve"<language>" bölümlerindeki kullanıcı bilgilerinin görünür olduğu kontrol edilir
    And  Sayfayi kapatilir.
    Examples:
      |first_name|last_name|email              |language|
      |ali       |kartal   |alikartal@gmail.com|en      |

  @tc_602
  Scenario:tc_602 "İngilizce ve Türkçe" olmak üzere 2 dil seçeneği mevcut olmalıdır.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Kayıtlı bir Username bilgisini girer.
    Then Kayıtlı bir password bilgisini girer.
    Then Singin ekranındaki sing in butonuna tıklar
    Then Ana sayfada sağ üstte bulunan user iconuna tıklar
    Then user info linkine tıklanır.
    Then Language dropbox ından türkçe dili seçilir ve kaydet butonuna basılır
    And  Sayfayi kapatilir.

  @tc_603
  Scenario: tc_603 Adı güncelleme seçeneği olmalıdır.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Dogru Username bilgilerini girer.
    Then Dogru password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar
    Then Ana sayfada sağ üstte bulunan user iconuna tıklar
    Then user info linkine tıklanır.
    Then First Name text box'ına farklı bir isim girilir ve kaydedilir
    And  Sayfayi kapatilir.

  @tc_604
  Scenario: tc_604 Soy isim güncelleme seçeneği olmalıdır.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Dogru Username bilgilerini girer.
    Then Dogru password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar
    Then Ana sayfada sağ üstte bulunan user iconuna tıklar
    Then user info linkine tıklanır.
    Then Last Name text box'ına farklı bir isim girilir ve kaydedilir
    And  Sayfayi kapatilir.

  @tc_605
  Scenario: tc_605 "@" ve "." işaretleri içeren yeni e-posta adresi ile güncellenebilir olmalı
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Dogru Username bilgilerini girer.
    Then Dogru password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar
    Then Ana sayfada sağ üstte bulunan user iconuna tıklar
    Then user info linkine tıklanır.
    Then Email text box'ına farklı bir mail girilir ve kaydedilir
    And  Sayfayi kapatilir.