@US_14
Feature: US14 Tarih uygunlugu

  @TC_01
  Scenario: TC01 tarihin gecmis ve ileri tarihte olusturulmamasi

    When kullanici Gmibank anasayfasina gider
    And  Giris butonunaa tiklar
    And Sign in butonunaa tiklar
    And Gecerli bir usarnamee girer
    And Gecerli bir passwordd girer
    And Sign in ekranindaki sign in butonunaa tiklar
    Then My Operations dropdownn a tiklar
    And My Accounts secerr ve tiklar
    Then Create anew Account butonunaa tiklar
    Then Description text boxx i doldurulur
    Then Balance textt Box i doldurulur
    Then Account Type dropdowndann bir hesap tipi secilir
    Then Account Status Type Dropdown dan bir hesapp statu tipi secilir
    Then Create date box undan hesabin olusturuldugu tarihtenn onceki  bir tarih girilir
    And Closed date box una bir tarihh girilir
    Then Savee butonunaa tiklar
    Then kayitt yapilamadigini gorur
    And sayfayi kapatirr

  @TC_02
  Scenario: TC02 tarihin hesap olusturma aniyla ayni olmasi

    When kullanici Gmibank anasayfasina gider
    And  Giris butonunaa tiklar
    And Sign in butonunaa tiklar
    And Gecerli bir usarnamee girer
    And Gecerli bir passwordd girer
    And Sign in ekranindaki sign in butonunaa tiklar
    Then My Operations dropdownn a tiklar
    And My Accounts secerr ve tiklar
    Then Create anew Account butonunaa tiklar
    Then Description text boxx i doldurulur
    Then Balance textt Box i doldurulur
    Then Account Type dropdowndann bir hesap tipi secilir
    Then Account Status Type Dropdown dan bir hesapp statu tipi secilir
    Then Create date box una hesabin olusturuldugu tarihle ayni tarih  girilir
    And Closed date box una hesabin olusturuldugu tarihe uygun bir tarih girilir
    Then Savee butonunaa tiklar
    Then kayit yapilabildigini gorur
    And sayfayi kapatirr

  @TC_03
  Scenario: TC03 tarih girisi olmadan hesabin olusturulamamasi

    When kullanici Gmibank anasayfasina gider
    And  Giris butonunaa tiklar
    And Sign in butonunaa tiklar
    And Gecerli bir usarnamee girer
    And Gecerli bir passwordd girer
    And Sign in ekranindaki sign in butonunaa tiklar
    Then My Operations dropdownn a tiklar
    And My Accounts secerr ve tiklar
    Then Create anew Account butonunaa tiklar
    Then Description text boxx i doldurulur
    Then Balance textt Box i doldurulur
    Then Account Type dropdowndann bir hesap tipi secilir
    Then Account Status Type Dropdown dan bir hesapp statu tipi secilir
    Then Create date box una herhangi bir data girilmez
    And Closed date box una herhangi bir data girilmez
    Then Savee butonunaa tiklar
    Then kayit yapilamadigini gorur
    And sayfayi kapatirr

  @TC_04
  Scenario: TC04 Tarih  gün,ay, yıl, saat ve dakika formatinda oluşturulmalıdır.

    When kullanici Gmibank anasayfasina gider
    And  Giris butonunaa tiklar
    And Sign in butonunaa tiklar
    And Gecerli bir usarnamee girer
    And Gecerli bir passwordd girer
    And Sign in ekranindaki sign in butonunaa tiklar
    Then My Operations dropdownn a tiklar
    And My Accounts secerr ve tiklar
    Then Create anew Account butonunaa tiklar
    Then Description text boxx i doldurulur
    Then Balance textt Box i doldurulur
    Then Account Type dropdowndann bir hesap tipi secilir
    Then Account Status Type Dropdown dan bir hesapp statu tipi secilir
    Then Create date box una gün,ay, yıl, saat ve dakika formatinda tarih girilir
    And Closed date box una gün,ay, yıl, saat ve dakika formatinda tarih girilir
    Then Savee butonunaa tiklar
    Then kayit yapilabildigini gorur
    And sayfayi kapatirr

  @TC_05
  Scenario: TC05 Employee kayitli employee'lerden bir employee secebilmesi

    When kullanici Gmibank anasayfasina gider
    And  Giris butonunaa tiklar
    And Sign in butonunaa tiklar
    And Gecerli bir usarnamee girer
    And Gecerli bir passwordd girer
    And Sign in ekranindaki sign in butonunaa tiklar
    Then My Operations dropdownn a tiklar
    And My Accounts secerr ve tiklar
    Then Create anew Account butonunaa tiklar
    Then Description text boxx i doldurulur
    Then Balance textt Box i doldurulur
    Then Account Type dropdowndann bir hesap tipi secilir
    Then Account Status Type Dropdown dan bir hesapp statu tipi secilir
    Then Create date box una hesabin olusturuldugu tarihle ayni tarih  girilir
    And Closed date box una hesabin olusturuldugu tarihe uygun bir tarih girilir
    And Kullanıcı Employee dropdown'ından bir employee seçer
    Then Savee butonunaa tiklar
    Then kayit yapilamadigini gorur
    And sayfayi kapatirr
