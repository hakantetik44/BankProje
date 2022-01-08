@us_005
Feature: us_005 Geçersiz kullanıcı bilgileriyle sisteme login olunamamalıdır.

  @tc_501
  Scenario: tc_501 Kullanici, hata mesaji ile gecersizligi dogrulanan kullanici adiyla giris yapamaz.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Yanlis Username bilgilerini girer.
    Then Dogru password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder
    And  Sayfayi kapatilir.

  @tc_502
  Scenario: tc_502 Kullanici, hata mesaji ile gecersizligi dogrulanan şifreyle giris yapamaz.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Dogru Username bilgilerini girer.
    Then Yanlis password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder
    And  Sayfayi kapatilir.

  @tc_503
  Scenario: tc_503 Kullanici, hata mesaji ile gecersizligi dogrulanan kullanıcı adı ve şifreyle giris yapamaz.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Yanlis Username bilgilerini girer.
    Then Yanlis password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder
    And  Sayfayi kapatilir.

  @tc_504
  Scenario: tc_504 Geçersiz kullanıcı bilgileri ile giriş yapmaya çalışan kullanıcılara şifrelerini sıfırlama seçeneği olarak "Did you forget your password?" linkine tıklar ve "Reset your password" sayfasına yönlendirir
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Yanlis Username bilgilerini girer.
    Then Yanlis password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder
    Then Did you forget your password? linkine tıklanır ve Reset your password sayfasina yönlendirdigini kontrol eder
    And  Sayfayi kapatilir.

  @tc_505
  Scenario: tc_505 Yönlendirilen geçersiz kullanıcı bilgileri ile giriş yapmaya çalışan kullanıcılara email texboxuna kayıtlı emailin yazılması ve reset password butonuna tıklanarak sıfırlama seçeneği sunulmalıdır.
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Yanlis Username bilgilerini girer.
    Then Yanlis password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder
    Then Did you forget your password? linkine tıklanır ve Reset your password sayfasina yönlendirdigini kontrol eder
    Then Email textbox'ına sisteme kayitli email adresi girilir
    Then Reset password butonuna tıklanmasi
    And  Sayfayi kapatilir.


  @tc_506
  Scenario: tc_506 Henüz kaydolmadıysa, kullanıcıya kayıt sayfasına gitme seçeneği verilmelidir
    When Kullanici GmiBank sayfasina gider
    Then SignIn butonuna tiklar.
    Then Yanlis Username bilgilerini girer.
    Then Yanlis password bilgilerini girer.
    Then Singin ekranındaki sing in butonuna tıklar ve hata mesajini kontrol eder
    Then Register a new account linkine tıklanir Registration sayfasina yönlendirdigini kontrol eder
    And  Sayfayi kapatilir.
