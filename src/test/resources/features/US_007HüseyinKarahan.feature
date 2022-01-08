
    #feature US dir.

Feature: US_007_Sistem, geçersiz kimlik bilgileriyle güncelleme yapılmasına izin vermemelidir.

  #test case
  @US_007_TC001
  Scenario:US_007_TC_001_E-posta adresi, "@" veya "." isaretleri olmadan yalnızca rakam veya karakter iceremez.

    Given Kullanici URL ye tiklayarak gmibank  sayfasina gider
    And Kullanici menu sayfasinda person simgesine tiklar
    And Kullanici person simgesinin altinda ki sign in sign in a tiklar
    And Kullanici gecerli bir kullanici adi girer
    And Kullanici gecerli bir sifre girer
    And Kullanici oturum acmak icin sign in button una tiklar
    And Kullanici Olusturdugu hesap menusune tiklar
    And Kullanici Hesap menusunde user info iconuna tiklar
    And Kullanici yeni geceersiz @ ve . isareti olmadan e-posta adresini girer
    And Kullanici save basar
    And Kullanici hata mesajini dogrular

  @US_007_TC002
  Scenario: İngilizce veya turkce disinda baska bir dil secenegi olmamalıdır.

    Given Kullanici URL ye tiklayarak gmibank  sayfasina gider
    And  Kullanici menu sayfasinda person simgesine tiklar
    And  Kullanici person simgesinin altinda ki sign in sign in a tiklar
    And  Kullanici gecerli bir kullanici adi girer
    And  Kullanici gecerli bir sifre girer
    And  Kullanici oturum acmak icin sign in button una tiklar
    And  Kullanici Olusturdugu hesap menusune tiklar
    And  Kullanici Hesap menusunde user info iconuna tiklar