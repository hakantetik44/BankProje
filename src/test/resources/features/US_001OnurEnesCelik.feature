@US001 @smoke
Feature: Sistem kullanicinin gecerli kimlik bilgilerini basari mesaji ile dogrulayarak kaydolmasina izin vermeli
  Background:
    Given kullanici "gmibank" sayfasina giris yapar
    And LogIn simgesi gorunur hale gelir ve tiklar
    Then SignIn ve Register seceneklerini gorur ve Register secenegine tiklar
    Then Acilan sayfanin Register oldugunu dogrular ve sayfadaki elementleri kontrol eder
  @US001_TC01
  Scenario Outline: SSN numara formati ###-##-#### seklinde ve 9 haneli olmalidir
    And SSN box'a tiklar ve gecerli "<SSN>" bilgisini girer
    Then First name box'a tiklar
    Examples: SSN icin test datalari
      | SSN |
      |123-00-6789|
      |123-45-6789|
      |234-56-7891|
      |345-45-6789|
      |456-78-9123|
      |567-89-1234|
      |678-91-2345|
      |666-45-6789|
      |789-12-3456|
      |891-23-4567|
      |912-34-5678|
  @US001_TC02
  Scenario Outline: First name sadece karakter icermeli ve bos birakilmamalidir
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    Then Ardindan Last name box'a tiklar
    Examples:
      | first name |
      |OnurEnes  |
      |xyzqprQddq|
      |P         |
      |celik     |
  @US001_TC03
  Scenario Outline: Last name sadece karakter icermeli ve bos birakilmamalidir
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    Then Ardindan Adress name box'a tiklar
    Examples:
      | last name |
      |Celik     |
      |amozon    |
      |ifewsCCEwq|
      |P         |
  @US001_TC04
  Scenario: Posta koduyla birlikte gecerli bir adresi tanimlamak icin harfler ve rakamlar kullanilabilmelidir.
    And Kullanici adress box'a tiklar ve gecerli adress bilgisini girer
    Then Ardindan Phone number box'a tiklar
  @US001_TC05
  Scenario Outline: Kullanici - isaretine uygun olarak 10 haneli zorunlu telefon numarasi alanini doldurmalidir
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  "<phone number>" bilgisini girer
    Then Ardindan Username box'a tiklar
    Examples:
      | phone number |
      |222-111-4000  |
      |111-000-0000  |
      |000-936-7564  |
      |123-453-6789  |
      |234-564-7891  |
      |345-450-6789  |
      |456-781-9123  |
      |567-891-1234  |
      |678-913-2345  |
      |789-124-3456  |
      |891-230-4567  |
      |912-349-5678  |
  @US001_TC06
  Scenario Outline:Kullanici Username box'a sadece karakter veya karakter ve rakam kullanabilir ve bos birakilmamalidir
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    Then Ardindan Email box'a tiklar
    Examples:
      | username |
      |istanbul  |
      |a         |
      |abc12     |
      |perfnrue07|
  @US001_TC07
  Scenario: Kullanici Email box'a gecerli mail adresi girmeli bunun yaninda '@' ve '.' karakterlerini icermeli ve de bos birakilmamalidir
    And Kullanici Email box'a tiklar ve gecerli email bilgisini girer
    Then Ardindan new password boxa tiklar
  @US001_TC08
  Scenario Outline: Kullanici en az 7 haneli ve buyuk harf, rakam, ozel karakter, kucuk harf icermelidir
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    Then Ardindan new password confirmation box'a tiklar
    Examples:
      | password |
      |PhMyr24#  |
      |#PhMyr24% |
      |@PhMyr24# |
      |oteXo29#/ |
  @US001_TC09
  Scenario Outline: Kullanici en az 7 haneli ve buyuk harf, rakam, ozel karakter, kucuk harf icermelidir
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Ardindan new password  box'a tiklar
    Examples:
      | confirmpassword |
      |PhMyr24#  |
      |#PhMyr24% |
      |@PhMyr24# |
      |oteXo29#/ |
  @US001_TC10
  Scenario Outline: Kullanici Registration sayfasinda bulunan bilgileri gecerli formata girerek kayit yapabilmeli
    And SSN box'a tiklar ve gecerli "<SSN>" bilgisini girer
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    And Kullanici adress box'a tiklar ve gecerli adress bilgisi girer
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  "<phone number>" bilgisini girer
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    And Kullanici Email box'a tiklar ve gecerli email bilgisi girer
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Kullanici register butonuna click yapar
    Examples:
      | SSN       | first name | last name | phone number | username | password | confirmpassword |
      |123-10-6019|  OnurEnes7 |  Celk4    | 222-111-4000 |istanbul4 |#PhMyr24% |   #PhMyr24%     |
  @US001_TC11
  Scenario Outline: Kullanici Registration sayfasinda bulunan bilgileri gecerli formatta girerek kayit yapabilmeli
    And SSN box'a tiklar ve gecerli "<SSN>" bilgisini girer
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    And Kullanici adress box'a tiklar ve gecerli adress bilgisi girer
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  "<phone number>" bilgisini girer
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    And Kullanici Email box'a tiklar ve gecerli email bilgisi girer
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Kullanici register butonuna click yapar
    Examples:
      | SSN       | first name | last name | phone number | username | password | confirmpassword |
      |912-04-5078| xyzqprQdda |    L      | 000-936-7564 |perfnrue08|#PhMyr24% |   #PhMyr24%     |
  @US001_TC12
  Scenario Outline: Kullanici Registration sayfasinda bulunan bilgileri gecerli formatta girerek kayit yapabilmelidir
    And SSN box'a tiklar ve gecerli "<SSN>" bilgisini girer
    And Kullanici first name box'a tiklar ve gecerli "<first name>" bilgisini girer
    And Kullanici last name box'a tiklar ve gecerli "<last name>" bilgisini girer
    And Kullanici adress box'a tiklar ve gecerli adress bilgisi girer
    And Kullanici Phone number box'a tiklar ve aaa-aaa-aaaa formatinda gecerli  "<phone number>" bilgisini girer
    And Kullanici Username box'a tiklar ve gecerli "<username>" bilgisini girer
    And Kullanici Email box'a tiklar ve gecerli email bilgisi girer
    And Kullanici new password box'a tiklar ve gecerli "<password>" bilgisini girer
    And Kullanici new password confirmation box'a tiklar ve gecerli "<confirmpassword>" bilgisini girer
    Then Kullanici register butonuna click yapar
    Examples:
      | SSN       | first name | last name | phone number | username | password | confirmpassword |
      |129-45-1318|  Okurk     |  Culkl    | 222-111-4000 |iskanbum9 |PhMyr24# |   PhMyr24#       |
