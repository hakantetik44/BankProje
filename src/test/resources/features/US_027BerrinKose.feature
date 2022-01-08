@StatesUS_027
Feature: State Okuma, Olusturma, Guncelleme ve Silme

  @StateOkuma
  Scenario: State Okuma
    * kullanici gmibank apiden "https://www.gmibank.com/api/tp-states" stateleri okur

  @StateOlusturma
  Scenario Outline: State Olusturma
    * kullanici state icin api end point "https://www.gmibank.com/api/tp-states" den "<idJson>" ve "<nameJson>" kullanarak state olusturur

    Examples: state olusturma
      |idJson|nameJson|
      |27518|Virginia|
    # idJson: Country id'si

  @StateGunceleme
  Scenario Outline: State Guncelleme
    * kullanici state icin api end point "https://www.gmibank.com/api/tp-states" den "<id>" ve "<name>" kullanarak guncelleme yapar

    Examples: state guncelleme
      |id|name|
      |22708|BREMENN|
    # id: State id'si


  @StateSilme
  Scenario Outline:  State Silme
    Given kullanici endpoint "<endPoint>" ve id ile "<id>" state siler

    Examples: state silme
      |endPoint|id|
      |https://www.gmibank.com/api/tp-states/|22708|
    # id: State id'si