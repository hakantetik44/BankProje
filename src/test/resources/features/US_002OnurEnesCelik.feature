@US002
Feature: Sistem Register sayfasinda gecersiz karakterlerle kayit yapan herhangi birine izin vermemelidir
  Background:
    Given kullanici "gmibank" sayfasina giris yapar
    And LogIn simgesi gorunur hale gelir ve tiklar
    Then SignIn ve Register seceneklerini gorur ve Register secenegine tiklar
    Then Acilan sayfanin Register oldugunu dogrular ve sayfadaki elementleri kontrol eder
  @US002_TC01
  Scenario Outline: SSN numara formati ###-##-#### seklinde olmali ve sadece - ozel karakteri kullanilabilir
    And SSN box'a tiklar ve gecersiz "<SSN>" bilgisini girer
    Then First name box'a tiklar
    Examples: SSN icin test datalari
      | SSN |
      |123#00#6789|
      |12r-45-6q89|
      |123^43^6893|
      |125$53!3689|
  @US002_TC02
  Scenario Outline: First name sadece karakter icermeli aksi takdirde uyari vermeli
    And Kullanici first name box'a tiklar ve gecersiz "<first name>" bilgisini girer
    Then Ardindan Last name box'a tiklar
    Examples:
      | first name |
      |Onur123  |
      |xyzq@#   |
      |6^       |
      |END%122  |
  @US002_TC03
  Scenario Outline: Gecersiz Last name sadece ozel karakter icermemelidir aksi takdirde uyari vermelidir
    And Kullanici last name box'a tiklar ve gecersiz "<last name>" bilgisini girer
    Then Ardindan Adress name box'a tiklar
    Examples:
      | last name |
      |Celik12   |
      |amozon@#  |
      |ifews!1wq |
      |P%        |
  @US002_TC04
  Scenario: gecersiz bir adresi tanimlamak icin ozel karakter kullanilabilmelidir.
    And Kullanici adress box'a tiklar ve gecersiz "34%#" bilgisini girer
    Then Ardindan Phone number box'a tiklar
  @US002_TC05
  Scenario Outline: Kullanici - phone number isareti disinda baska karakter kullanamamali ve  10 hane disinda sistemin kabul etmemesi gerekir
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formati disinda gecersiz  "<phone number>" bilgisini girer
    Then Ardindan Username box'a tiklar
    Examples:
      | phone number |
      |222$111$4000  |
      |111@000%0000  |
      |000*936&7564  |
  @US002_TC06
  Scenario Outline:Kullanici Username box'a karakter veya karakter ve rakam kullanmak disinda baska bir formatta kayit yapamamali
    And Kullanici Username box'a tiklar ve gecersiz "<username>" bilgisini girer
    Then Ardindan Email box'a tiklar
    Examples:
      | username  |
      |istan2#    |
      |@          |
      |^dwfef1    |
      |perf##rue07|
      |           |
  @US002_TC07
  Scenario: Kullanici Email box'a gecersiz formatta mail adresi girmeli bunun yaninda '@' ve '.' karakterlerini icermemeli
    And Kullanici Email box'a tiklar ve gecersiz "gmibank01com" bilgisini girer
    Then Ardindan new password boxa tiklar
  @US002_TC08
  Scenario Outline: Kullanici en az 7 haneli ve buyuk harf, rakam, ozel karakter, kucuk harf formatlarinin tam anlamiyla kullanmadan giris yapamamalidir
    And Kullanici new password box'a tiklar ve gecersiz "<password>" bilgisini girer
    Then Ardindan new password confirmation box'a tiklar
    Examples:
      | password |
      |Ph4#  |
      |#yr2% |
      |@My24#|
      |otX#/ |
  @US002_TC09
  Scenario Outline: Kullanici en az 7 haneli ve buyuk harf, rakam, ozel karakter, kucuk harf ve fistpassword ile ayni olmali formatlarinin tam anlamiyla kullanmadan giris yapamamalidir
    And Kullanici new password confirmation box'a tiklar ve gecersiz "<confirmpassword>" bilgisini girer
    Then Ardindan new password  box'a tiklar
    Examples:
      | confirmpassword |
      |Ph4#  |
      |#yr2% |
      |@My24#|
      |otX#/ |
  @US002_TC10
  Scenario Outline: Kullanici Registration sayfasinda bulunan bilgileri gecerli formata girerek kayit yapabilmeli
    And SSN box'a tiklar ve gecersiz "<SSN>" bilgisini girer.
    And Kullanici first name box'a tiklar ve gecersiz "<first name>" bilgisi girer.
    And Kullanici last name box'a tiklar ve gecersiz "<last name>" bilgisi girer.
    And Kullanici adress box'a tiklar ve gecersiz "34%#" bilgisi girer.
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formati disinda gecersiz  "<phone number>" bilgisi girer.
    And Kullanici Username box'a tiklar ve gecersiz "<username>" bilgisi girer.
    And Kullanici Email box'a tiklar ve gecersiz "gmibank01com" bilgisi girer.
    And Kullanici new password box'a tiklar ve gecersiz "<password>" bilgisi girer.
    And Kullanici new password confirmation box'a tiklar ve gecersiz "<confirmpassword>" bilgisi girer.
    Then Kullanici register butonuna click yapar.
    Examples:
      | SSN       | first name | last name | phone number | username | password | confirmpassword |
      |123^43^6893|  xyzq@#    |  amozon@# | 222$111$4000 |istan2#   |Ph4#      |   Ph4#          |
  @US002_TC11
  Scenario Outline:Kullanici Registration sayfasinda bulunan bilgilere gecerli ve unique ifadeler girmeli
    Given SSN box'a tiklar ve unique olmayan "<SSN>" bilgisi girer.
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    And Kullanici adress box'a tiklar ve gecerli adress bilgisi girer
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  "<phone number>" bilgisini girer
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    And Kullanici Email box'a tiklar ve gecerli email bilgisi girer
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Kullanici Register Butonuna click yaparr
    Then Sistem tarafindan mevcut ssn hatasi alir
    Examples:
      | SSN       | first name | last name | phone number | username | password | confirmpassword |
      |842-73-9072| OnurE      |  Celkl    | 222-111-4000 |istanbul9 |PhMyr24#  |   PhMyr24#      |
  @US002_TC12
  Scenario Outline:Kullanici Registration sayfasinda bulunan bilgilere gecerli ve unique ifadeler girmeli
    Given SSN box'a tiklar ve unique olmayan "<SSN>" bilgisi girer.
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    And Kullanici adress box'a tiklar ve gecerli adress bilgisi girer
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    And Kullanici Email box'a tiklar ve gecerli email bilgisi girer
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Kullanici Register Butonuna click yaparr
    Then Sistem tarafindan Phone Number hatasi alir
    Examples:
      | SSN       | first name | last name  | username | password | confirmpassword |
      |472-69-2742| OnurE      |  Celkl    |istanbul9 |PhMyr24#  |   PhMyr24#      |
  @US002_TC13
  Scenario Outline:Kullanici Registration sayfasinda bulunan bilgilere gecerli ve unique ifadeler girmeli
    Given SSN box'a tiklar ve unique olmayan "<SSN>" bilgisi girer.
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    And Kullanici adress box'a tiklar ve gecerli adress bilgisi girer
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  "<phone number>" bilgisini girer
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    And Kullanici Email box'a tiklar ve gecerli olmayan "Email.com" bilgisi girer
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Kullanici Register Butonuna click yaparr
    Then Sistem tarafindan Email hatasi alir
    Examples:
      | SSN       | first name | last name|phone number  | username | password | confirmpassword |
      |472-69-2742| OnurE      |  Celkl   |  222-111-4000 |istanbul9 |PhMyr24#  |   PhMyr24#      |