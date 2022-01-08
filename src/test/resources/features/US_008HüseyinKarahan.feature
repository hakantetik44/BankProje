Feature: US_008_TC001_sifre degistirilirken eski sifre kullanilmamalidir.

  @US_008_TC001
  Scenario:TC_001_ Ana sayfadaki sifre bolumu guncellenebilir olmalıdır.


    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici kaydet ikonuna tiklar.
    Then Kullanici sifrenin basariyla degistigini  gorur


  @US_008_TC002
  Scenario: TC_002_ karakter kontrol
    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali
    And Kullanici kaydet ikonuna tiklar.


  @US_008_TC003
  Scenario: TC_002_ karakter kontrol
    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali
    And Kullanici kaydet ikonuna tiklar.

  @US_008_TC004
  Scenario:TC_002_ karakter kontrol
    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali
    And Kullanici kaydet ikonuna tiklar.

  @US_008_TC005
  Scenario:TC_002_ karakter kontrol
    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali
    And Kullanici kaydet ikonuna tiklar.

  @US_008_TC006
  Scenario:TC_002_ karakter kontrol
    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali
    And Kullanici kaydet ikonuna tiklar.

  @US_008_TC007
  Scenario:TC_002_ karakter kontrol
    Given Kullanici gmibank sayfasina gider
    And Kullanici ana menudeki person Simgesine tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli kullanici adini girer
    And Kullanici gecerli sifreyi girer
    And Kullanici oturum ac dugmesine Sign in e tiklar
    And Kullanici kullanici menusu simgesine tiklatir
    And Kullanici password ikonuna  tiklar
    And Kullanici mevcut sifreyi (currant password)  girer
    And Kullanici  gecerli yeni sifreyi girer
    And Kullanici yeni sifre onaylar.
    And Kullanici Sifreyi Buyuk harf, kucuk harf, rakam, noktalama isaretleri, kullanarak olusturmali
    And Kullanici kaydet ikonuna tiklar.
    And Sifre Dogrulandi yazisini dogrula