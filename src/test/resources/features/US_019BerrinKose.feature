@CreateNewAcountUS19

Feature: Sistem adminin yeni bir banka hesabı oluşturmasına izin vermelidir.


  Background: Kullanici bankasitesine gider
    Given : Kullanici oturum acmak icin admin sayfasina gider
    Then  Kullanici login sayfasinda admin olarak oturum acar
    And Kullanici username kutusuna gecerli kullanici adini girer
    And Kullanici password kutusunaa gecerli sifreyi girer
    And Kullanici signin butonuna tiklar
  @US19_TC01
  Scenario: Kullanici yeni hesap acmak icin aciklama olusturmali ve burayi bos birakmamali
    Given kullanici My Operations butonuna tiklar
    And   kullanici Manage Account butonuna tiklar
    And   kullanici Create a new Account butonuna tiklar
    And   kullanici description kutusuna "MyAccount002" yazar
    And   kullanici balance kutusuna "550" yazar
    And   kullanici Account Type Drop-down kutusundan "CREDIT_CARD" i secer
    And   kullanici Account Status Type Drop-down kutusundan  "ACTIVE"i secer
    And   kullanici Employee Drop-down kutusundan gecerli calisani secer
    And   kullanici Save butonuna basar
    Then  verify transaction yazisini gorur
