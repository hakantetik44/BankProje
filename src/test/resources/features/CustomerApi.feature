@CustomerApi
  Feature: Api Data Okuma
    #https://gmibank.com/api/tp-customers end pointten datalari 12 li olarak alir.
    #https://gmibank.com/api/tp-customers/tp-customers?=size=2000 butun datalari alir
    Background: Api Dataları Ayarlama
      * Kullanici Api end pointe gidecek "https://gmibank.com/api/tp-customers/tp-customers?=size=2000" datalari alacak
      Scenario: Apiden Data Alma ve Onaylama
        * Kullanici musteri datalarını alir
        * Kullanici aldigi datalari kaydeder
        * Kullanici Customer datalarini korur.


