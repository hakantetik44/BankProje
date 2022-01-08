@US016
Feature: Para transferi yapilabilmelidir.

  Background: GMI Bank sayfasina gidilmesi.
    Given Kullanici "GMIBankUrl" sayfasina giris yapar.
    And Kullanici giris itemine tiklar.

  @TC001_US016
  Scenario Outline: Kullanicinin en az 2 hesabi oldugu gorulmesi.
    And Kullanici username kutusuna gecerli "<username>" girer.
    And Kullanici password kutusuna gecerli "<password>" girer.
    And Kullanici My operation butonuna tıklar.
    And Kullanici My accounts butonuna tiklar.
    And Kullanici Customer Accounts sayfasinda kendisi için tanimlanan en az iki hesap turunu ve bakiyesini gormelidir.
    Then ve sayfa kapanir.
    Examples: Gecerli giris bilgileri
    | username | password |
    | Customer625 | 625Aaa. |
    | Customer26 | 26Aaa. |
    | denek | 25Aaa. |

    @TC002_US016
    Scenario Outline: Kullanici, FROM acilir listesinden ilk hesabi secebilmeli ve TO acilir listesinden baska bir hesabi secebilmelidir.
      And Kullanici username kutusuna gecerli "<username>" girer.
      And Kullanici password kutusuna gecerli "<password>" girer.
      And Kullanici My operation butonuna tıklar.
      And Kullanici Transfer Money butonuna tıklar.
      And Kullanici From sekmesinden transfer yapacagi hesabi secebilmelidir.
      And Kullanici To sekmesinden transferin yapilacagi hesabi secebilmelidir.
      Then ve sayfa kapanir.
      Examples: Gecerli giris bilgileri
      |username | password|
      |Customer625| 625Aaa.|

    @TC003_US016
    Scenario Outline: Kullanici, devam etmek istedigi bir bakiye secebilir.
      And Kullanici username kutusuna gecerli "<username>" girer.
      And Kullanici password kutusuna gecerli "<password>" girer.
      And Kullanici My operation butonuna tıklar.
      And Kullanici Transfer Money butonuna tıklar.
      And Kullanici Balance kutusuna transfer etmek istedigi "<balance>"miktarini girer.
      Then ve sayfa kapanir.
      Examples: Gecerli bilgiler
        |username | password| balance|
        |Customer625| 625Aaa.| 500   |

    @TC004_US016
    Scenario Outline: Kullanici, devam etmek istedigi bir bakiye secebilir.
    And Kullanici username kutusuna gecerli "<username>" girer.
    And Kullanici password kutusuna gecerli "<password>" girer.
    And Kullanici My operation butonuna tıklar.
    And Kullanici Transfer Money butonuna tıklar.
    And Kullanici Description kutusuna transfer islemi icin "<description>" girer.
    Then ve sayfa kapanir.
    Examples: Gecerli bilgiler
      |username | password| description|
      |Customer625| 625Aaa.| Deneme   |

    @TC005_US016
    Scenario Outline: Kullanici, transferin basariyla yapildigindan emin olabilir.
      And Kullanici username kutusuna gecerli "<username>" girer.
      And Kullanici password kutusuna gecerli "<password>" girer.
      And Kullanici My operation butonuna tıklar.
      And Kullanici Transfer Money butonuna tıklar.
      And Kullanici From sekmesinden transfer yapacagi hesabi secebilmelidir.
      And Kullanici To sekmesinden transferin yapilacagi hesabi secebilmelidir.
      And Kullanici Balance kutusuna transfer etmek istedigi para "<balance>" miktarini girer.
      And Kullanici Description kutusuna transfer islemi icin aciklama "<description>"girer.
      And Kullanici MakeTransfer butonuna tiklar.
      And Kullanici paranin transfer edildigine dair basari mesajini gormelidir.
      Then ve sayfa kapanir.
      Examples: Gecerli bilgiler
      |username|password|balance|description|
      |Customer625|625Aaa.|500  |deneme     |

    @TC006_US016
    Scenario Outline: Kullanici, transferin yapilamadigindan emin olabilir.
     And Kullanici username kutusuna gecerli "<username>" girer.
     And Kullanici password kutusuna gecerli "<password>" girer.
     And Kullanici My operation butonuna tıklar.
     And Kullanici Transfer Money butonuna tıklar.
     And Kullanici From sekmesinden transfer yapacagi hesabi secebilmelidir.
     And Kullanici To sekmesinden transferin yapilacagi hesabi secebilmelidir.
     And Kullanici Balance kutusuna transfer etmek istedigi para "<balance>" miktarini girer.
     And Kullanici Description kutusuna transfer islemi icin aciklama "<description>"girer.
     And Kullanici MakeTransfer butonuna tiklar.
     And Kullanici paranin transfer edilemedigine dair uyari mesajini gormelidir.
     Then ve sayfa kapanir.
    Examples: Gecerli bilgiler
      |username|password|balance|description|
      |Customer625|625Aaa.|10000|deneme  |


