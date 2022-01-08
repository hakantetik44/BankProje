@UserStory_004
Feature: Login page
  @US_004-01
  Scenario:US_004 TC_01 Giriş yapmak için başarı mesajıyla doğrulanan geçerli bir kullanıcı adı ve şifre sağlanmalıdır
    Given Kullanici bankasitesine gider
    Given Kullanici account butonuna tiklar
    Given Kullanici login butonuna tiklar
    Given Kullanici username kutusuna gecerli kullanici ismini girer
    Given Kullanici password kutusuna gecerli sifreyi girer
    Then Kullanicinin oturum actigini dogrular

  @US_004-02
  Scenario:US_004 TC_02 Login sayfasında girişi iptal eden "cancel" seçeneği de olmalıdır.
    Given Kullanici bankasitesine gider
    And Kullanici account butonuna tiklar
    And Kullanici signout butonuna tiklar
    And Kullanici account butonuna tiklar
    Given Kullanici login butonuna tiklar
    And Kullanici cancel butonuna tiklar
    Then Kullanicinin girisi iptal ettigini dogrular