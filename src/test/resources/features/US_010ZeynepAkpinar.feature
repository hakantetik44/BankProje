@US010
Feature: US010 Musteri adresi olusturulabilmelidir

  Background: GMI Bank'tan Create or edit a Customer sayfasina gidilmesi.
    When Kullanici gmibank sayfasina gider ve basarili bir sekilde employee girisi yapar.
    And Kullanici my operation butonuna tıklar.
    And Kullanici manage customers butonuna tıklar.
    And Kullanici create a new customers butonuna tıklar.

  @TC001_US010
  Scenario: TC001 Musteri adresi girebilmelidir ve bos birakamamalidir.
    And Kullanici address girmezse hata mesaji gormelidir.
    And Kullanici address girer.
    Then ve sayfa kapanir.

  @TC002_US010
  Scenario: TC002 Musteri city girebilmeli ve bos birakamamalidir.
    And Kullanici city girmezse hata mesaji gormelidir.
    And Kullanici city girer.
    Then ve sayfa kapanir.

  @TC003_US010
  Scenario: TC003 Musteri ulke girmeli ve bos birakamamalidir
    And Kullanici country secebilmelidir.
    And Kullanici country secmezse hata mesaji gormelidir.
    Then ve sayfa kapanir.

  @TC004_US010
  Scenario: TC004 Musteri State'i sadece USA stateleri olarak girmeli ve bos birakamamalidir.
    And Kullanici country olarak USA secmis ise state testboxa state girmelidir.
    And Kullanici county olarak USA disinda bir sey secti ise state textbox a tiklayamamalidir.
    And Kullanici state girmezse hata mesaji almalidir.
    Then ve sayfa kapanir.



